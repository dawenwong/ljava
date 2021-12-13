/* ifelse三个数比大小 */

import java.util.Scanner;
class ifelse三个数比大小{
	public static void main(String[] args){
		//实例化一个scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入num1：");
		int num1 = scan.nextInt();
		System.out.println("请输入num2：");
		int num2 = scan.nextInt();
		System.out.println("请输入num3：");
		int num3 = scan.nextInt();
		int temp;
		//使用if-else嵌套实现
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
		
		//多个if实现
		if(num1>num2){
			temp = num1;
			num1 = num2;
			num2 = temp;  //交换num1和num2的位置
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