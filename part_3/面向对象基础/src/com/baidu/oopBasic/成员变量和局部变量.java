package com.baidu.oopBasic;

public class 成员变量和局部变量 {
	
}


//权限修饰符的不同
	//属性在声明时可以指明其权限，使用权限修饰符
	//常用的权限修饰符包括：private,public,缺省,protected----->封装性
	//局部变量不能使用权限修饰符，（final可以）
//默认初始化值
	//属性：
		//类的属性，根据其类型，都有默认初始化值
		//整型：（byte,short,int,long）:0
		//浮点型：（float，double）：0.0
		//字符型：（char）：0，'\u0000'
		//布尔型：（boolean）：fasle
		//引用型：（类、数组、接口）：null
	//局部变量：
		//没有默认初始化值，
		//在调用局部变量之前，一定要显式赋值
//在内存中加载的位置
	//属性加载到堆heap空间(非static)，static就要放在方法区了
	//局部变量加载到栈stack空间
class 属性和局部变量{
	
	//属性（成员变量）
	private String name; //没写就是缺省,加了private出了这个类就不能调了
	public int age; //没写就是缺省，加了public可以调
	protected boolean isMale;  //没写就是缺省
	
	public void tlak(String language) {
		System.out.println("中国人说话使用的语言：" + language);
	}
	
	public void eat() {
		//private String food = "大米"; //不能使用权限修饰符
		String food = "大米"; //局部变量
		System.out.println("中国南方人喜欢吃" + food);
	}
}
