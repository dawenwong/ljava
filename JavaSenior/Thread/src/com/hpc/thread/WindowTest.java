package com.hpc.thread;

/**
 * 使用继承Thread类的方式来实现的
 * 例子：创建是三个窗口卖票，总票数为100张
 *  存在线程的安全问题，代解决
 *
 * */
public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window extends Thread{
//    private int ticket = 100; // 这样的话会三个窗口各有100张票

    private static int ticket = 100; //这样就三个窗口共享100张票


    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {

        while(true){
           if(ticket > 0){
               System.out.println(Thread.currentThread().getName()+" ：卖票，票号为："+ticket);
               ticket--;
           } else{
               break;
           }
        }
    }
}