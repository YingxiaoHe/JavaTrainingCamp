package atomic;

public class AtomicMain {

    public static void main(String[] args) {
        final SyncCount syncCount = new SyncCount();
        final UnSafeCount unSafeCount = new UnSafeCount();
        AtomicIntegerCount atomicIntegerCount = new AtomicIntegerCount();

        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    syncCount.add();
                    unSafeCount.add();
                    atomicIntegerCount.add();
                }
            }).start();
        }

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("sum=" + syncCount.getNum());
        System.out.println("unsafeSum=" + unSafeCount.getNum());
        System.out.println("atomicIntegerCount=" + unSafeCount.getNum());
    }

    /**
     * sum=1000
     * unsafeSum=1000
     * atomicIntegerCount=1000
     */
}
