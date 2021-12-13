package com.baidu.oopBasic;

import java.util.Arrays;

public class 类方法的使用 {
	public static void main(String[] args) {
		方法声明和使用 f1 = new 方法声明和使用();
		f1.eat();  
		int[] arr = new int[] {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(f1.getArray(arr)) );
	}
}
/*
 * *类方法的声明和使用
 * public void tlak(String language)  void表示没有返回值，（String language）带形参
 * public void eat()   没有返回值，没有形参
 * public int sleep(int times) 返回int类型的值，带一个int类型的形参
 * public String getNationl(String national) 返回String类型的值，带一个String类型的形参
 * 
 * -方法的声明格式：权限修饰符  返回值类型 方法名（形参）{
 * 				方法体
 * 	}
 * static final abstract修饰，不一定有，不是必须的看情况，上面的声明方式就是必须的基本格式。
 * 
 * -权限修饰符，public、private、缺省、protected
 * -有无返回值问题：
 * 	--有返回值：如有返回值必须在方法声明时，写明返回值的类型，方法中必须用return 返回声明类型的值
 *  --没有返回值：如没有返回值的，声明写void，方法中也不写return，也可以是直接写“return;”表示结束该方法
 * -方法内中可以调用当前方法内中的成员变量(属性)和方法
 * --特殊的方法调用：A方法内右调用A方法------>递归（注意：递归需要结束条件不然就是死循环，导致栈溢出）
 * --方法中不可以定义别的方法
 * 
 */
class 方法声明和使用{
	
	String name = "Tom";
	
	public void tlak(String language) {
		System.out.println("中国人说话使用的语言：" + language);
	}
	
	public void eat() {
		//private String food = "大米"; //不能使用权限修饰符
		String food = "大米"; //局部变量
		System.out.println("中国南方人喜欢吃" + food);
	}
	
	public int sleep(int times) {
		eat();  //方法内调用方法
		return times;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getNationl(String national) {
		String info = "我的国籍是："+ national;
		return info;
	}
	
	public int[] getArray(int[] arr) { //返回数组类型
		int[] arr1 = arr;
		
		return arr1;	
	}
}