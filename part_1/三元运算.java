/* ��Ԫ���� */

//(����)�����ʽ1�����ʽ2
class ��Ԫ����{
	public static void main(String[] args){
		int x = 1,y = 2;
		
		int max = (x > y)?x:y;
		System.out.println(max);
		
		double num = (x>y)?2:1.0;
		
		String str = (x>y)?"�����":"�Ǽٵ�";
		System.out.println(str);
		
		//Ƕ��ʹ��
		String str1 = (x>y)?"x��":((x==y)?"x��y���":"y��");
		
		//��ȡ�����������ֵ
		int n1 = 12,n2 = 30,n3 = -43;
		int max1 = (n1>n2)?n1:n2;
		int max2 = (max1>n3)?max1:n3;
		System.out.println("�������������ǣ�"+ max2);
		
		//����ϲ���һ��
		int max3 = (((n1>n2)?n1:n2)>n3)?((n1>n2)?n1:n2):n3;
		System.out.println("�������������ǣ�"+ max3);
	}
}	
