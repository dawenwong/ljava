package com.hpc.Callable接口;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author hpc
 * @create 2022-01-18-9:59
 *
 * 创建线程的方式三：实现callable接口 ----JDK5.0新增
 *
 * 与使用Runnable相比，Callable功能更强大些
 *  >相比run()方法，可以有返回值
 *  >方法可以抛出异常微了
 *  >支持泛型的返回值
 *  >需要借助FutureTask类，比如获取返回结果
 *
 *  Future接口
 *  >可以对具体Runnable、Callable任务的执行结果进行取消、查询是否完成、获取结果等。
 *  >FutrueTask是Futrue接口的唯一的实现类
 *  >FutureTask 同时实现了Runnable，Future接口。它既可以作为Runnable被线程执行，又可以作为Future得到Callable的返回值
 *
 *  步骤：
 *      1.创建Callable的实现类
 *      2.对call()抽象方法重写，带返回值
 *      3.实例化一个Callable的实现类的对象
 *      4.实例化一个FutureTask对象，将一个Callable的实现类的对象传递给FutureTask构造器
 *      5.将FutureTask对象传递给Thread构造器，然后启动Thread实例化对象
 *      6.如果对call()方法的返回值感兴趣可以通过FutureTask对象"."get()方法获取
 *
 *  Callable接口创建多线程比Runnable接口创建多线程方式更强大
 *      1.call()可以有返回值
 *      2.call()可以抛出异常，被外面的操作捕获，获取异常信息
 *      3.Callable支持泛型
 */
//1.创建Callable的实现类
public class NumThread implements Callable {
    //2.对call()抽象方法重写，带返回值
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;  //自动装箱
    }
}

class ThreadNew{
    public static void main(String[] args) {
        //3.实例化一个Callable的实现类的对象
        NumThread num = new NumThread();
        //4.实例化一个FutureTask对象，将一个Callable的实现类的对象传递给FutureTask构造器
        FutureTask futuretask = new FutureTask(num);
        //5.将FutureTask对象传递给Thread构造器，然后启动Thread实例化对象
        Thread t = new Thread(futuretask);
        t.start();

        try {
            //6.如果对call()方法的返回值感兴趣可以通过FutureTask对象"."get()方法获取
            Object sum = futuretask.get();
            System.out.println(sum);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}