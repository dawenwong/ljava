package com.hpc.String类;

import org.junit.Test;

/**
 * @author hpc
 * @create 2022-01-18-17:15
 * String常用方法三：
 *  String replace（char oldChar，char newChar）：返回一个新的字符串，它是通过用newChar 替换此字符串中出现的所有oldChar得到的。
 *  String replace（CharSequence target，CharSequence replacement）：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
 *  String replaceAll（String regex，String replacement）：使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串。
 *  String replaceFirst（String regex，String replacement）：使用给定的replacement替换此字符串匹配给定的正则表达式的第一个子字符串。
 *  boolean matches（String regex）：告知此字符串是否匹配给定的正则表达式。
 *  String split（String regex）：根据给定正则表达式的匹配拆分此字符串。
 *  Stringu split（String regex，int limit）：根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中。
 */
public class StringMethod1 {

    @Test
    public void test(){
        String s1 = "helloworld";
        System.out.println(s1.replace('h', 's'));
        System.out.println(s1);

        String s2 = "北京上海广州深圳";
        System.out.println(s2.replace('北', '东'));
        System.out.println(s2.replace("上海", "香港"));

        System.out.println("***************************");
        String s3 = "hello2322world2232java20940";
        System.out.println(s3.replaceAll("\\d+", ","));
        System.out.println(s3.replaceFirst("\\d+", ","));

        String s4 = "0571-45678983";
        boolean result = s4.matches("0571-\\d{7,8}");
        System.out.println(result); //true

        String s5 = "hello|world|java|mysql";
        String[] str = s5.split("\\|");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }
}
