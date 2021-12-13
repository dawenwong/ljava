package com.baidu.oop练习;

public class Student {
	
	int number;
	int state;
	int score;
	
	/**
	 * studenttest2的方法
	 * */
	public static void display(Student[] stus) {//必须要加static 不然其他文件内无法调用
		for(int i = 0;i < stus.length;i++) {
			System.out.println("学号："+stus[i].number+",  年级："+stus[i].state+",  分数："+stus[i].score);
		}
	}
	
	public static void infoSearch(Student[] stus,int num) {
		for(int i = 0;i < stus.length;i++) {
			if(stus[i].state == num) {
				stus[i].info();
			}
		}
	}
	
	public static Student[] scoreSort(Student[] stus) {
		for(int i = 0;i < stus.length;i++) {
			for(int j = 0;j<stus.length-1-i;j++) {
				if(stus[j].score>stus[j+1].score) {
					Student temp = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = temp; 
				}
			}
		}
		return stus;
	}
	/**
	 * studenttest1的方法
	 * */
	public void info() {
		System.out.println("学号："+number+",  年级："+state+",  分数："+score);
	}
}
