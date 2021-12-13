package com.baidu.overload重载;
/*
 * -重载定义：在同一个类中，允许存在一个以上同名方法，只要它们的参数个数或参数类型不同即可
 * 
 * -例如：Arrays类中的
 *  --sort(byte[] a),sort(short[] a),sort(int[] a),binarySearch()等方法
 * 	--同一类，同一方法名 （两同）
 *  --参数个数不同，参数类型不同
 *  --参数；类型个数相同，顺序位置不同也可以（String str,int i）和（int i,String str）可以重载
 *  
 * 
 * */
public class 方法重载 {
	public static void main(String[] args) {

		int[]  arr  =new int[] {12,34,5,1,33,11,44,21,41,51};
		ArraysUtil arr1 = new ArraysUtil();
		
		arr1.reverse(arr);
		
		方法重载 test = new 方法重载();
		test.getSum("1",1);
 	}
	
	public void getSum(int i,int j) {  //可以重载
		System.out.println("1");   //println其实也是通过方法重载实现的
	}
	public void getSum(int i,double j) {//可以重载
		System.out.println("2");
	}
	public void getSum(int i) {//可以重载
		System.out.println("3");
	}
	
	public void getSum(String s,int i) {//可以重载
		System.out.println("4");
	}
	public void getSum(int i,String s) {//可以重载
		System.out.println("5");
	}
//	public int getSum(int i,int j ) {  //不可以重载
//		return 0;
//	}
	
//	public void getSum(int m,int n) {//不可以重载,形参变量无所谓
//		
//	}
	
//	private void getSum(int i) {//不可以重载
//		
//	}
	
	
}

class ArraysUtil{
	
	//反转数组
	
	public void reverse(int[] arr) {
		for(int i =0;i < arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
 		}
	}
	
	//两个方法名相同，但是参数类型不同构成重载
	public void reverse(String[] arr) {
		for(int i =0;i < arr.length/2;i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
 		}
	}
}
