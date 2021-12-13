package com.baidu.ArrayExercise;

public class 杨辉三角 {
	public static void main(String[] args) {
		//输出一个10行的杨辉三角形
		//声明一个10行的二维数组
		int[][] yangHui = new int[10][];
		
		//给外层数组循环赋值
		for (int i = 0; i < yangHui.length; i++) {
			//给外层数组赋值，只能是数组
			//yangHui[i] = i+1; //Type mismatch: cannot convert from int to int[]
			yangHui[i] = new int[i+1];
			
			//给首末元素赋值
			yangHui[i][0] = 1;
			yangHui[i][i] = 1;
			//给每行的非首末元素赋值
			//if(i > 1) {
			for(int j = 1;j < yangHui[i].length - 1;j++) {
				yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j]; 
			}
			//}
		}
		
		//遍历内层数组
		for(int i = 0;i < yangHui.length;i++) {
			for(int j = 0;j < yangHui[i].length;j++) {
				System.out.print(yangHui[i][j]+"  ");
			}
		System.out.println();
		}
	}
}
