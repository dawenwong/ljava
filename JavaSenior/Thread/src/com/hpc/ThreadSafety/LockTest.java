package com.hpc.ThreadSafety;

/**
 * @author hpc
 * @create 2022-01-17-15:28
 */

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * 解决线程安全方式三：Lock(锁)
 * 1.从JDK5.0开始,Java提供了更强大的线程同步机制——通过显式定义同步锁对象来实现同步.同步锁使用Lock对象充当.
 * 2.java.util.concurrent.locks.Lock接口是控制多个线程对共享资源进行访问的工具.
 *   锁提供了对共享资源的独占访问,每次只能有一个线程对Lock对象加锁,线程开始访问共享资源之前应先获得Lock对象.
 * 3.ReentrantLock 类实现了Lock,它拥有与synchronized相同的并发性和内存语义,
 *   在实现线程安全的控制中,比较常用的是ReentrantLock,可以显式加锁、释放锁.
 *
 *
 * synchronized与lock的异同？
 *  相同点：都是用来解决线程安全问题
 *  不同点：synchronized在执行完相应的同步代码后，自动释放同步监视器，lock需要手动的去启动同步，同时结束同步要手动的调用
 *  unlock()
 *
 *  优先使用顺序：
 *  Lock>同步代码块（已经进入了方法体，分配了相应资源）>同步方法（在方法体之外）。
 *
 */
public class LockTest {
    public static void main(String[] args) {
        window6 rwin4 = new window6();
        Thread tw1 = new Thread(rwin4);
        Thread tw2 = new Thread(rwin4);
        Thread tw3 = new Thread(rwin4);

        tw1.setName("窗口一");
        tw2.setName("窗口二");
        tw3.setName("窗口三");

        tw1.start();
        tw2.start();
        tw3.start();
    }
}

class window6 implements Runnable{
    private int ticket =100;
    //1.使用ReentrantLock实现类实例化一个对象
    private ReentrantLock lock = new ReentrantLock(); //光标放到括号中ctrl+p，可以查看参数,fair:true排队先到先得

    @Override
    public void run() {
        while (true){
        try{
            //调用lock()方法，上锁
            lock.lock();
            if(ticket > 0){
                try{
                    Thread.sleep(100); // 会增加出现线程安全的几率
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " : 卖票，票号为：" + ticket);
                ticket--;
            }else{
                break;
            }

        }finally {
            //调用unlock()方法，解锁
            lock.unlock();
        }
        }
    }
}