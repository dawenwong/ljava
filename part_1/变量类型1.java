/*
	java 变量类型和变量名
*/
class 变量类型1{
	public static void main(String[] args){
		
		//变量定义
		int myAge = 30;   //整型
		//int myAge =31;   不能重名，不是python 后声明覆盖先声明
		System.out.println(myAge);
		
		//变量声明
		int myNum = 1001;
		//变量赋值
		System.out.println(myNum+1000);
		
		//System.out.println(myClass);  作用域不同，不能使用
		//同一个作用域不能有两个相同名字的变量
	}
	
	public void method(){
		
		int myClass =10;
	}

}