package com.hpc.String类;

import org.junit.Test;



/**
 * @author hpc
 * @create 2022-01-18-16:09
 *
 * String类常用方法
 *  常用方法一：
 *  int length():返回字符串的长度:return value.length
 *  char charAt(int index):返回某索引处的字符return value[index]
 *  boolean isEmpty():判断是否是空字符串:return value.length==0
 *  String toLowerCase():使用默认语言环境,将String中的所有字符转换为小写
 *  string toUpperCase():使用默认语言环境,将String中的所有字符转换为大写
 *  String trim():返回字符串的副本,忽略前导空白和尾部空白
 *  boolean equals(Object obj):比较字符串的内容是否相同
 *  boolean equalsIgnoreCase(String anotherString):与equals方法类似,忽略大小写
 *  String concat(String str):将指定字符串连接到此字符串的结尾.等价于用"+"
 *  int compareTo(String anotherString):比较两个字符串的大小
 *  String substring(int beginIndex):返回一个新的字符串,它是此字符串的从beginIndex开始截取到最后的一个子字符串.
 *  string substring(int beginIndex,int endIndex):返回一个新字符串,它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串.
 *
 *  常用方法二：
 *  boolean endsWith(String suffix):测试此字符串是否以指定的后缀结束
 *  boolean startsWith(String prefix):测试此字符串是否以指定的前缀开始
 *  boolean startsWith(String prefix,int toffset):测试此字符串从指定索引开始的子字符串是否以指定前缀开始
 *  boolean contains(CharSequence s):当且仅当此字符串包含指定的char值序列时,返回true
 *  int indexOf(String str):返回指定子字符串在此字符串中第一次出现处的索引
 *  int indexOf(String str,int fromIndex):返回指定子字符串在此字符串中第一次出现处的索引,从指定的索引开始
 *  int lastIndexOf(String str):返回指定子字符串在此字符串中最右边出现处的索引
 *  int lastIndexOf(String str,int fromIndex):返回指定子字符串在此字符串中最后一次出现处的索引,从指定的索引开始反向搜索
 *      注:indexOf和lastIndexOf方法如果未找到都是返回-1
 */
public class StringMethod {
    //String方法测试
    @Test
    public void test(){
        String s1 = "helloworld";

        System.out.println(s1.length()); // 5
        System.out.println(s1.charAt(1)); // 2
//        s1 = "";
        System.out.println(s1.isEmpty()); //false

        String s2 = s1.toUpperCase();
        System.out.println(s1); //helloworld
        System.out.println(s2); //HELLOWORLD
        String s3 = "         h e l l o w o r l d      ";
        String s4 =s3.trim();
        System.out.println("------"+s3+"--------");
        System.out.println("------"+s4+"--------");

        String s5 = "HellOwOrld";
        System.out.println(s1.equals(s5));// false
        System.out.println(s1.equalsIgnoreCase(s5)); // true

    }

    @Test
    public void test2(){
        String s1 = "helloworld";
        String s2 = "123";

        System.out.println(s1.concat(s2));

        String s3 = "abc";
        String s4 = new String("abd");
        System.out.println(s3.compareTo(s4)); // -1(负数s3小)

        String s5 = "中华人民共和国";
        String s6 = s5.substring(2);
        System.out.println(s6); //人民共和国
        String s7 = s5.substring(2,4); //左闭右开 [2,4)
        System.out.println(s7);
    }

    @Test
    public void test3(){
        String s1 = "helloworld";

        System.out.println(s1.endsWith("e")); //false
        System.out.println(s1.endsWith("rld")); // true
        System.out.println(s1.startsWith("He")); // false
        System.out.println(s1.startsWith("hel")); //true
        System.out.println(s1.startsWith("ll", 2)); //以index2开始是不是ll开始

        System.out.println(s1.contains("wo")); //true


        System.out.println(s1.indexOf("lo")); // 3
        System.out.println(s1.indexOf("lol")); // -1 不存在
        System.out.println(s1.indexOf("lo", 5)); //从index=5开始找，

        System.out.println(s1.lastIndexOf("wo")); // 5



    }
}
