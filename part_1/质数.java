/* 100���ڵ����� 
	�����ֳ�������һ������1����Ȼ����
	����1���������⣬���ܱ�������Ȼ��������������������
	�����Ϊ�������涨1�Ȳ�������Ҳ���Ǻ�������
*/


class ����{
	public static void main(String[] args){
		boolean isflag = true;
		long startTime = System.currentTimeMillis();  //��ʼʱ��
		int count = 0;
		for(int i = 2;i <=1000000;i++){
			//for(int j = 2; j <i;j++){
			for(int j = 2;j <= Math.sqrt(i);j++){
				if( i%j == 0){
					//System.out.println("����������" + i);
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
		
		long endTime = System.currentTimeMillis(); //����ʱ��
		System.out.println("�ܹ���������"+count);
		System.out.println("���������ѵ�ʱ�䣺"+(endTime-startTime)+"����");
	}
}

/* ����һʱ�䣺24123����

������ʱ�䣺2261���� ���break

������ʱ�䣺22����  �޸�Math.sqrt(i)
 */