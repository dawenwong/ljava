/*
a++和++a的区别
a++：是先（+-*、/==）运算，再自增
++a：是自增再做运算

逻辑运算：
x&y与x&&y的区别
x&y:叫做逻辑运算，需要x和y都真返回真，且当x为假（真）时，任然会继续去执行y的部分
x&&y：短路逻辑与，当x为假，就不会去执行y的部分

x|y与x||y的区别
和上面差不多
*/

class 自增和逻辑练习{
	public static void main(String[] args){
		
		//第一种情形
		//int x = 1;
		//int y = 1;
		//if(x++==2&++y==2){  //x先运算后自增，x=1不等于2，所以为false，继续y的部分
		   				//y的部分先自增后运算，y自增后为2，判断是否相等，true
		//	x = 7;
		//}
		//System.out.println("x= "+x+",y= "+y); //x = 2,y =2
		
		//第二种情形
		//int x=1,y=1;
		//if(x++==2&&++y==2){
		//x先运算后自增，1！=2 返回false，x自增x=2，false所以&&不执行++y
		//	x=7;
		//}
		//System.out.println("x= "+x+",y= "+y); //x = 2,y =1
	
		//第三种情形
		//int x = 1,y = 1;
		//if(x++==1|++y==1){
		//	x=7;
		//}
		//System.out.println("x= "+x+",y= "+y);//x=7,y=2
		
		//第三种情形
		//int x = 1,y = 1;
		//if(x++==1||++y==1){
		//	x=7;
		//}
		//System.out.println("x= "+x+",y= "+y);//x=7,y=1
		
		
		//恶心面试题
		boolean x = true;
		boolean y = false;
		short z = 42;
		if((z++==42)&&(y=true))z++;
			//z == true执行后面的，z==false不执行y部分
			//z=42==42->true,z=43 短路,z=44
		if((x=false)||(++z==45))z++;
			//x == false执行后面的x==true不执行后面的
			
		System.out.println("z= "+z);  //46
	}
	
}

