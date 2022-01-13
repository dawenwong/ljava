package com.hpc.thread;

/**
 * 测试Thread中的常用方法：
 *  1.start():启动当前线程，调用当前线程的run()
 *  2.run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 *  3.currentThread():静态方法，返回执行当前代码的线程
 *  4.getName():获取当前线程的名字
 *  5.setName():设置当前线程的名字
 *  6.yield():释放当前cpu的执行权
 *  7.join():
 *
 *  alt+7 打开结构图，查看方法、构造器
 *  ctrl+ Fn + F12 打开弹窗的形式查看当前类的方法、构造器
 *  ctrl+ h 查看类的继承关系
 *  另一个方式：光标放在需要查看的类上 ctrl+alt+u，可以图像的形式查看继承关系
 * */
class HelloThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+" : "+i);
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
        helloThread.start();

        // 给主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+" : "+i);
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
    }
}
