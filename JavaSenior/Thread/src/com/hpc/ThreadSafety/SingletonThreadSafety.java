package com.hpc.ThreadSafety;

/**
 * @author hpc
 * @create 2022-01-17-11:34
 */

/**
 * 使用同步机制将单例模式中的懒汉式改写成线程安全的
 *
 */
public class SingletonThreadSafety {

}

class Bank{
    //私立化构造器
    private Bank(){}

    private static Bank instance = null;
    //方式一：同步方法
//    public static synchronized Bank getInstance(){ //使用同步方法，锁是Bank.class
//            if( instance == null){
//                instance = new Bank();
//            }
//            return instance; // 不算是操作
//    }

    //方式二：同步代码块
//    public static Bank getInstance(){
//        //快捷键 ctrl+alt+t 实现surround with
//        synchronized (Bank.class) { //使用同步代码块，效率差
//            if( instance == null){
//                instance = new Bank();
//            }
//            return instance;
//        }
//    }

    //方式三：效率高
    public static Bank getInstance(){
        if(instance == null){
            //快捷键 ctrl+alt+t 实现surround with
            synchronized (Bank.class) { //使用同步代码块，效率差
                if( instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }

}
