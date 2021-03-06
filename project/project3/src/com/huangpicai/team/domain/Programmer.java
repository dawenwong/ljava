package com.huangpicai.team.domain;

import com.huangpicai.team.service.Status;

public class Programmer extends Employee{
	private int memberId; //团队id
	private Status status = Status.FREE; //工作状态
	private Equipment equipment;
	
	public Programmer() {
		super();
	}

	public Programmer(int id,String name,int age,double salary,Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	

	
	@Override
	public String toString() {
		return getDetails() + "\t程序员\t" + status +"\t\t\t" + equipment.getDescription();
	}
	
	public String getTeamBase() {
		return memberId+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary();
	}
	
	public String getDetailForTeam() {
		return getTeamBase()+"\t程序员";
	}
}
