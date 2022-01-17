package com.hpc.ThreadSafety;

/**
 * @author hpc
 * @create 2022-01-17-11:54
 *
 *
 */

/**
 * 死锁
 *  >不同的线程分别占用对方需要的同步资源不放弃，都在等待对方放弃自己需要的同步资源，就形成了线程的死锁
 *  >出现死锁后，不会出现异常，不会出现提示，只是所有的线程都处于阻塞状态，无法继续
 * 解决方法
 *      >专门的算法、原则
 *      >尽量减少同步资源的定义
 *      >尽量避免嵌套同步
 */
public class ThreadDeadlock {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        //匿名方式创建线程
        new Thread(){
            @Override
            public void run() {
                synchronized(s1){
                    s1.append("a");
                    s2.append("1");

                    //增加死锁的几率
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized(s2){
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }

            }
        }.start();

        //匿名Runnable
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(s2){
                    s1.append("c");
                    s2.append("3");

                    //增加死锁的几率
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized(s1){
                        s1.append("d");
                        s2.append("4");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }).start();
    }
}
