/*
	if-else �ṹ
*/
//������import java.util.Scanner;

import java.util.Scanner;

public class ���̿���if_else�ṹ{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in); //ʵ����һ��scanner
		
		//int score = scan.nextInt();  //����scan��nextInt()����
		//System.out.println("�����ǣ�"+score);
		
		System.out.println("���������������");
		String name = scan.next();   //Sring ��next()
		System.out.println(name);
		
		System.out.println("����������䣺");
		short age = scan.nextShort(); 
		System.out.println(age);
		
		System.out.println("������������أ�");
		double weight = scan.nextDouble();
		System.out.println(weight);
		
		System.out.println("�������Ƿ���");
		boolean isSingle = scan.nextBoolean();
		System.out.println(isSingle);
		
		System.out.println("�������Ա�");
		String gender = scan.next();
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);
			
	}
	
}
