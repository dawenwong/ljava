package com.down.Interface;
/*
 *面向接口编程
 *
 *接口的使用：
 *	接口使用也满足多态性
 *	接口是一种规范
 * 
 * 
 * */
public class USBTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		//创建接口的非匿名实现类的非匿名对象
		Flash flash = new Flash();
		computer.work(flash);   // USB usb = new Flash();接口多态性体现
		
		Printer printer = new Printer();
		computer.work(printer);  // USB usb = new Printer();接口多态性体现
		
		//匿名实现类
		//创建接口的非匿名类的匿名对象
		computer.work(new Printer());
		
		//创建接口的匿名类的非匿名对象
		USB phone = new USB() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("手机连接成功");
			}
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("手机断开连接");
			}
		};
		computer.work(phone);
		
		
		////创建接口的匿名类的匿名对象
		computer.work(new USB() {
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("电视连接成功");
				
			}
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("电视断开连接");
			}
		});
		
		
	}
}

class  Computer{
	
	public void work(USB usb) { //形参为接口  
		usb.start();
		System.out.println("开始传输数据");
		usb.stop();
	}
}
interface USB{
	//1.定义全局常量 ，
//	public static final int AA = 1;
	
	//2.抽象方法
	public abstract void start();
	
	void stop();

}

//接口实现类
class Flash implements USB{
	
	//实现接口中抽象方法
	@Override
	public void start() {
		System.out.println("U盘连接成功");
	}
	@Override
	public void stop() {
		System.out.println("U盘断开连接");
	}	
	
}

class Printer implements USB{
	
	@Override
	public void start(){
		System.out.println("打印机连接成功");
	}
	@Override
	public void stop() {
		System.out.println("打印机断开连接");
	}
}