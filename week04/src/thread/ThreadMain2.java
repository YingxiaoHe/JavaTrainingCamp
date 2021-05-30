package thread;

public class ThreadMain2 {

    public static void main(String[] args) {

        ThreadB threadB = new ThreadB();
        for (int i = 0; i < 5; i++) {
            new Thread(threadB, "线程名：（" + i + "）").start();
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        //返回对当前正在执行的线程对象的引用
        Thread threadMain = Thread.currentThread();
        System.out.println("这是主线程");
        System.out.println("返回当前线程组中活动线程的数目：" + Thread.activeCount());
        System.out.println("主线程的名称：" + threadMain.getName());
        System.out.println("返回该线程的标识符：" + threadMain.getId());
        System.out.println("返回线程的优先级：" + threadMain.getPriority());
        System.out.println("返回线程的状态：" + threadMain.getState());
        System.out.println("返回该线程所属的线程组：" + threadMain.getThreadGroup());
        System.out.println("测试线程是否为守护线程：" + threadMain.isDaemon());
    }

    /**
     * Thread B
     * Thread B
     * 线程名称：线程名：（4）
     * Thread B
     * 返回当前线程线程名：（4）的线程组中活动线程的数量:7
     * Thread B
     * Thread B
     * 线程名称：线程名：（2）
     * 返回当前线程线程名：（2）的线程组中活动线程的数量:7
     * 返回该线程线程名：（2）的标识符:14
     * 线程名称：线程名：（0）
     * 返回当前线程线程名：（0）的线程组中活动线程的数量:7
     * 返回该线程线程名：（0）的标识符:12
     * 返回该线程线程名：（0）的优先级:5
     * 返回该线程线程名：（4）的标识符:16
     * 返回该线程线程名：（4）的优先级:5
     * 线程名称：线程名：（3）
     * 线程名称：线程名：（1）
     * 返回该线程线程名：（4）的状态:RUNNABLE
     * 返回当前线程线程名：（1）的线程组中活动线程的数量:7
     * 返回该线程线程名：（1）的标识符:13
     * 返回该线程线程名：（1）的优先级:5
     * 返回该线程线程名：（1）的状态:RUNNABLE
     * 返回该线程线程名：（1）所属的线程组:java.lang.ThreadGroup[name=main,maxpri=10]
     * 返回该线程线程名：（0）的状态:RUNNABLE
     * 返回当前线程线程名：（3）的线程组中活动线程的数量:7
     * 返回该线程线程名：（0）所属的线程组:java.lang.ThreadGroup[name=main,maxpri=10]
     * 测试该线程线程名：（0）是否处于活跃状态:true
     * 返回该线程线程名：（2）的优先级:5
     * 返回该线程线程名：（2）的状态:RUNNABLE
     * 返回该线程线程名：（2）所属的线程组:java.lang.ThreadGroup[name=main,maxpri=10]
     * 测试该线程线程名：（2）是否处于活跃状态:true
     * 测试该线程线程名：（2）是否为守护线程:false
     * 测试该线程线程名：（0）是否为守护线程:false
     * 返回该线程线程名：（3）的标识符:15
     * 测试该线程线程名：（1）是否处于活跃状态:true
     * 测试该线程线程名：（1）是否为守护线程:false
     * 返回该线程线程名：（4）所属的线程组:java.lang.ThreadGroup[name=main,maxpri=10]
     * 测试该线程线程名：（4）是否处于活跃状态:true
     * 测试该线程线程名：（4）是否为守护线程:false
     * 返回该线程线程名：（3）的优先级:5
     * 返回该线程线程名：（3）的状态:RUNNABLE
     * 返回该线程线程名：（3）所属的线程组:java.lang.ThreadGroup[name=main,maxpri=10]
     * 测试该线程线程名：（3）是否处于活跃状态:true
     * 测试该线程线程名：（3）是否为守护线程:false
     * 这是主线程
     * 返回当前线程组中活动线程的数目：2
     * 主线程的名称：main
     * 返回该线程的标识符：1
     * 返回线程的优先级：5
     * 返回线程的状态：RUNNABLE
     * 返回该线程所属的线程组：java.lang.ThreadGroup[name=main,maxpri=10]
     * 测试线程是否为守护线程：false
     */
}
