package thread;

public class ThreadMain2 {

    public static void main(String[] args) {

        ThreadB threadB = new ThreadB();
        for (int i = 0; i < 5; i++) {
            new Thread(threadB, "线程 " + i).start();
        }

        try {
            Thread.sleep(5000);
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
     * 线程名称：线程 1
     * Thread B
     * 线程名称：线程 3
     * Thread B
     * 线程名称：线程 2
     * Thread B
     * 返回当前线程线程 2的线程组中活动线程的数量:7
     * 返回当前线程线程 3的线程组中活动线程的数量:7
     * 返回当前线程线程 1的线程组中活动线程的数量:7
     * 返回该线程线程 1的标识符:13
     * 返回该线程线程 1的优先级:5
     * 线程名称：线程 4
     * 返回该线程线程 3的标识符:15
     * 返回该线程线程 3的优先级:5
     * 返回该线程线程 2的标识符:14
     * 返回该线程线程 2的优先级:5
     * 线程名称：线程 0
     * 返回该线程线程 1的状态:RUNNABLE
     * 返回该线程线程 3的状态:RUNNABLE
     * 返回该线程线程 2的状态:RUNNABLE
     * 返回当前线程线程 4的线程组中活动线程的数量:7
     * 返回该线程线程 4的标识符:16
     * 返回该线程线程 4的优先级:5
     * 返回该线程线程 4的状态:RUNNABLE
     * 返回该线程线程 2所属的线程组:java.lang.ThreadGroup[name=main,maxpri=10]
     * 返回该线程线程 1所属的线程组:java.lang.ThreadGroup[name=main,maxpri=10]
     * 测试该线程线程 2是否处于活跃状态:true
     * 测试该线程线程 2是否为守护线程:false
     * 返回该线程线程 3所属的线程组:java.lang.ThreadGroup[name=main,maxpri=10]
     * 测试该线程线程 3是否处于活跃状态:true
     * 测试该线程线程 3是否为守护线程:false
     * 返回当前线程线程 0的线程组中活动线程的数量:7
     * 测试该线程线程 1是否处于活跃状态:true
     * 测试该线程线程 1是否为守护线程:false
     * 返回该线程线程 4所属的线程组:java.lang.ThreadGroup[name=main,maxpri=10]
     * 测试该线程线程 4是否处于活跃状态:true
     * 返回该线程线程 0的标识符:12
     * 返回该线程线程 0的优先级:5
     * 返回该线程线程 0的状态:RUNNABLE
     * 测试该线程线程 4是否为守护线程:false
     * 返回该线程线程 0所属的线程组:java.lang.ThreadGroup[name=main,maxpri=10]
     * 测试该线程线程 0是否处于活跃状态:true
     * 测试该线程线程 0是否为守护线程:false
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
