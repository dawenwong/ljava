/* String:
	1�����ǻ����������ͣ�����������
	2������String���ͱ���ʱ��ʹ��һ��""
	3��string ���Ժ�8�ֻ�����������������
  */
 class Stringʹ��{
	public static void main(String[] args){
		String s1 = "��ã����죡����";
		
		System.out.println(s1);
		
		String s2 = "a";
		
		String s3 = ""; //���Ա���ͨ��
		
		//char c1 = ""; // ���벻ͨ���������һ����ֻ��һ��
		
		int number = 1000;
		String numberStr = "ѧ�ţ� ";
		String info = numberStr +number; //+�����ӷ���,�������string
		System.out.println(info);
		boolean b1 = true;
		String info1 = info + b1;
		System.out.println(info1);
	}
	 
 }