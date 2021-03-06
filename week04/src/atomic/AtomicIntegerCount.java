package atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerCount {

    private AtomicInteger num = new AtomicInteger();

    public int add() {
        return num.getAndIncrement();
    }

    public int getNum() {
        return num.get();
    }
}
