package com.huangpicai.team.service;
/**
 * 
* <p>Title: TeamException</p>  
* <p>Description:自定义异常类 </p>  
* @author 129
* @date 2022年1月12日
 */
public class TeamException extends Exception{
	
	static final long serialVersionUID = -3387516993124229948L;
	
	public TeamException() {
		super();
	}
	
	public TeamException(String message) {
		super(message);
	}
}
