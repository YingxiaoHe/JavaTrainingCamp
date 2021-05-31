package atomic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncCount {

    private int num = 0;

    private Lock lock = new ReentrantLock(true);

    public int add() {
        //阿里代码规范插件提示：
        //在使用阻塞等待获取锁的方式中，必须在try代码块之外，并且在加锁方法与try代码块之间没有任何可能抛出异常的方法调用，避免加锁成功后，在finally中无法解锁。
        //说明一：如果在lock方法与try代码块之间的方法调用抛出异常，那么无法解锁，造成其它线程无法成功获取锁。
        //说明二：如果lock方法在try代码块之内，可能由于其它方法抛出异常，导致在finally代码块中，unlock对未加锁的对象解锁，它会调用AQS的tryRelease方法（取决于具体实现类），抛出IllegalMonitorStateException异常。
        //说明三：在Lock对象的lock方法实现中可能抛出unchecked异常，产生的后果与说明二相同。 java.concurrent.LockShouldWithTryFinallyRule.rule.desc
        lock.lock();
        try {
            return num++;
        } finally {
            lock.unlock();
        }
    }

    public int getNum() {
        return num;
    }
}
