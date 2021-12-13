/* 变量类型转换：
	自动类型转换
		结论：容量小的类型和容量大的类型做运算，结果自动向容量大的转换
		byte、char、short-->int-->long-->float-->double
		当byte char short三种类型做运算时，结果为int类型
		
	强制类型转换
		自动类型转换的逆运算
	 */
//基本数据之间的运算规则（不包括boolean）
class 自动提升强制转换{
	public static void main(String[] args){
		
		//自动提升
		byte b1 = 2;
		int i1 = 12;
		
		//java:10: 错误: 不兼容的类型: 从int转换到byte可能会有损失
		//byte b2 = b1 + i1; 编译错误
		
		int i2 = b1+i1; //小的类型和大类型运算，有大的类型接收结果		
		//System.out.println(i2);
		
		float f1 = b1+i1;  //可以编译执行成功
		//System.out.println(f1);
		
		//System.out.println("************************");
		char c1 = 'a';  //97
		int i3 = 10;
		int i4 = c1+i3;
		//System.out.println(i4);
		
		//强制转换:大的-->小的
		
			double d1 = 123.3;
			
			int i5 = (int)d1;  //(强转后类型)
			
			//System.out.println(i5); //有精度损失
			
			long l1 = 123l;
			short s2 = (short)l1;  //没有精度损失
			//System.out.println(s2);
			
			
	}
}