package com.bidibidi.controller.service;

import com.bidibidi.model.bean.Customer;
/**
 * @author wdw 
 * @version 1.0
 * @date 2021-12-10
 * @email 777@qq.com
 * @Description:内部用数组管理一组customer对象，并提供相应的添加、修改、删除和遍历方法供CustomerView调用
 */
public class CustomerList {

	private Customer[] customers;  //用来保存客户对象的数组
	private int total = 0;   //记录已保存客户对象的数量
	
	
	//构造器
	public CustomerList() {
		//空构造器
	}
	/**
	 * 用来初始化数组大小的构造器，totalCustomer表示数组的大小
	 * 
	 * */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}

	/**
	 * 
	 * @Description:增加客户方法
	 * @authour wdw 
	 * @date 2021-12-10
	 * @param customer
	 * @return true:添加成功 ，false:添加失败
	 */
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length ) {
			return false;
		}
		customers[total] = customer;
		total++;
		return true;
	}
	
	/**
	 * @Description:修改指定索引位置客户信息方法
	 * @authour wdw 
	 * @date 2021-12-10
	 * @param index
	 * @param cust
	 * @return true：修改成功  false：修改失败
	 */
	public boolean replaceCustomer(int index,Customer cust) {
		if(index < 0 || index >= total) {
			return false;
		}
		customers[index] = cust;
		return true;
	} 

	/**
	 * @Description:删除指定索引位置客户
	 * @authour wdw 
	 * @date 2021-12-10
	 * @param index
	 * @return true：删除成功  false:删除失败
	 */
	public boolean deleteCustomer(int index) {
		if(index < 0 || index >= total) {
			return false;
		}
		for(int i = index;i < total-1;i++) {
			customers[i] = customers[i+1];
		}
		//最后一个元素至null
		customers[total-1] = null;
		total--;
		//customers[--total] = null; 先减一
		return true;
	}
	
	/**
	 * @Description:获取全部customer对象的数组
	 * @authour wdw 
	 * @date 2021-12-10
	 * @return custs数组
	 */
	public Customer[] getAllCustomers() {
		
		Customer[] custs = new Customer[total];
		for(int i =0;i < total;i++) {
			custs[i] = customers[i];
		}
		return custs;
	}

	/**
	 * @Description:获取指定索引客户的
	 * @authour wdw 
	 * @date 2021-12-10
	 * @param index
	 * @return 成功返回索引元素，失败返回null
	 */
	public Customer getCustomer(int index) {
		if(index <0 || index >= total) {
			return null;
		}
		return customers[index];
	}
	
	/**
	 * @Description:获取客户总数
	 * @authour wdw 
	 * @date 2021-12-10
	 * @return
	 */
	public int getTotal() {
		return total;
	}
	
	
}
