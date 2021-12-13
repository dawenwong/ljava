package com.baidu.oop练习;
//对StudentTest1进行改进，将实现的方法写到类中
public class StudentTest2 {
	public static void main(String[] args) {
		//创建一个Student的数组
		Student[] stus = new Student[20];
		
		for(int i = 0;i < 20;i++) {
			
			stus[i] = new Student();  //实例化student对象
			
			stus[i].number = i+1;  //学号1-20号
			
			stus[i].state = (int)(Math.random()*(6-1+1)+1);  //年级1-6年级
			
			stus[i].score = (int)(Math.random()*(100-0+1)); //0-100分
			
		}
		
		Student.display(stus);
		System.out.println("*************************************");
		Student.infoSearch(stus, 2);
		System.out.println("*************************************");
		Student[] stus1 = Student.scoreSort(stus);
		Student.display(stus1);
	}
}
