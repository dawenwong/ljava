package com.huangpicai.team.service;
/**
 * 
* <p>Title: Status</p>  
* <p>Description:表示员工的状态 </p>  
* @author 129
* @date 2022年1月12日
 */
public class Status {
	private final String NAME;
	private Status(String name) {
		this.NAME = name;
	}
	
	//枚举
	public static final Status FREE = new Status("FREE");
	public static final Status BUSY = new Status("BUSY");
	public static final Status VOCATION = new Status("VOCATION");
	
	public String getNAME() {
		return NAME;
	}
	/**
	 * 重写toString();
	 */
	@Override
	public String toString() {
		return NAME;
	}
	
}
