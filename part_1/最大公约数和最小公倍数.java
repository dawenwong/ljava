/* �������������Լ������С������ */

import java.util.Scanner;

class ���Լ������С������{
	
	public static void main(String[] args){
		//ʵ����һ��scanner
		Scanner scan = new Scanner(System.in);
	
		System.out.println("�������һ��������");
		int m = scan.nextInt();  //��ȡ��һ������
		System.out.println("������ڶ���������");
		int n = scan.nextInt();  //��ȡ�ڶ�������
	
		//���Լ���϶�С���������н�С��һ��	
		int min = ( m <= n )?m:n;
	
		for(int i=min;i >= 1;i-- ){  //���������н�С��һ����ʼ��С�ң�
			if(m%i==0 && n%i==0){  //��һ����ͬʱ�������������ľ������Լ��
				System.out.println("���Լ���ǣ�" + i);
				break;  //�ҵ���һ�����˳�forѭ��
			}
		}
		
		//��С��������С�ڵ����������˻���,�Ҵ��ڵ����������нϴ��һ��
		int max = (m >= n)?m:n; //ȡ������������һ��
		for(int i = max;i <= m*n;i++){
			if(i%m==0 && i%n==0){
				System.out.println("��С�������ǣ�" + i);
				break; //�ҵ���һ�����˳�forѭ��
			}
		}
	}	
}