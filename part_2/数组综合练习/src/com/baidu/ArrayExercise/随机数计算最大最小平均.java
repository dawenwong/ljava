package com.baidu.ArrayExercise;

/*
 * 
 * 
 * @[10,99] 随机数生成
 * @公式：
 * @	(int)(Math.random()*(99-10+1)+10)
 * */

public class 随机数计算最大最小平均 {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0;i < arr.length;i++) {
			arr[i] = (int)(Math.random()*(99-10+1)+10);
			//System.out.println(arr[i]);
		}
		
		//最大值
		int maxValue = arr[0]; //防止负数，不能初始值赋值0
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>maxValue) {
				maxValue = arr[i];
			}
		}
		System.out.println("最大值是： "+ maxValue);
		//最小值
		int minValue = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i]<minValue) {
				minValue = arr[i];
			}
		}
		System.out.println("最小值是： "+ minValue);
		//平均值
		//总和
		
		int sumValue = 0;  //总和可以赋值为0
		for(int i = 0;i < arr.length;i++) {
				sumValue += arr[i];
		}
		System.out.println("总和是： "+ sumValue);
		System.out.println("平均值是： "+ (sumValue/10));
		
	}
}
