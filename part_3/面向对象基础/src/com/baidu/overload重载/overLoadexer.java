package com.baidu.overload重载;

public class overLoadexer {
		public static void main(String[] args) {
			overLoadexer ol = new overLoadexer();
			ol.mol(2);
			ol.mol(4,5);
			ol.mol("ABC");
			
			ol.max(2,1);
			ol.max(5.0,9.8);
			ol.max(4.0,6.1,7.1);
		}
		
		

		public void mol(int i) {
			
			System.out.println(i*i);
		}
		
		public void mol(int i,int j) {
			System.out.println(i*j);
		}
		
		public void mol(String s) {
			System.out.println(s);
		}
		
		
		public void max(int i,int j) {
			int max;	
			max = (   i > j )  ?  i  :  j ;
			System.out.println(max);
		}
		
		public void max(double i,double j) {
			double max;
			max = (i>j) ? i   :   j;
			System.out.println(max);
		}
		
		public void max(double i,double j,double k) {
			double max;
			max = (i	>	j)?	i	:	j;
			max = (max > k)? max : k;
			
			System.out.println(max);
		}
}



	
	
