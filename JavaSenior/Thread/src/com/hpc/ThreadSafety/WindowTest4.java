package com.hpc.ThreadSafety;

/**
 * @author hpc
 * @create 2022-01-17-11:04
 */

/**
 * 同步方法解决继承Thread类的线程安全问题
 */
public class WindowTest4 {
    public static void main(String[] args) {

        windows2 w1 = new windows2();
        windows2 w2 = new windows2();
        windows2 w3 = new windows2();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }
}

class windows2 extends Thread{
    private static int ticket = 100;
    @Override
    public void run() {
        while(true){
           show();
        }
    }

    public static synchronized void show(){ //这时的同步监视器是Windows2.class
//        public synchronized void show(){ 这是错误的，这时的同步监视器是this，即当前对象，这里创建了3个对象
        if(ticket > 0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : 卖票，票号：" + ticket);
            ticket--;
        }
    }
}