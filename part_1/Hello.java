/*
1.  JDK ��JRE��JVM ����֮��Ĺ�ϵ��
JDK = JRE + Java�Ŀ������ߣ�javac.exe java.exe javadoc.exe��
JRE = JVM + Java�������
*/
public class Hello{
	
	public static void main(String[] args){
		System.out.println("��ã�����");
	}
}

/*
	java����ִ�й���,��Ҫ�õ�JDK java�������ߣ�������Ҫjre
	Ҫ��jak��bin�ļ�·�����õ�ϵͳ��������
	1.����һ��JAVA_HOME = C:\Program Files\Java\jdk1.8.0_261\bin
	2.��JAVA_HOME��ӵ�path��%JAVA_HOME%\bin
	3.����javaԴ�ļ�����bash��windows cmd���л���Դ�ļ�Ŀ¼
	4.����javac xxxx.java  �Ϳ��Խ�javaԴ�ļ�����Ϊ������ͬ����һ��
	  xxxx.class�ֽ����ļ�
	5.ʹ��java xxxx(�ֽ����ļ�) �Ϳ���ִ�г���
	6.һ��Դ�ļ�ֻ����һ��public������,�������ж����
	7.�����ʱ�򣬻ὫԴ�ļ��е������඼������Ӧ��.class�ļ�,����ִ��
	*/
	//���ǵ���ע��
	/*
		���Ƕ���ע��
		���Ƕ���ע��
	*/
	/**
		@author dawen
		@version v0.1
		�����ĵ�ע��
	*/
	
//�����
class Person{
	public static void main(String[] args){
		System.out.println("��������");
	}
}

class Animal{
	public static void main(String[] args){
		System.out.println("���Ƕ�����");
	}
}