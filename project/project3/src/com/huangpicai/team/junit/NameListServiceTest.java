package com.huangpicai.team.junit;

import org.junit.Test;

import com.huangpicai.team.domain.Employee;
import com.huangpicai.team.service.NameListService;
import com.huangpicai.team.service.TeamException;

public class NameListServiceTest {
	@Test
	public void testGetAllEmployees() {
		NameListService service = new NameListService();
		Employee[] employees = service.getAllEmployees();
		for(int i = 0 ; i < employees.length;i++) {
//			System.out.println(employees[i].toString());//会自动调用toString()方法
			System.out.println(employees[i]);
		}
	}
	
	@Test
	public void testGetEmployee() {
		NameListService service = new NameListService();
		int id = 1;
		id = 7;
		try {
			Employee e1 = service.getEmployee(id);
			System.out.println(e1.toString());
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
	}
}
