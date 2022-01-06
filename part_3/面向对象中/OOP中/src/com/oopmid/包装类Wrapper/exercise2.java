package com.oopmid.包装类Wrapper;

import java.util.Scanner;
import java.util.Vector;

/*
 * 	利用Vector代替数组处理：从健盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
	提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
	而向量类java.uti1.Vector可以根据需要动态伸缩。
	创建Vector对象：Vector v=new Vector（）；给向量添加元素：V.addElement（Object obj）；
	obj必须是对象取出向量中的元素：Object obj=v.elementAt（e）；注意第一个元素的下标是e，返回值是Object类型的。
	计算向量的长度；V.size（）；若与最高分相差10分内：A等；20分内；B等；30分内：C等；其它：D等
 * */
public class exercise2 {
	
	public static void main(String[] args) {
		
		//实例化scanner 用于从键盘获取输入的成绩
		Scanner scan  = new Scanner(System.in); 
		//创建一个Vector动态添加，不同初始给定一个长度,替代数组
		Vector v = new Vector();
		//使用for(;;)或while(true)相vector中添加数据v.addElement(Object obj)
		double maxScore = 0.0;
		for(;;) {
			System.out.println("请输入学生成绩(输入负数退出)： ");
			double score = scan.nextDouble();
			//当输入负数时跳出循环
			if(score<0){
				break;
			}
			if(score>100.0) {
				System.out.println("输入的数据非法，请重新输入： ");
				continue;
			}
			//添加成绩到vector中
			//5.0之前
//			Double scoreDouble = score;  // 将基础数据类型转换为包装类引用类型
//			v.addElement(scoreDouble);
			//5.0之后
			v.addElement(score); //自动装箱
			//获取成绩的最大值
			if(maxScore<score) {
				maxScore = score;
			}
			
		}
		
		//遍历，每个成绩和最大成绩比较，进行评分
		char level;
		for (int i = 0; i < v.size(); i++) {
			Object obj = v.elementAt(i); //取每个元素
			//5.0之前
			Double inScore = (Double)obj;
			double score = inScore.doubleValue();
			
			if(maxScore - score <=10) {
				level = 'A';
			}else if(maxScore - score <= 20) {
				level = 'B';
			}else if(maxScore-score<=30) {
				level = 'C';
			}else {
				level = 'D';
			}
			System.out.println("Student- "+i+" score is "+score+" ,level is "+level);
		}
			
			
	}
		
		
		
}
