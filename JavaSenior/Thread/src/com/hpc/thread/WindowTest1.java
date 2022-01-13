package com.hpc.thread;
/**
 * 实现Runnable接口的方式来实现的
 * 例子：创建是三个窗口卖票，总票数为100张
 *  存在线程的安全问题，代解决
 *
 * */
public class WindowTest1 {
    public static void main(String[] args) {
        RWindow rWindow = new RWindow();  //因为只造了一个对象，所以三个共用100张票

        Thread t1 = new Thread(rWindow);
        Thread t2 = new Thread(rWindow);
        Thread t3 = new Thread(rWindow);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}

class RWindow implements Runnable{

    private  int ticket = 100;
    @Override
    public void run() {
        while(true){
            if(ticket > 0 ){
                System.out.println(Thread.currentThread().getName()+" : 卖票，票号 " + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
