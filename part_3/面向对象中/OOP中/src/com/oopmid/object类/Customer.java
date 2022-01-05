package com.oopmid.object类;

public class Customer {
	private String name;
	private int age;
	
	public Customer() {
		super();
	}
	
	public Customer(String name,int age) {
		super();
		this.name = name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 重写Object中的equals()方法
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Customer) {
			Customer cust = (Customer)obj;
			//比较两个对象的每个属性都相同
//			if(this.age == cust.age && this.name.equals(cust.name)) {
//				return true;
//			}else {
//				return false;
//			}
			return this.age == cust.age && this.name.equals(cust.name);
//			// age是int类型基本数据类型用==比较，name是string引用类型，只能使用String类重写的equals()方法
		}
		return false;
	}
	
}
