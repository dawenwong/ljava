package com.baidu.数组排序;

public class 数组排序 {
	public static void main(String[] args) {
		//一般用二分法查找，先要数组有序，所以就需要各种快速排序的方法
		//内部排序在内存中完成，外部排序就是数据量大，在内存中放不下，需要外部存储设备（磁盘）
		
		//冒泡排序（时间复杂度：O(n^2)）
		int[] arr = new int[] {-87,32,-54,3,44,12,78,12,87,49,67,89,122,456,1024,-123};
		
		//冒泡排序就是相邻两个元素比较大小然后换位置
		//因此需要2层循环，外层循环表示需要的轮数，内层执行比较换位置
		
		for(int i = 0;i < arr.length-1;i++) {  //需要的轮数就是数组的长度减一
			for(int j = 0;j < arr.length-1-i;j++ ) { //每轮都比上一轮执行数减少
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		//快速排序(时间复杂度：O(nlogn))（速速快，使用非常普遍，地位非常高，主要是思想，各种语言底层排序，都已经实现）
		//需要用到递归
		
		
		
		
		//遍历以便数组
		for(int i = 0 ;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
}
