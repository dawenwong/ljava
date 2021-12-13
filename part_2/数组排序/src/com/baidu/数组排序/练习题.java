package com.baidu.数组排序;

public class 练习题 {
	public static void main(String[] args) {
		int[] arr = new int[] {34,5,22,-98,6,-76,0,-3};
		
		//使用冒泡排序对上面的数组排序
		
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = 0;j < arr.length- 1-i;j++) {
				if(arr[j]>arr[j+1]) {  //从小到大排序
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//反转上面的数组
		for(int i = 0; i < arr.length/2;i++) { 
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		//复制上面的数组
		
		int[] arr1 = new int[arr.length];
		for(int i = 0;i < arr1.length;i++) {
			arr1[i] = arr[i];
		}
		
		//线性查找某个值是否在数组中
		int dest = 29;
		boolean isflag = true;
		for(int i = 0; i < arr.length;i++) {
			if(dest == arr[i]) {
				System.out.println("找到了 索引为" + i);
				isflag = false;
			}
		}
		if(isflag) {
			System.out.println("没找到");
		}
		
		
		for(int i = 0;i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
