/* if-else 成绩判断 */

import java.util.Scanner;

class ifelse成绩判断{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);  //实例化一个scanner
		
		System.out.println("请输入期末成绩：");
		int score = scan.nextInt();
		
		if(score > 90 && score <= 100){
			System.out.println("一等奖，奖金10000元");
		}else if(score>80 && score<=90){
			System.out.println("二等奖，奖金5000元");
		}else if(score >=60 && score <=80){
			System.out.println("三等奖，奖金1元");
		}else{
			System.out.println("滚！！！补考");
		}
	}
	
}