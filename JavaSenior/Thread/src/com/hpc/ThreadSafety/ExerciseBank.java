package com.hpc.ThreadSafety;

/**
 * @author hpc
 * @create 2022-01-17-17:12
 */

/**
 * 银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
 * 问题：该程序是否有安全问题，如果有，如何解决？
 * 【提示】
 *      1，明确哪些代码是多线程运行代码，须写入run（）方法
 *      2，明确什么是共享数据。
 *      3，明确多线程运行代码中哪些语句是操作共享数据的。
 */
public class ExerciseBank {
    public static void main(String[] args) {
        Account account = new Account();
        Customer cust1 = new Customer(account);
        Customer cust2 = new Customer(account);

        cust1.setName("甲");
        cust2.setName("乙");

        cust1.start();
        cust2.start();

    }
}
class Account{
    private double balance;

    public Account() {
        super();
    }

    public Account(double balance) {
        super();
        this.balance = balance;
    }
    public  synchronized void deposit(double amt){
        if(amt > 0){
            balance += amt;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"存钱成功，余额为：" + balance);
        }
    }
}

class Customer extends Thread{
    private Account account = null;

    public Customer(Account account) {  //插入构造器快捷键alt+insert
        super();
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}