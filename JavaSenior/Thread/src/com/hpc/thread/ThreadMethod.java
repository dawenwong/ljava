package com.hpc.thread;

/**
 * 测试Thread中的常用方法：
 *  1.start():启动当前线程，调用当前线程的run()
 *  2.run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 *  3.currentThread():静态方法，返回执行当前代码的线程
 *  4.getName():获取当前线程的名字
 *  5.setName():设置当前线程的名字
 *  6.yield():释放当前cpu的执行权
 *  7.join():在线程a中调用线程b的join()，此时线程a就进入阻塞状态，直到线程b完全执行结束，
 *          线程a才结束阻塞状态。
 *  8.stop():已经过时。当前执行此方法时，强制结束当前线程。
 *  9.sleep(long millitime):让当前线程“睡眠”指定的millistime毫秒。在指定的时间内，
 *                          当前线程是阻塞状态。
 *  10.isAlive():判断当前线程是否存活
 *
 *  线程的优先级：
 *  1.
 *  MAX_PRIORITY:10
 *  MIN_PRIORITY:1
 *  NORM_PRIORITY:5  -->默认优先级
 *  2.如何获取和设置当前线程的优先级：
 *      getPriority():获取线程的优先级
 *      setPriority(int p):设置线程的优先级
 *
 *      说明：高优先级的线程要抢占低优先级线程cpu的执行权，但是只是从概率上讲，高优先级的线程高概率的情况下
 *      被执行。并不意味只有当高优先级线程执行完后，低优先级线程才执行。
 *
 *
 *  alt+7 打开结构图，查看方法、构造器
 *  ctrl+ Fn + F12 打开弹窗的形式查看当前类的方法、构造器
 *  ctrl+ h 查看类的继承关系
 *  另一个方式：光标放在需要查看的类上 ctrl+alt+u，可以图像的形式查看继承关系
 * */
class HelloThread extends Thread{
    @Override
    public void run() { // Thread 没有throws，所以子类重写也不能throws
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                try {
//                    Thread.sleep(1000);  //单位是ms(毫秒)
                    sleep(10); //省略Thread
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" : "+
                        Thread.currentThread().getPriority()+" : "+i);
            }
//            if(i % 20 == 0){
//                this.yield();
//            }
        }
    }
    // 命名方式二：
    public HelloThread(String name){
        super(name);
    }
}
public class ThreadMethod {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread("Thread:1");
//        helloThread.setName("线程一"); // 命名方式一
        //设置分线程的优先级
        helloThread.setPriority(Thread.MAX_PRIORITY); // 设置为MAX_PRORITY,(10)

        helloThread.start();

        // 给主线程命名
        Thread.currentThread().setName("主线程");
        // 设置主线程的优先级
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY); //给主线程设置为最小
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+" : "+
                        Thread.currentThread().getPriority()+" : "+i);
            }
            //join()方法
            if(i == 20){
                try {
                    helloThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println(helloThread.isAlive()); // 不存活：返回false
    }
}
