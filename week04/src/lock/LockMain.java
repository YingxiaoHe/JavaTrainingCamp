package lock;

public class LockMain {

    public static void main(String[] args) {
        Count3 count3 = new Count3();
        ThreadA threadA = new ThreadA(count3);
        threadA.setName("线程A");
        threadA.start();
        System.out.println(count3.num);

        ThreadB threadB = new ThreadB(count3);
        threadB.setName("线程B");
        threadB.start();
        System.out.println(count3.num);

        try {
            Thread.sleep(1000);
            System.out.println(count3.num);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
