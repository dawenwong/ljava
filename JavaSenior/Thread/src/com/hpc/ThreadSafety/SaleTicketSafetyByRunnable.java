package com.hpc.ThreadSafety;

/**
 * 线程安全问题
 *  1.三个窗口卖票，出现重票或负数的票
 *  2.出现上述问题的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票
 *  3.如何解决：当一个线程a操作共享数据的时候，其他线程不能参与进来，直到线程a操作完后，其他线程才可以开始
 *    这种情况即使线程a出现了阻塞，也不能被改变。
 *  4.java中，通过同步机制，来解决线程的安全问题
 *
 *  方式一：同步代码块
 *      synchronize(同步监视器){
 *          //需要被同步代码
 *      }
 *      说明：1.操作共享数据的代码，即为需要被同步的代码
 *           2.共享数据：多个线程共同操作的变量。比如：ticket就是共享数据
 *           3.同步监视器，俗称：锁。任何一个类的对象，都可以充当锁。
 *           要求：多个线程必须共用一把锁
 *
 *           补充：在使用Runnable接口创建多线程的方式中，可以考虑使用this充当同步监视器
 *                在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用类充当同步监视器
 *
 *
 *  方式二：同步方法
 *
 *
 *
 *  5.同步的方式，解决了线程的安全问题----好处
 *    操作同步代码时，只能一个线程参与，其他线程等待，相当于是一个单线程的过程，效率低---短处
 *
 *
 * */
public class SaleTicketSafetyByRunnable{
    public static void main(String[] args) {
        WindowOfSaleTicket rw = new WindowOfSaleTicket();

        Thread win1 = new Thread(rw);
        Thread win2 = new Thread(rw);
        Thread win3 = new Thread(rw);

        win1.setName("窗口一");
        win2.setName("窗口二");
        win3.setName("窗口三");

        win1.start();
        win2.start();
        win3.start();

    }
}

class WindowOfSaleTicket implements Runnable{
    private int ticket =100;
    Object obj = new Object(); //任何一个类的对象都可以当锁
    @Override
    public void run() {
        while (true){
//            synchronized(obj){ //这里可以传递this，因为在main中只实例化了一个对象，
                              // this就是指实现类实例化的对象
            synchronized(this){
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
            }
        }
    }
}