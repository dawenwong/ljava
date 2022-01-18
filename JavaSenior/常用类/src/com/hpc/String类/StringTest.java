package com.hpc.String类;

import org.junit.Test;

/**
 * @author hpc
 * @create 2022-01-18-13:19
 *
 * String 的使用
 *      String的特性
 *          ·String类：代表字符串。Java程序中的所有字符串字面值（如“abc"）都作为此类的实例实现。
 *          ·String是一个final类，代表不可变的字符序列。
 *          ·字符串是常量，用双引号引起来表示。它们的值在创建之后不能更改。
 *          ·String对象的字符内容是存储在一个字符数组value[]中的。
 *
 *
 *
 */
public class StringTest {

    /*
    * 1.String声明的为final的，不可以被继承
     *          2.String实现了Serializable接口,表示字符串支持序列化的
     *          3.实现了Comparable接口，表示String可以比较大小
     *          4.String内部定义了final char[] value用于存储字符串数据
     *          5.String代表一个不可变的字符序列----->不可变的特性
     *            体现：1、当对字符串重新赋值时，需要重新指定内存区域赋值，不能使用原有value进行赋值
     *                 2、对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有value进行赋值
     *                 3、当调用String的replace()方法修改指定字符或字符串时，也必须重新指定内存区域赋值，不能使用原有value进行赋值
     *
     *          6.通过字面量的方式给一个字符串赋值，此时的字符串值声明在常量池中
     *            字符串常量池中是不会存储相同内容的字符串的
    * */
    @Test
    public void test1(){
        String s1 = "abc"; //字面量，“abc”存在常量池中
        String s2 = "abc";

        System.out.println( s1 == s2 );//true ,引用类型比较的是地址，这里s1和s2地址值相同

        s1 = "hello";
        System.out.println(s1); //hello
        System.out.println(s2); //abc

        System.out.println("********************");

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);  //重新造

        System.out.println("********************");
        String s4 = "abc";
        String s5 = s4.replace('a','m');
        System.out.println(s4); //不改变
        System.out.println(s5); //重新造
    }

    /*
     *   String的实例化方式：
     *       方式一：通过字面量定义的方式
     *       方式二：通过new + 构造器的方式
     * */
    @Test
    public void test2(){
        //此时的s1和s2数据javaEE声明在方法区的字符串常量池中
        String s1 = "JavaEE";
        String s2 = "JavaEE";

        //同new + 构造器的方式：此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后对于的地址值。
        String s3 = new String("JavaEE");
        String s4 = new String("JavaEE");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s1 == s4); //false
        System.out.println(s3 == s4); //false


        System.out.println("*******************************");
        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true


    }

    /*
    * 字符串拼接：
    *   结论：
            ·常量与重量的拼接结果在常量池。且常量池中不会存在相同内容的常量。
            ·只要其中有一个是变量，结果就在堆中
            ·如果拼接的结果调用intern()方法，返回值就在常量池中
    *
    *
    * */
    @Test
    public void test3(){
        String s1 = "javaEE";
        String s2 = "Spring";

        String s3 = "javaEESpring";
        String s4 = "javaEE"+"Spring"; //字面量连接
        String s5 = s1 + "Spring";
        String s6 = "javaEE"+s2;
        String s7 = s1+s2;

        System.out.println(s3 == s4); //true
        System.out.println(s3 == s5); //false
        System.out.println(s3 == s6); //false
        System.out.println(s3 == s7); //false
        System.out.println(s5 == s7); //false
        System.out.println(s6 == s7); //false

        String s8 = s5.intern();//返回值得到s8使用的是常量池中已经存在的“javaEESpring”
        System.out.println(s3 == s8); //true
    }
}
