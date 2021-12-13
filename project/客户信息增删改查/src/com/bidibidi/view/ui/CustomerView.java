package com.bidibidi.view.ui;

import com.bidibidi.controller.service.CustomerList;
import com.bidibidi.model.bean.Customer;
import com.bidibidi.tools.util.CMUtility;

/**
 * 
 * @author wdw
 * @version 1.0
 * @date 2021-12-10
 * @email 777@qq.com
 * @Description:
 */
public class CustomerView {
	
	private CustomerList customerList = new CustomerList(10);
	
	public CustomerView() {
		Customer customers = new Customer("张三", '男', 23, "13312344567", "zhangsan@qq.com");
		customerList.addCustomer(customers);
	}
	
	/**
	 * @Description:显示主界面方法
	 * @authour wdw
	 * @date 2021-12-10
	 */
	public void enterMainMenu() {
		
		boolean isflag = true;
		
		while(isflag) {
			
			System.out.println("\n---------------------客户信息管理软件---------------------");
			System.out.println("		      1 添加客户");
			System.out.println("		      2 修改客户");
			System.out.println("		      3 删除客户");
			System.out.println("		      4 客户列表  ");
			System.out.println("		      5 退   出\n");
			System.out.print("			请选择 (1-5):");
			
			char menu = CMUtility.readMenuSelection();
			switch(menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomer();
				break;
			case '5':
				//System.out.println("quite");
				System.out.print("确认是否退出(Y/N):");
				char isExit = CMUtility.readConfirmSelction();
				if(isExit == 'Y') {
					isflag = false;
				} //=='N' 就不做处理
				//break;
			}
			//isflag = false;
		}
	}
	
	/**
	 * @Description:添加客户操作
	 * @authour wdw
	 * @date 2021-12-10
	 */
	private void addNewCustomer() {
		//System.out.println("添加客户操作");
		System.out.println("----------------------添加客户-----------------------");
		System.out.print("姓名：");
		String name = CMUtility.readString(10);
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.print("电话：");
		String phone = CMUtility.readString(13);
		System.out.print("邮箱：");
		String email = CMUtility.readString(30);
		
		//将上述数据封装到对象中
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isSuccess = customerList.addCustomer(customer);
		
		//判断是否添加成功
		if(isSuccess) {
			System.out.println("------------------------添加完成-------------------------");
		}else {
			System.out.println("--------------------客户目录已满，添加失败-----------------");
		}
	}
	/**
	 * @Description:修改客户
	 * @authour wdw
	 * @date 2021-12-10
	 */
	private void modifyCustomer() {
		//System.out.println("修改客户");
		
		System.out.println("------------------------修改客户-------------------------");
		Customer cust;
		int number;
		for(;;) {
			System.out.println("请选择待修改客户编号(-1退出)：");
			number = CMUtility.readInt();
			if(number == -1) {
				return;  //结束该方法，return到case 2然后break，回到while循环中
			}
			
			cust = customerList.getCustomer(number - 1);
			
			if(cust == null) {
				System.out.println("无法找到指定客户！");
			}else {
				//找到相应的客户
				break;  //直接结束for循序，然后向下执行
			}
		}
		//结束for循环break后才能执行到这
		//修改客户信息
		System.out.print("姓名（" + cust.getName() +"）：");
		String name = CMUtility.readString(10, cust.getName());
		System.out.print("性别（" + cust.getGender() +"）：");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.print("年龄（" + cust.getAge() +"）：");
		int age = CMUtility.readInt(cust.getAge());
		System.out.print("电话（" + cust.getPhone() +"）：");
		String phone = CMUtility.readString(13,cust.getPhone());
		System.out.print("邮箱（" + cust.getEmail() +"）：");
		String email = CMUtility.readString(30, cust.getEmail());
		
		Customer modifycust = new Customer(name, gender, age, phone, email);
		
		boolean isReplace = customerList.replaceCustomer((number-1), modifycust);
		if(isReplace) {
			System.out.println("------------------------修改成功-------------------------");
		}else {
			System.out.println("------------------------修改失败-------------------------");
		}
		
	}
	/**
	 * @Description:删除客户
	 * @authour wdw
	 * @date 2021-12-10
	 */
	private void deleteCustomer() {
		//System.out.println("删除客户");
		System.out.println("------------------------删除客户-------------------------");
		int number;
		for(;;) {
			System.out.println("请选择待删除客户编号(-1退出)：");
			number = CMUtility.readInt();
			
			if(number == -1) {
				return; //结束该方法回到case 3
			}
			
			Customer customer = customerList.getCustomer(number-1);
			if(customer == null) {
				System.out.println("无法找到指定客户");
			}else {
				break;  //终止for循环
			}
		}
		
		System.out.println("确认是否删除（Y/N）：");
		
		char isDelete = CMUtility.readConfirmSelction();
		
		if(isDelete == 'Y') {
			customerList.deleteCustomer(number - 1 );
		} else {
			return;  //结束该方法,回到住界面
		}
	}
	/**
	 * @Description:显示客户列表操作
	 * @authour wdw
	 * @date 2021-12-10
	 */
	private void listAllCustomer() {
		//System.out.println("显示客户列表操作");
		System.out.println("------------------------客户列表-------------------------");
		int total = customerList.getTotal();
		if(total == 0) {
			System.out.println("没有客户记录！");
			
		}else {
			System.out.println("编号\t姓名 \t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = customerList.getAllCustomers();
			for(int i = 0;i<custs.length;i++) {
				Customer cust = custs[i];
				System.out.println(i+1+"\t"+cust.getName()+"\t"+cust.getGender()+"\t"+cust.getAge()+"\t"+
																	cust.getPhone()+"\t"+cust.getEmail());
			}
		}
		
		
		System.out.println("-----------------------客户列表完成----------------------");
	}
	
	/**
	 * @Description:程序入口
	 * @authour wdw
	 * @date 2021-12-10
	 * @param args
	 */
	public static void main(String[] args) {
		
		CustomerView view = new CustomerView();
		view.enterMainMenu();
		
	}
	
	
}
