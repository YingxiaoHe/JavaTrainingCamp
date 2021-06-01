package lock;

import java.util.concurrent.locks.LockSupport;

public class LockSupportMain {

    public static Object o = new Object();
    static ChangeObjectThread thread1 = new ChangeObjectThread("thread1");
    static ChangeObjectThread thread2 = new ChangeObjectThread("thread2");

    public static class ChangeObjectThread extends Thread {
        public ChangeObjectThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (o) {
                System.out.println("in " + getName());
                LockSupport.park();
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("被中断了");
                }
                System.out.println("继续执行");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        thread1.start();
        Thread.sleep(1000L);
        thread2.start();
        Thread.sleep(3000L);
        thread1.interrupt();
        LockSupport.unpark(thread2);
        thread1.join();
        thread2.join();
    }
}
