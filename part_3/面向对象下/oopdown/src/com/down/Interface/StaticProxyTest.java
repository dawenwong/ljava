package com.down.Interface;

/*
 * 静态代理应用例子
 * 
 * 
 * */
public class StaticProxyTest {
	public static void main(String[] args) {
		Singer singer = new Singer();
		
		ProxySinger proxySinger = new ProxySinger(singer);
		
		proxySinger.confer();
		proxySinger.signContract();
		proxySinger.bookTicket();
		proxySinger.sing();
		proxySinger.collectMoney();
	}
}


//接口
interface Star{
	//全局变量
	//public static final Xxx xx;
	
	//抽象方法
	public abstract void confer(); //面谈
	
	public abstract void signContract(); //签合同
	
	public abstract void bookTicket(); //订机票
	
	public abstract void sing(); //唱歌
	
	void collectMoney();  //收钱
}

//被代理实现类
class Singer implements Star{

	//实现接口方法
	@Override
	public void confer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("歌手自己唱歌");
		
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		
	}
	
}

//代理类实现类
class ProxySinger implements Star{
	
	private Star star; // Star star = new Singer();
	
	public ProxySinger(Star star) {
		this.star = star;
	}
	
	//实现接口方法
	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("歌手经纪人去代歌手面谈");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("歌手经纪人去代歌手签合同");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("歌手经纪人去帮歌手订机票");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		star.sing();
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("歌手经纪人去代歌手收钱");
	}
	
}