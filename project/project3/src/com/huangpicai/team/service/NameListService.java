
package com.huangpicai.team.service;

import com.huangpicai.team.domain.*;
//import com.huangpicai.team.domain.Equipment;
//import com.huangpicai.team.domain.Programmer;
// import static com.huangpicai.team.service.Data.*;

/**
 * 
* <p>Title: NameListService</p>  
* <p>Description:负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]方法 </p>  
* @author 129
* @date 2022年1月12日
 */
public class NameListService {
	private Employee[] employees;
	
	/**
	 * 
	* <p>Title: </p>  
	* <p>Description: 给Employees及数组元素进行初始化</p>
	 */
	public NameListService() {
		super();
//		1.根据项目提供的Data类构建相应大小的employees数组
//		2.再根据Data类中的数据构建不同的对象，包括Employee、Programmer、
//		Designer和Architect对象，以及相关联的Equipment子类的对象
//		3.将对象存于数组中
		employees = new Employee[Data.EMPLOYEES.length];
		for(int i = 0;i < employees.length;i++) {
			//获取员工的类型
			int type =Integer.parseInt( Data.EMPLOYEES[i][0]);
			
			//获取Employee的4个基本信息
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Integer.parseInt(Data.EMPLOYEES[i][4]);
			
			Equipment equipment;
			double bonus;
			int stock;
			
			switch (type) {
			case Data.EMPLOYEE:
				employees[i] = new Employee(id,name,age,salary);
				break;
			case Data.PROGRAMMER:
				equipment = createEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;
			case Data.DESIGNER:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				employees[i] = new Designer(id,name,age,salary,equipment,bonus);
				break;
			case Data.ARCHITECT:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;
			}
		}
		
	}
	/**
	 * 
	 * <p>Title: createEquipment</p>  
	 * <p>Description: 获取指定index上的员工的设备</p>  
	 * 2022年1月12日
	 * @param i
	 * @return
	 * Equipment
	 */
	private Equipment createEquipment(int index) {
		//取index = 0 的数，和对应的设备名
		int type = Integer.parseInt(Data.EQUIPMENTS[index][0]);
		String model = Data.EQUIPMENTS[index][1];
		
		switch(type) {
		
		case Data.PC: //21
			String display = Data.EQUIPMENTS[index][2];
		
			return new PC(model,display);
		
		case Data.NOTEBOOK: //22
		
			double price = Double.parseDouble(Data.EQUIPMENTS[index][2]);
			
			return new NoteBook(model,price);
		
		case Data.PRINTER: //23
			
			return new Printer(model, Data.EQUIPMENTS[index][2]);
		}
		
		return null;
	}
	
	/**
	 * 
	 * <p>Title: getAllEmployees</p>  
	 * <p>Description: 获取当前所有员工</p>  
	 * 2022年1月12日
	 * @return
	 * Employee[]
	 */
	public Employee[] getAllEmployees() {
		
		return employees;
	}
	/**
	 * 
	 * <p>Title: getEmployee</p>  
	 * <p>Description: 找指定id的员工</p>  
	 * 2022年1月12日
	 * @param id
	 * @return
	 * Employee
	 */
	public Employee getEmployee(int id) throws TeamException{
		for(int i = 0;i < employees.length;i++ ) {
			if(employees[i].getId() == id) {
				return employees[i];
			}
		}
		throw new TeamException("找不到指定的员工");
	}
	

}
