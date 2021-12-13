/* 求两个数的最大公约数和最小公倍数 */

import java.util.Scanner;

class 最大公约数和最小公倍数{
	
	public static void main(String[] args){
		//实例化一个scanner
		Scanner scan = new Scanner(System.in);
	
		System.out.println("请输入第一个整数：");
		int m = scan.nextInt();  //获取第一个整数
		System.out.println("请输入第二个整数：");
		int n = scan.nextInt();  //获取第二个整数
	
		//最大公约数肯定小于两个数中较小的一个	
		int min = ( m <= n )?m:n;
	
		for(int i=min;i >= 1;i-- ){  //从两个数中较小的一个开始向小找，
			if(m%i==0 && n%i==0){  //第一个能同时被两个数整除的就是最大公约数
				System.out.println("最大公约数是：" + i);
				break;  //找到第一个就退出for循环
			}
		}
		
		//最小公倍数是小于等于两个数乘积的,且大于等于两个数中较大的一个
		int max = (m >= n)?m:n; //取两个数种最大的一个
		for(int i = max;i <= m*n;i++){
			if(i%m==0 && i%n==0){
				System.out.println("最小公倍数是：" + i);
				break; //找到第一个就退出for循环
			}
		}
	}	
}