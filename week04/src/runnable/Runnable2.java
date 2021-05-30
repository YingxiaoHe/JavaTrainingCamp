package runnable;

public class Runnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("runnable.Runnable2————————" + i);
        }
    }
}
