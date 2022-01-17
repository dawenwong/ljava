package com.hpc.ThreadSafety;

/**
 * @author hpc
 * @create 2022-01-17-10:52
 */

/**
 * 使用同步方法解决实现Runnable接口的线程安全问题
 */
public class WindowTest3 {
    public static void main(String[] args) {
        windows rwin = new windows();
        Thread w1 = new Thread(rwin);
        Thread w2 = new Thread(rwin);
        Thread w3 = new Thread(rwin);

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }
}

class windows implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while(true){
           show();
        }
    }

    public synchronized void show(){   //同步方法，同步监视器默认this
        if(ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":卖票，票号 " + ticket);
            ticket--;
        }
    }
}