package com.baidu.oop练习;

public class 匿名对象 {
	
	public static void main(String[] args) {
		
		
		new Phone().sendMail();
		new Phone().playGame(); //这样使用匿名对象，相当于在堆中new了两个独立的对象，且只能是用一次。
		
		//匿名对象经常使用的方式
		test(new Phone());
		
	}
	
	
	public static void test(Phone phone) {
		phone.sendMail();
		phone.playGame();
	}

}


class Phone{
	
	public void sendMail() {
		System.out.println("发消息");
	}
	
	public void playGame() {
		System.out.println("打游戏");
	}

	
}