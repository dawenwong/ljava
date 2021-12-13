package com.oopmid.继承性练习;

public class ManKind {
	
	private int sex;
	private int salary;
	
	
	//构造器
	public ManKind() {
		
	}
	
	public ManKind(int sex,int salary) {
		this.sex = sex;
		this.salary = salary;
	}
	
	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public  void manOrWoman() {
		if(sex == 1) {
			System.out.println("man");
		}else if(sex == 0){
			System.out.println("woman");
		}
	}
	
	public void isEmployeed(){
		
		String jobInfo = (salary == 0)?"no job" : "job";
		System.out.println(jobInfo);
	}
}
