/* ��������ת����
	�Զ�����ת��
		���ۣ�����С�����ͺ�����������������㣬����Զ����������ת��
		byte��char��short-->int-->long-->float-->double
		��byte char short��������������ʱ�����Ϊint����
		
	ǿ������ת��
		�Զ�����ת����������
	 */
//��������֮���������򣨲�����boolean��
class �Զ�����ǿ��ת��{
	public static void main(String[] args){
		
		//�Զ�����
		byte b1 = 2;
		int i1 = 12;
		
		//java:10: ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		//byte b2 = b1 + i1; �������
		
		int i2 = b1+i1; //С�����ͺʹ��������㣬�д�����ͽ��ս��		
		//System.out.println(i2);
		
		float f1 = b1+i1;  //���Ա���ִ�гɹ�
		//System.out.println(f1);
		
		//System.out.println("************************");
		char c1 = 'a';  //97
		int i3 = 10;
		int i4 = c1+i3;
		//System.out.println(i4);
		
		//ǿ��ת��:���-->С��
		
			double d1 = 123.3;
			
			int i5 = (int)d1;  //(ǿת������)
			
			//System.out.println(i5); //�о�����ʧ
			
			long l1 = 123l;
			short s2 = (short)l1;  //û�о�����ʧ
			//System.out.println(s2);
			
			
	}
}