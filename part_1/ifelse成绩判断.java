/* if-else �ɼ��ж� */

import java.util.Scanner;

class ifelse�ɼ��ж�{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);  //ʵ����һ��scanner
		
		System.out.println("��������ĩ�ɼ���");
		int score = scan.nextInt();
		
		if(score > 90 && score <= 100){
			System.out.println("һ�Ƚ�������10000Ԫ");
		}else if(score>80 && score<=90){
			System.out.println("���Ƚ�������5000Ԫ");
		}else if(score >=60 && score <=80){
			System.out.println("���Ƚ�������1Ԫ");
		}else{
			System.out.println("������������");
		}
	}
	
}