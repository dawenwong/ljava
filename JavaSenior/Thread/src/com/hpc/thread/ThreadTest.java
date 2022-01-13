package com.hpc.thread;

/*
 * @author hpc
 * @create 2022-01-13-17:30
 */

/*
 *
 * 多线程的创建，方式一：继承与Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run()
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用start()
 *
 *
 * 例子：遍历100以内的所有的偶数
 */
//1.创建一个继承于Thread类的子类
class myThread extends Thread{
    //2.重写Thread类的run()
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
//        3.创建Thread类的子类的对象
        myThread test = new myThread(); //ALT+ENTER 快捷声明
//        4.通过此对象调用start()：①启动当前线程 ②调用当前线程的run()
        test.start();
//        test.run();  //直接调用run是在main中执行，只是执行了对象调方法，没有开启多线程
//        我们不能通过直接调run()的方式启动线程。
//       再启动一个线程，遍历100以内的偶数，不可以还让已经start()的线程去执行，会报IllegalThreadStateExpection
//        test.start();
        myThread test2 = new myThread();
        test2.start();
        // 如下操作仍然是在main线程中执行的
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+" : "+i+"***********main****************");
            }
        }


    }
}
