package com.down.单例设计模式;
/*
 * 使用main()方法实现交互：
 * 在eclipse中，
 * 		1.右键run as一次当前文件，
 * 		2.右键 run as 找到Run configurations
 * 		3.在Run configurations中左边查看是否是当前类文件名，然后右边Arguments下的Program arguments框中填写数据
 * 		4.数据以空格隔开，全是是String类型，可以使用""包裹数据，也可以不用""
 * 在window中终端中交互：
 * 		1.javac.exe demo.java  //编译文件
 * 		2.java.exe  demo str1 str2 str2  //执行文件，在文件名后面 输入数空格隔开 
 * 
 * 
 * */
public class MainIODemo {
	public static void main(String[] args) {
		for(int i = 0; i < args.length;i++) {
			System.out.println("******"+ args[i]);
			int score = Integer.parseInt(args[i]);
			System.out.println("#####"+ score);
		} 
	}
}
