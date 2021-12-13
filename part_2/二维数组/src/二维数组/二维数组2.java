package 二维数组;

public class 二维数组2 {
	public static void main(String[] args) {
		//二维数组默认初始化值
		/*
		 * :二维数组分为外层数组和内层数组的元素
		 * :	
		 * :
		 * :
		 * :
		 * :
		 * :
		 * :
		 * */
		
		int[][] arr = new int[3][2];
		System.out.println(arr[0]);  //地址值[I@15db9742
		
		double[][] arr1 = new double[2][2];
		System.out.println(arr1[0]);  //地址值[[D@6d06d69c
		
		float[][] arr2 = new float[2][2];
		System.out.println(arr2[0]);  //地址值[F@7852e922
		

		short[][] arr3 = new short[2][2];
		System.out.println(arr3[0]);  //地址值[S@4e25154f
		
		byte[][] arr6 = new byte[2][2];
		System.out.println(arr6[0]);   //[B@70dea4e
		
		String[][] arr4 = new String[2][2];
		System.out.println(arr4[0]);  //地址值[Ljava.lang.String;@70dea4e
		System.out.println(arr4[0][0]);
		
		char[][] arr5 = new char[2][2];
		System.out.println(arr5[0]);   //地址值[C@5c647e05
		
		
		String[][] arr7 = new String[2][];
		System.out.println(arr7[0]);  //null
		//System.out.println(arr7[0][0]); //报错
		
		
		
		
		
		
		
	}
}
