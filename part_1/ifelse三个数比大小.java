/* ifelse�������ȴ�С */

import java.util.Scanner;
class ifelse�������ȴ�С{
	public static void main(String[] args){
		//ʵ����һ��scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������num1��");
		int num1 = scan.nextInt();
		System.out.println("������num2��");
		int num2 = scan.nextInt();
		System.out.println("������num3��");
		int num3 = scan.nextInt();
		int temp;
		//ʹ��if-elseǶ��ʵ��
		/* if(num1 >= num2 ){
			if(num3>=num1){
				System.out.println(num2+" < "+num1+" < "+num3);
			}else if(num3 <= num2){
				System.out.println(num3+" < "+num2+" < "+num1);
			}else{
				System.out.println(num2+" < "+num3+" < "+num1);
			}
		}else{
			if(num3>=num2){
				System.out.println(num1+" < "+num2+" < "+num3);
			}else if(num3 <= num1){
				System.out.println(num3+" < "+num1+" < "+num2);
			}else{
				System.out.println(num1+" < "+num3+" < "+num2);
			}
		} */
		
		//���ifʵ��
		if(num1>num2){
			temp = num1;
			num1 = num2;
			num2 = temp;  //����num1��num2��λ��
		}
		if(num1>num3){
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2>num3){
			temp = num2;
			num2 = num3;
			num3 = temp; 
		}
		System.out.println(num1+" < "+num2+" < "+num3);
	}
	
}