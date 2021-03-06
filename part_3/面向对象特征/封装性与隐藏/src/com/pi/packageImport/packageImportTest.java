package com.pi.packageImport;

import java.util.ArrayList;
import java.util.Arrays;  //自带arrays类
import java.util.HashMap;  //可以使用import java.util.*  导入util下的所有结构
import static java.lang.System.*;  //导入指定类或接口中的静态结构
import com.exercise.exer1.Account;
import com.exercise.exer2.Bank;  //导入自定义的类


/*
 * -package关键字,包
 * 	--为了更好的项目中类的管理
 *  --使用package声明类或接口所属的包，声明在源文件的首行
 * 	--包属于标识符，因此要遵循标识符命名规则规范
 *  --每“.”一次，就代表一层文件目录，（同一个包下不能命名同名接口、类,不同包下可以命名）
 *  
 *  -java中主要的包
 *  1.java.lang---包含一些Java语言的核心类，如String、Math、Integer、system和Thread，提供常用功能
 *  2.java.net----包含执行与网络相关的操作的类和接口。
 *	3.java.io---包含能提供多种输入/输出功能的类。
 * 	4.java.util---包含一些实用工具类，如定义系统特性、接口的集合框架类、使用与日期日历相关的函数。
 *	5.java.text---包含了一些java格式化相关的类
 *	6.java.sql---包含了java进行JDBC数据库编程的相关类/接口
 *	7.java.awt----包含了构成抽象窗口工具集（abstract window toolkits）的多个类，
 *				      这些类被用来构建和管理应用程序的图形用户界面（GUI）。B/S C/S
 *
 *	//MVC 设计模式 model view controller
 *
 *
 * -import关键字,导入
 *	--在源文件中显式的使用import结构导入指定包下的类、接口
 *	--String 、System...属于核心包，使用很频繁，属于java.lang包的，可以省略import导入
 *	--同一个包下定义的结构，也可以省略import导入
 *	--import static:导入指定类或接口中的静态结构
 * */
public class packageImportTest {
	
	public static void main(String[] args) {
		java.lang.String arr = Arrays.toString(new int[] {1,2,3});
		Bank bank = new Bank();
		
		ArrayList list = new ArrayList(); 
		HashMap map = new HashMap();
		
		//使用两个同名的类exe1和exe2下的Account
		Account account = new Account();  //这个是通过import com.exercise.exer1.Account;
		//要是exe2中的Account只能如下：
		//全类名的方式
		com.exercise.exer2.Account account1 = new com.exercise.exer2.Account(0);
		
		out.println();  //import static java.lang.System.*;  //导入指定类或接口中的静态结构
	}
}
