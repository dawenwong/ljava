/*
	if-else 结构
*/
//导包：import java.util.Scanner;

import java.util.Scanner;

public class 流程控制if_else结构{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in); //实例化一个scanner
		
		//int score = scan.nextInt();  //调用scan的nextInt()方法
		//System.out.println("分数是："+score);
		
		System.out.println("请输入你的姓名：");
		String name = scan.next();   //Sring 用next()
		System.out.println(name);
		
		System.out.println("输入你的年龄：");
		short age = scan.nextShort(); 
		System.out.println(age);
		
		System.out.println("请输入你的体重：");
		double weight = scan.nextDouble();
		System.out.println(weight);
		
		System.out.println("请问你是否单身？");
		boolean isSingle = scan.nextBoolean();
		System.out.println(isSingle);
		
		System.out.println("请输入性别");
		String gender = scan.next();
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);
			
	}
	
}
