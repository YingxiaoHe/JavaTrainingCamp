package atomic;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class LongMain {

    public static void main(String[] args) {
        final AtomicLong atomicLong = new AtomicLong();
        final LongAdder longAdder = new LongAdder();

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        atomicLong.getAndIncrement();
                        longAdder.increment();
                    }
                }
            }).start();
        }

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("atomicLong:" + atomicLong.get());
        System.out.println("longAdder:" + longAdder.sum());
    }

    /**
     * atomicLong:10000
     * longAdder:10000
     */

}
