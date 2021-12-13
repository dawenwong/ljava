/*
变量类型8种
	基本类型：              占用存储空间        表数范围
		整数类型：byte：	1字节= 8bit位        -128~127（2^8）
				  short：	2字节                -32768~32767
				  int ：    4字节                -2147483648~2147483647
				  long：    8字节				 -
		浮点类型：float：   4字节                -3.403E38~3.403E38~3
				  double：	8字节                -1.798E308~1.798E308
		字符型：  char：
	
	引用类型： 
		类class：                                 （字符串是类类型中的）
		接口interface：
		数组[]：

变量在类中声明的位置不同：
			成员变量：
			局部变量：
*/

class 变量类型2{
	public static void main(String[] args){
		//byte -128~127
		byte b1 = 12;
		byte b2 = -128;
		//b1 = 128;  //超过了编译不通过
		//System.out.println(b1);
		//System.out.println(b2);
		//
		short s1 = 128;
		int i1 = 1234;   //通常使用int
		long l1 = 2763646721L;  //定义long型必须以大写L或小写l结尾
		
		//System.out.println(l1);
		
		
		double d1 = 123.122;   //通常使用double
		//System.out.println(d1);
		
		float f1 = 12.33F;   //float 类型和long一样也需要在结尾加一个字母，
							 //加F或f都可以
		//System.out.println(f1);  
		
		//字符型char：一个char 等于2个字节=16bit位
		//声明char变量 通常使用单引号'',
		//通常单引号内只能有一个字符
		
		char c1 = 'a';  //只能写一个字符,不能这样'abcde'
		char c2 = '2';
		char c3 = '中';
		char c4 = '@';
		
		/* System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4); */
		
		//char 转义字符
		char c5 = '\n';  //换行符
		char c6 = '\t';  //table = 4个空格
		System.out.print("你好"+c6);
		System.out.println("重庆");
		
		//unicode值
		char c7 = '\u0041';  //表示是A
		
		//System.out.println(c7);
		
		
		//boolean
		
	}
}