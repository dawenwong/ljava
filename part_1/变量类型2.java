/*
��������8��
	�������ͣ�              ռ�ô洢�ռ�        ������Χ
		�������ͣ�byte��	1�ֽ�= 8bitλ        -128~127��2^8��
				  short��	2�ֽ�                -32768~32767
				  int ��    4�ֽ�                -2147483648~2147483647
				  long��    8�ֽ�				 -
		�������ͣ�float��   4�ֽ�                -3.403E38~3.403E38~3
				  double��	8�ֽ�                -1.798E308~1.798E308
		�ַ��ͣ�  char��
	
	�������ͣ� 
		��class��                                 ���ַ������������еģ�
		�ӿ�interface��
		����[]��

����������������λ�ò�ͬ��
			��Ա������
			�ֲ�������
*/

class ��������2{
	public static void main(String[] args){
		//byte -128~127
		byte b1 = 12;
		byte b2 = -128;
		//b1 = 128;  //�����˱��벻ͨ��
		//System.out.println(b1);
		//System.out.println(b2);
		//
		short s1 = 128;
		int i1 = 1234;   //ͨ��ʹ��int
		long l1 = 2763646721L;  //����long�ͱ����Դ�дL��Сдl��β
		
		//System.out.println(l1);
		
		
		double d1 = 123.122;   //ͨ��ʹ��double
		//System.out.println(d1);
		
		float f1 = 12.33F;   //float ���ͺ�longһ��Ҳ��Ҫ�ڽ�β��һ����ĸ��
							 //��F��f������
		//System.out.println(f1);  
		
		//�ַ���char��һ��char ����2���ֽ�=16bitλ
		//����char���� ͨ��ʹ�õ�����'',
		//ͨ����������ֻ����һ���ַ�
		
		char c1 = 'a';  //ֻ��дһ���ַ�,��������'abcde'
		char c2 = '2';
		char c3 = '��';
		char c4 = '@';
		
		/* System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4); */
		
		//char ת���ַ�
		char c5 = '\n';  //���з�
		char c6 = '\t';  //table = 4���ո�
		System.out.print("���"+c6);
		System.out.println("����");
		
		//unicodeֵ
		char c7 = '\u0041';  //��ʾ��A
		
		//System.out.println(c7);
		
		
		//boolean
		
	}
}