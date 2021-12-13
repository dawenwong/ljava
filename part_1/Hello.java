/*
1.  JDK 、JRE、JVM 三者之间的关系？
JDK = JRE + Java的开发工具（javac.exe java.exe javadoc.exe）
JRE = JVM + Java核心类库
*/
public class Hello{
	
	public static void main(String[] args){
		System.out.println("你好，世界");
	}
}

/*
	java编译执行过程,需要用到JDK java开发工具，运行需要jre
	要将jak的bin文件路径配置到系统环境变量
	1.创建一个JAVA_HOME = C:\Program Files\Java\jdk1.8.0_261\bin
	2.将JAVA_HOME添加到path，%JAVA_HOME%\bin
	3.编译java源文件，在bash或windows cmd中切换到源文件目录
	4.输入javac xxxx.java  就可以将java源文件编译为和主类同名的一个
	  xxxx.class字节码文件
	5.使用java xxxx(字节码文件) 就可以执行程序
	6.一个源文件只能有一个public的主类,但可以有多个类
	7.编译的时候，会将源文件中的所有类都生成相应的.class文件,且能执行
	*/
	//这是单行注释
	/*
		这是多行注释
		这是多行注释
	*/
	/**
		@author dawen
		@version v0.1
		这是文档注释
	*/
	
//多个类
class Person{
	public static void main(String[] args){
		System.out.println("这是人类");
	}
}

class Animal{
	public static void main(String[] args){
		System.out.println("这是动物类");
	}
}