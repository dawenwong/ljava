package com.down.Final;
/*
 * final:最终的
 * 1.final可以用来修饰的结构，类、方法、变量
 * 
 * 
 * 2.final 用来修饰一个类:此类不能被其他类所继承
 * 			比如：String类、System类、StringBuffer类
 * 
 * 3.final 用来修饰方法：表明此方法，不能被重写
 * 			比如：Object中getClass()方法（获取当前对象所属的类）
 * 
 * 4.final 用来修饰变量：此时的变量就称为是一个常量
 * 		4.1 final修饰属性：可以考虑赋值的位置有，显示初始化、代码块中初始化、构造器中初始化
 * 		4.2 final修饰局部变量：
 * 				尤其是使用final修饰形参时，表明形参是一个常量，当我们调用此方法时，给常量形参赋值
 * 				一个实参，一旦赋值以后，在方法体可以使用该是实参，但不能重新赋值修改。
 * 
 * static final 用来修饰属性：全局(static)常量(final)
 * 						方法：
 * 
 * 
 * */
public class FinalTest {
//	final int HEIGHT; //final修饰默认初始化不行
	final int WIDTH = 10; //final修饰显示初始化
	final int LEFT; 
	{ LEFT=1; } //final修饰，在代码块中初始化
	final int RIGHT;
	public FinalTest() {
		RIGHT = 2;  //final修饰，在构造器中初始化
	}
	public FinalTest(int n) {
		RIGHT = n;
	}
	
//	final int DOWN;
//	public void setDown(int down) {
//		this.DOWN = down;  //通过方法给final赋值不行
//	}
//	public void doWidth() {
//		width = 20;  //The final field FinalTest.width cannot be assigned
//	}
	public static void main(String[] args) {
		int num = 10;
		
		num = num + 5;
		FinalTest f1 = new FinalTest();
		f1.show(3.14159);
		
	}
	
	
	public void show() {
		
		final double PI = 3.14; //常量
	}
	//方法重载
	public void show(final double PI) {
		System.out.println(PI);
	}
	
}

//不能被继承了
final class FinalA{
	
}

//class B extends FinalA{
//	
//}

//class C extends String{
//	//The type C cannot subclass the final class String
//}

//class aa{
//	public final void method() {//final修饰后不能被子类重写
//		
//	}
//}
//class bb extends aa{
//	//Cannot override the final method from aa
//	//父类方法用final修饰了，不能被重写
////	@Override
////	public void method() {
////		// TODO Auto-generated method stub
////		super.method();
////	}
//}



















