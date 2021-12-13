/* 三元运算 */

//(条件)？表达式1：表达式2
class 三元运算{
	public static void main(String[] args){
		int x = 1,y = 2;
		
		int max = (x > y)?x:y;
		System.out.println(max);
		
		double num = (x>y)?2:1.0;
		
		String str = (x>y)?"是真的":"是假的";
		System.out.println(str);
		
		//嵌套使用
		String str1 = (x>y)?"x大":((x==y)?"x和y相等":"y大");
		
		//获取三个数的最大值
		int n1 = 12,n2 = 30,n3 = -43;
		int max1 = (n1>n2)?n1:n2;
		int max2 = (max1>n3)?max1:n3;
		System.out.println("三个数中最大的是："+ max2);
		
		//上面合并成一个
		int max3 = (((n1>n2)?n1:n2)>n3)?((n1>n2)?n1:n2):n3;
		System.out.println("三个数中最大的是："+ max3);
	}
}	
