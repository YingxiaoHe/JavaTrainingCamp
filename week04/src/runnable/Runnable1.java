package runnable;

public class Runnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("runnable.Runnable1————————" + i);
        }
    }
}
