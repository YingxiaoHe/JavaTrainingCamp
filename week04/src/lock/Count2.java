package lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Count2 {

    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void get() {
        //读锁
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " get begin");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " get end");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public void put() {
        //写锁
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " put begin");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " put end");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
}
