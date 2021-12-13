package com.baidu.array;

import java.util.Scanner;

public class 数组练习二 {
	public static void main(String[] args) {
		// 1.使用scanner读取数据
		Scanner scanner = new Scanner(System.in); // 快捷键 ctrl +shift+o，自动导包
		System.out.println("请输入学生人数");
		int number = scanner.nextInt();
		// 2.根据读取的数据数据创建一个数组，并使用动态初始化数组
		int[] Scores = new int[number];
		// 3.给数组中的元素赋值
		int max = 0;
		System.out.println("请输入" + number + "个学生成绩分数：");
		for (int i = 0; i < Scores.length; i++) {
			Scores[i] = scanner.nextInt();
			if (max < Scores[i]) {
				max = Scores[i];
			}
		}
		// 4、获取数组中元素的最大值即最高分
		/*
		 * int max = 0; for (int i = 0; i < Scores.length; i++) { if (max < Scores[i]) {
		 * max = Scores[i]; } }
		 */
		// 5、遍历数组输出每个学生成绩，并根据成绩判断等级，输出等级
		char level;
		for (int i = 0; i < Scores.length; i++) {
			if (max - Scores[i] <= 10) {
				level = 'A';
			} else if (max - Scores[i] <= 20) {
				level = 'B';
			} else if (max - Scores[i] <= 30) {
				level = 'C';
			} else {
				level = 'D';
			}
			System.out.println("Students " + (i+1) + " score is " + Scores[i] + " ,grade is " + level);
		}
	}
}
