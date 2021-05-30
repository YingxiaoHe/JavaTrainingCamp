package runnable;

public class RunnableMain {

    public static void main(String[] args) {
        Runnable1 runnable1 = new Runnable1();
        Thread thread1 = new Thread(runnable1);

        Runnable2 runnable2 = new Runnable2();
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        //中断thread2
        thread2.interrupt();

        System.out.println("activeCount:" + Thread.activeCount());

        Thread.currentThread().getThreadGroup().list();
        System.out.println("activeGroupCount:" + Thread.currentThread().getThreadGroup().getParent().activeGroupCount());
        Thread.currentThread().getThreadGroup().getParent().list();
        System.out.println("activeGroupCount:" + Thread.currentThread().getThreadGroup().getParent().activeGroupCount());
    }

}
