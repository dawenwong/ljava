package com.oopmid.继承性练习;

public class KidsTest {
	public static void main(String[] args) {
		Kids kid1 = new Kids(12);
		
		kid1.printAge();
		kid1.setSalary(0);
		kid1.setSex(1);
		kid1.manOrWoman();
		kid1.isEmployeed();
	}
}
