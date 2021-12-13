/* 100以内的质数 
	质数又称素数。一个大于1的自然数，
	除了1和它自身外，不能被其他自然数整除的数叫做质数；
	否则称为合数（规定1既不是质数也不是合数）。
*/


class 质数{
	public static void main(String[] args){
		boolean isflag = true;
		long startTime = System.currentTimeMillis();  //开始时间
		int count = 0;
		for(int i = 2;i <=1000000;i++){
			//for(int j = 2; j <i;j++){
			for(int j = 2;j <= Math.sqrt(i);j++){
				if( i%j == 0){
					//System.out.println("不是质数：" + i);
					isflag = false;
					break;
				}
			}
			if(isflag==true){
				//System.out.println(i);
				count++;
			}
			isflag = true;
			
		}
		
		long endTime = System.currentTimeMillis(); //结束时间
		System.out.println("总共有质数："+count);
		System.out.println("计算所花费的时间："+(endTime-startTime)+"毫秒");
	}
}

/* 方法一时间：24123毫秒

方法二时间：2261毫秒 添加break

方法二时间：22毫秒  修改Math.sqrt(i)
 */