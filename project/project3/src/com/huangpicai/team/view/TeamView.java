package com.huangpicai.team.view;
/*
 * TeamView
	- listSvc: NameListService =new NameListService()
	- teamSvc: TeamService=new TeamService()
	----------------------------------------------------
	+ enterMainMenu(). void
	- listAIEmployees(): void
	- getTeam(); void
	- addMember() void
	- deleteMember(). void
	+ main(args:String[]): void
	
	·说明:
		listSvc和teamSvc属性;供类中的方法使用
		enterMainMenu()方法:主界面显示及控制方法.
		以下方法仅供enterMainMenu()方法调用:
			listAllEmployees()方法:以表格形式列出公司所有成员
			getTeam()方法:显示团队成员列表操作
			addMember()方法:实现添加成员操作
			deleteMember()方法:实现删除成员操作
 * */

import com.huangpicai.team.domain.Employee;
import com.huangpicai.team.domain.Programmer;
import com.huangpicai.team.service.NameListService;
import com.huangpicai.team.service.TeamException;
import com.huangpicai.team.service.TeamService;

public class TeamView {
	
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();
	
	public static void main(String[] args) {
//		System.out.println("-----------------------------------------------------------");
		TeamView team = new TeamView();
		team.enterMainMenu();
		
	}
	
	public void enterMainMenu() {
		
		boolean loopFlag = true;
		char menu = 0;
		while(loopFlag) {
			if(menu != '1') {
				
				listAllEmployees();
			}
			System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出请选择(1-4)：");
			menu = TSUtility.readMenuSelection();
			switch(menu) {
			case '1':
				getTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
//				System.out.println("退出");
				System.out.println("确认是否退出(Y/N)：");
				char isQuit = TSUtility.readConfirmSelection();
				if(isQuit == 'Y') {
					loopFlag = false;
				}
				break;
			}
		}
	}
	
	//以下私有方法供enterMainMenu使用
	/**
	 * 
	 * @Title: listAllEmployees   
	 * @Description:显示所有员工信息
	 * @author: wdw   
	 * @param:       
	 * @return: void      
	 * @throws
	 */
	private void listAllEmployees() {
		// System.out.println("显示公司所有信息");
		System.out.println("---------------------------------开发团队调度软件---------------------------------\n");
		
		Employee[] employees = listSvc.getAllEmployees();
		if( employees == null || employees.length == 0) {
			System.out.println("公司没有任何员工信息！！！");
		}else {
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			for(int i = 0; i < employees.length;i++) {
				System.out.println(employees[i].toString());
			}
		}
		
		System.out.println("--------------------------------------------------------------------------------\n");
	}
	
	private void getTeam() {
		// System.out.println("查看开发团队情况");
		System.out.println("---------------------------------团队成员列表---------------------------------\n");
		Programmer[] team = teamSvc.getTeam();
		if(team == null || team.length == 0) {
			System.out.println("开发团队中目前没有成员");
		}else {
			System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票\n");
			for(int i = 0; i < team.length ; i++) {
				System.out.println(team[i].getDetailForTeam());
			}
		}
		
		System.out.println("--------------------------------------------------------------------------------\n");
	}
	
	private void addMember() {
		//System.out.println("添加团队成员");
		System.out.println("---------------------------------添加成员---------------------------------\n");
		System.out.println("请输入要添加的员工ID：");
		int id = TSUtility.readInt();
		
		try {
			
			Employee emp = listSvc.getEmployee(id);
			
			teamSvc.addMember(emp); 
			System.out.println("添加成功");
			
		}catch (TeamException e) {
			
			System.out.println("添加失败，原因："+e.getMessage());
		}
		
		//按回车键继续
		TSUtility.readReturn();
		
		System.out.println("--------------------------------------------------------------------------------\n");
	}
	
	private void deleteMember() {
		// System.out.println("删除团队成员");
		System.out.println("---------------------------------删除员工---------------------------------\n");
		System.out.println("请输入要删除员工的TID：");
		int memberId = TSUtility.readInt();
		System.out.println("确认是否删除Y/N：");
		char isDelete = TSUtility.readConfirmSelection();
		
		if(isDelete == 'N') {
			return;
		}
		
		try {
			teamSvc.removeMember(memberId);
			System.out.println("删除成功");
		} catch (TeamException e) {
			
			System.out.println("删除失败，原因："+e.getMessage());
		} 
		
		//按回车键继续
		TSUtility.readReturn();
		System.out.println("--------------------------------------------------------------------------------\n");
	}
	
}
