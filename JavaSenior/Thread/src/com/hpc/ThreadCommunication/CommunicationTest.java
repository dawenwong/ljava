package com.hpc.ThreadCommunication;

/**
 * 线程通信，使用两个线程打印1-100，线程1和线程2交替打印
 *
 * 涉及到的三个方法：
 *  wait():一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器。
 *  notify():一旦执行此方法，就会唤醒被wait的一个线程，如果有多个线程就被wait，就唤醒优先级高的那个。
 *  notifyAll():一旦执行此方法，就会唤醒所有被wait的线程。
 *
 *  说明：
 *      1.wait、nofity、notifyAll三个方法必须使用在同步代码块或同步方法中，
 *      2.wait、nofity、notifyAll三个方法的调用者必须是同步代码块或同步方法中的同步监视器
 *        否则会出现IllegalMonitorStateException异常
 *      3.三个方法是定义在java.lang.Object
 *
 *
 * sleep()和wait()异同？
 *     相同点：一旦执行方法，都可以使得当前的线程进入阻塞状态
 *     不同点：1）两个方法声明的位置不同：Thread类中声明sleep()，Object类中声明wait()
 *            2）调用的要求不同：sleep()可以在任何需要的场景下调用，wait()必选使用在同步代码中或同步方法中
 *            3）关于是否释放同步监视器：如果两个方法都使用在同步代码块或同步方法中，sleep()不会释放锁，wait()会释放锁。
 *
 */
class Number implements Runnable{
    private int number = 1;
    private Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized(this){
//          synchronized(obj) 报错，notify方法的调用者和同步监视器不一致
                this.notify(); //唤醒一个wait的线程

                if(number <= 100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " : " + number);
                    number++;

                    //使用wait()方法使得调用的线程进入阻塞状态
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}
public class CommunicationTest {
    public static void main(String[] args) {
        Number num = new Number();
        Thread t1 = new Thread(num);
        Thread t2 = new Thread(num);

        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();

    }
}


