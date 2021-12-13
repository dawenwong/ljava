package com.baidu.数组排序;

import java.util.Arrays;

//数组常见的操作其实是由工具类的
//比自己实现的工具更好
// Arrays 在java的util中



public class 数组工具类 {
	public static void main(String[] args) {
		
		//boolean equals(int[] a,int[] b) 判断两个数组是否相等
		
		int[] arr = new int[] {1,2,3};
		
		int[] arr1 = new int[] {1,3,2};
		
		boolean isQueal = Arrays.equals(arr,arr1);
		
		System.out.println(isQueal);
		
		
		
		//String toString(int[] a)  输出数组信息
		String arrStr = Arrays.toString(arr);
		//省去每次都要查看数组内容遍历
		System.out.println(arrStr);
		
		
		
		//void fill(int[] a,int val)  将指定值填充到数组之中
			Arrays.fill(arr, 100);
			System.out.println(Arrays.toString(arr));  //100
		
		
		//void sort(int[] a)   对数组进行排顺
			
			Arrays.sort(arr1);
			System.out.println(Arrays.toString(arr1));
		
		//int binarySearch(int[] a,int key)  对排序后的数组进行二分法查找检索指定的值
			int[] arr3 = new int[] {-87,32,-54,3,44,12,78,12,87,49,67,89,122,456,1024,-123};
			Arrays.sort(arr3);
			System.out.println(Arrays.toString(arr3));
			
			int keyValue = Arrays.binarySearch(arr3, 87);
			if(keyValue >=0) {
				System.out.println(keyValue);
			}else { //keyValue < 0
				System.out.println("没找到");
			}
			
			
			
			
			
			
			
			
	}
}
