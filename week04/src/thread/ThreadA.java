package thread;

public class ThreadA extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thread A");
    }
}
