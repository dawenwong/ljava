package com.hpc.ThreadSafety;

/**
 * 继承Thread的方式，创建线程的线程安全解决方式
 *
 */
public class SaleTicketSafetyByExtendsThread {
    public static void main(String[] args) {

        Window5 t1 = new Window5();
        Window5 t2 = new Window5();
        Window5 t3 = new Window5();


        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window5 extends Thread{
    public static int ticket = 100;
    @Override
    public void run() {
        while (true){
            synchronized(Window5.class){  //“类.class”,万物皆对象，class也是对象，可以将类当做同步监视器
                                         //因为类只在内存中加载一次，因此只有一个是唯一的
                if(ticket > 0){
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " : 卖票，票号： " + ticket);
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }
}