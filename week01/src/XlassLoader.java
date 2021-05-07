import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class XlassLoader extends ClassLoader {

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = new XlassLoader();
        // 加载Hello.xlass
        Class<?> clazz = classLoader.loadClass("Hello");
        // 调用Hello.xlass中的所有方法
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println("-----------------------");
            System.out.println(clazz.getSimpleName() + "." + m.getName());
            Object instance = clazz.getDeclaredConstructor().newInstance();
            Method method = clazz.getMethod(m.getName());
            method.invoke(instance);
        }
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(name + ".xlass");
        try {
            int length = inputStream.available();
            byte[] byteArray = new byte[length];
            inputStream.read(byteArray);
            byte[] classBytes = decode(byteArray);
            return defineClass(name, classBytes, 0, classBytes.length);
        } catch (Exception e) {
            throw new ClassNotFoundException(name, e);
        } finally {
            close(inputStream);
        }
    }

    /**
     * 解码
     */
    private static byte[] decode(byte[] byteArray) {
        byte[] targetArray = new byte[byteArray.length];
        for (int i = 0; i < byteArray.length; i++) {
            targetArray[i] = (byte) (255 - byteArray[i]);
        }
        return targetArray;
    }

    /**
     * 关闭流
     */
    private static void close(Closeable res) {
        if (res != null) {
            try {
                res.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
