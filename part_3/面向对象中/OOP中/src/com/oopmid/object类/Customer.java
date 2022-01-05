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

	//(shift+alt+s)自动生成 equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	
	//自己手写
	// 重写Object中的equals()方法
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) {
//			return true;
//		}
//		if(obj instanceof Customer) {
//			Customer cust = (Customer)obj;
//			//比较两个对象的每个属性都相同
////			if(this.age == cust.age && this.name.equals(cust.name)) {
////				return true;
////			}else {
////				return false;
////			}
//			return this.age == cust.age && this.name.equals(cust.name);
////			// age是int类型基本数据类型用==比较，name是string引用类型，只能使用String类重写的equals()方法
//		}
//		return false;
	//}
	
	//手动实现toString()方法
//	@Override
//	public String toString() {
//		return "Customer[name = "+name+",age = "+age+"]";
//	}
	//自动实现
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
	
}
