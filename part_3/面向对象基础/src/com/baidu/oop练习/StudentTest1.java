package com.baidu.oop练习;

public class StudentTest1 {
	
	public static void main(String[] args) {
		
		//创建20个学生
		/*
		Student stu1 = new Student(); 
		Student stu2 = new Student();
		Student stu3 = new Student();
		Student stu4 = new Student();
		Student stu5 = new Student();
		Student stu6 = new Student();
		Student stu7 = new Student();
		Student stu8 = new Student();  //非常傻逼的写法
		Student stu9 = new Student();
		*/
		
		//创建一个studen类型的数组，这个数组储存的是studen对象
		
		Student[] stus = new Student[20];  //String[] str = new String[];和这个类似
		
		for(int i = 0;i < stus.length;i++) {
			//给数组元素赋值
			stus[i]  = new Student();
			//给每个元素对象赋值
			stus[i].number = i+1;
			//年级在【1-6】
			stus[i].state = (int)(Math.random()*(6-1+1)+1);
			//成绩在【0-100】
			stus[i].score = (int)(Math.random()*(100-0+1));	
		}
		
		//打印年级是3的学生的信息
//		for(int i = 0;i < stus.length;i++) {
//			if(stus[i].state == 3) {
//				stus[i].info();
//			}
//		}
		
		//对学生的成绩进行冒泡排序，注意这里普通数组不同，这里交换不是成绩位置，而是整个学生的信息
		for(int i = 0;i < stus.length;i++) {
			for(int j = 0;j < stus.length -1 -i;j++) {
				if(stus[j].score > stus[j+1].score) {
					Student temp = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = temp;	
				}
			}
		}
		
		
		//遍历学生数组
		for(int i = 0;i < stus.length;i++) {
			//System.out.println(stus[i]); //打印出的是对象的地址
			//System.out.println(stus[i].number+" "+stus[i].state+" "+stus[i].score);
			stus[i].info();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
