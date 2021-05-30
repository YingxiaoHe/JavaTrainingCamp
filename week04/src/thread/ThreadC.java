package thread;

import java.util.concurrent.Callable;

public class ThreadC implements Callable<String> {

    @Override
    public String call() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Thread C");
        return "Thread C";
    }
}
