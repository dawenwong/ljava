package com.baidu.数组复制反转查找;

public class 数组复制反转查找 {
	public static void main(String[] args) {
		String[] arr;
		arr = new String[] {"AA","BB","CC","DD","EE","FF","GG","HH"};
		
		//arr1 = arr 这种不是复制，是赋值
		//数组复制
		String[] arr1 = new String[arr.length];
		for(int i = 0;i < arr1.length;i++) {
			arr1[i] = arr[i];
		}
		
		
		//数组反转
		for(int i = 0;i < arr.length/2;i++) { //不除2就是换两边又换回来了
			String temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		
		//数组反转2
		for(int i = 0,j = arr.length-1;i<j;i++,j--) {
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
//		for(int i =0;i < arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
		
		//查找（线性查找，二分法查找）
		//线性查找，一个个找
		//在arr中查找BB
		String dest = "BB";
		boolean isfalg = true;
		
		for(int i = 0;i < arr.length;i++) {
			
			if(dest.equals(arr[i])) {
				//System.out.println("找到了指定的元素位置index为：" + i);
				isfalg = false;
				break;
			}
		}
		if(isfalg) {
			//System.out.println("很遗憾，没找到");
		}
		
		
		//二分法查找
		//二分法查找前提是数组必须有序，arr这种就不行
		//arr2 有大小顺序
		int[] arr2 = new int[] {-76,-23,-10,0,2,45,78,124,245,368,667,981};
		
		int dest1 = -10;
		
		int head = 0;
		int end = arr2.length-1;
		boolean isflag1 = true;
		while(head<=end) {
			int middle = (head+end)/2;
			if(dest1 == arr2[middle]) {
				System.out.println("找到了指定的元素位置index为：" + middle);
				isflag1 = false;
				break;
			}else if(dest1<arr2[middle]) {
				end = middle-1;
			}else {  //dest1 >arr2[middle]
				head = middle + 1;
			}
		}
		
		if(isflag1) {
			System.out.println("很遗憾，没找到");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
