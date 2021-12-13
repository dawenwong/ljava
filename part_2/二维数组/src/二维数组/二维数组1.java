package 二维数组;

/*
 * @一个数组嵌套一个数组就构成二维数组，数组本质是没有二维多维的概念
 * */
public class 二维数组1 {
	public static void main(String[] args) {
		//一维数组声明和初始化
		int[] arr = new int[] {1,2,3}; //一维数组
		int[] arr1 = {1,2,3}; //类型推断，简写
		//二维数组静态声明和初始化
		int[][] arr2 = new int[][] {{1,2,3},{4,5},{9,8,7}}; //二维数组
		int[][] arr3 = {{1,2,3},{4,5},{9,8,7,10}}; //二维数组，类型推断，简写
		
		//动态初始化
		String[][] str = new String[3][2];  //可以理解为三行两列，
		String[][] str1 = new String[3][];  //这样也可以
		
		//二维数组的元素调用
		System.out.println(arr3[2][2]);   //7
		
		//获取数组的长度
		System.out.println(arr2.length);  //3,相当于外层数组的长度 
		System.out.println(arr3[2].length);//4，内层数组的长度
		
		//遍历二维数组(三维数组需要三层for循环)
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
