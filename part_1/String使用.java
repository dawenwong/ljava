/* String:
	1、不是基本数据类型，是引用类型
	2、声明String类型变量时，使用一对""
	3、string 可以和8种基本数据类型做运算
  */
 class String使用{
	public static void main(String[] args){
		String s1 = "你好，重庆！！！";
		
		System.out.println(s1);
		
		String s2 = "a";
		
		String s3 = ""; //可以编译通过
		
		//char c1 = ""; // 编译不通过，必须放一个，只能一个
		
		int number = 1000;
		String numberStr = "学号： ";
		String info = numberStr +number; //+是连接符号,结果都是string
		System.out.println(info);
		boolean b1 = true;
		String info1 = info + b1;
		System.out.println(info1);
	}
	 
 }