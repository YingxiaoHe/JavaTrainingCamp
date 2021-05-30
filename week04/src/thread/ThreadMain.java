package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadMain {

    public static void main(String[] args) {
        // 继承Thread类
        ThreadA threadA = new ThreadA();
        threadA.start();
        System.out.println("main thread");

        // 实现Runnable接口
        ThreadB threadB = new ThreadB();
        new Thread(threadB).start();
        System.out.println("main thread");

        // 实现Callable<>接口
        ThreadC threadC = new ThreadC();
        FutureTask<String> futureTask = new FutureTask<>(threadC);
        new Thread(futureTask).start();
        System.out.println("main thread");
        try {
            System.out.println("得到的结果是：" + futureTask.get());
        } catch (ExecutionException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    /* 输出结果：
        main thread
        main thread
        main thread
        Thread A
        Thread B
        Thread C
        线程名称：Thread-1
        得到的结果是：Thread C
        返回当前线程Thread-1的线程组中活动线程的数量:2
        返回该线程Thread-1的标识符:13
        返回该线程Thread-1的优先级:5
        返回该线程Thread-1的状态:RUNNABLE
        返回该线程Thread-1所属的线程组:java.lang.ThreadGroup[name=main,maxpri=10]
        测试该线程Thread-1是否处于活跃状态:true
        测试该线程Thread-1是否为守护线程:false
     */
}
