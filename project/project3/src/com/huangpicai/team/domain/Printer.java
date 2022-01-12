package com.huangpicai.team.domain;

public class Printer implements Equipment{
	private String name; //机器型号
	private String type; //机器类型
	
	
	public Printer() {
		super();
	}
	public Printer(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getModel() {
		return name;
	}
	public void setModel(String model) {
		this.name = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String getDescription() {
		
		return name+"("+type+")";
	}
	
}
