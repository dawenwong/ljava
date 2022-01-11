package com.erroException.TryCatchFinally;
/*
 * 手动抛出异常throw new 异常类型()
 * 
 * */
public class StudentTest {
	public static void main(String[] args) {
		
		try {
			Student s = new Student();
			s.regist(-1);
			System.out.println(s);
		} catch (MyException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}

class Student{
	int id;
	
	public void regist(int id){
		if(id>0) {
			this.id = id;
		}else {
//			System.out.println("您输入的数据非法");
			//手动抛出异常对象throw 注意：没有“s”
			//throw new RuntimeException("您输入的数据非法");
//			throw new Exception("您输入的数据非法");
			throw new MyException("不能输入负数");
		}
		
	}
	
}