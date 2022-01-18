package com.hpc.exercise;

/**
 * @author hpc
 * @create 2022-01-18-15:49
 *
 * String练习一
 */
public class StringTest {
        String str = new String("good");
        char[] ch = {'t','e','s','t'};

        public void change(String str,char[] ch){
//                this.str = "test ok"; // 这样才能改声明的str的值
                str = "test ok"; //这里是给形参的str赋值，这类题太多了，都玩这套路
                ch[0] = 'b';
        }

        public static void main(String[] args) {
                StringTest ex = new StringTest();
                ex.change(ex.str,ex.ch);
                System.out.println(ex.str);//good
                System.out.println(ex.ch); //best
        }
}
