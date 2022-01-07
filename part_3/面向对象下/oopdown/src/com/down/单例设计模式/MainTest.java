package com.down.单例设计模式;
/*
 * main()方法的使用：
 * 	1.main()作为程序入口出现
 * 	2.main()方法也是一个普通的静态方法
 *  3.main()方法可以作为我们与控制台交互的方式（之前使用Scanner获取控制台信息）
 * 
 * */
public class MainTest {
	
//	public static void main1(String[] args) {}//改成main1就变成一个普通的静态方法，不能作为程序入口了
	
	public static void main(String[] args) {
		Main.main(new String[100]); // 这里调用Main类中的main()方法，
	}
	
	 
}

class Main{
	
	public static void main(String[] args) {
		
		for(int i = 0;i<args.length;i++) {
			args[i] = "args_"+i;
			System.out.println(args[i]);
		}
	}
}