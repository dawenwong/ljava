
class ����2{
	public static void main(String[] args){
		
		long startTime = System.currentTimeMillis();  //��ʼʱ��
		
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
		
		long endTime = System.currentTimeMillis(); //����ʱ��
		System.out.println("�ܹ���������"+count);
		System.out.println("���������ѵ�ʱ�䣺"+(endTime-startTime)+"����");
	}
}