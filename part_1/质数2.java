
class 质数2{
	public static void main(String[] args){
		
		long startTime = System.currentTimeMillis();  //开始时间
		
		int count = 0;
		
		loop1:for(int i = 2;i <=1000000;i++){
			//for(int j = 2; j <i;j++){
			for(int j = 2;j <= Math.sqrt(i);j++){
				if( i%j == 0){
					continue loop1;
				}
			}
			count++;			
		}
		
		long endTime = System.currentTimeMillis(); //结束时间
		System.out.println("总共有质数："+count);
		System.out.println("计算所花费的时间："+(endTime-startTime)+"毫秒");
	}
}