package com.huangpicai.team.service;
/**
 * 
* <p>Title: TeamService</p>  
* <p>Description: 关于开发团队成员的管理，添加、删除等</p>  
* @author 129
* @date 2022年1月12日
 */

import com.huangpicai.team.domain.*;


public class TeamService {
	private static int counter = 1; //给memberId赋值使用
	private final int MAX_MEMBER = 5;  //限值开发团队的人数
	private Programmer[] team = new Programmer[MAX_MEMBER]; //保存开发团队成员
	private int total = 0; //记录开发团队中实际的人数
	
	/**
	 * 
	 * <p>Title: getTeam</p>  
	 * <p>Description:获取开发团队中所有成员 </p>  
	 * 2022年1月12日
	 * @return
	 * Programmer[]
	 */
	public Programmer[] getTeam() {
		Programmer[] team = new Programmer[total];
		for(int i = 0 ;i<team.length;i++) {
			team[i] = this.team[i];  
		}
		return null;
	}
	/**
	 * 
	 * <p>Title: addMember</p>  
	 * <p>Description:将指定的员工添加到开发团队中 </p>  
	 * 2022年1月12日
	 * @param e
	 * void
	 */
	public void addMember(Employee e) throws TeamException {
//		 * 不能添加成功的因素：
//		 * 1.成员已满，无法添加
		if(total > MAX_MEMBER ) {
			throw new TeamException("成员已满，无法添加");
		}
//		 * 2.该成员不是开发人员，无法添加
		if(!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发人员，无法添加");
		}
//		 * 3.该员工已在本开发团队中
		if(isExist(e)) {
			throw new TeamException("该员工已在本开发团队中");
		}
//		 * 4.该员工已是某团队成员
//		 * 5.该员正在休假，无法添加
		Programmer p = (Programmer)e; //一定不会出现ClassCastException
		//if(p.getStatus().getNAME().equals("BUSY")) {
			//下面这种更好，防止空指针
		//}
		if("BUSY".equals(p.getStatus().getNAME())) {
			throw new TeamException("该员工已是某团队成员");
		}else if("VOCATION".equals(p.getStatus().getNAME())) {
			throw new TeamException("该员正在休假，无法添加");
		}
//		 * 6.团队中至多只能有一名架构师	
//		 * 7.团队中至多只能有两名设计师
//		 * 8.团队中至多只能有三名程序员
		//获取Team中已有成员中架构师、设计师、程序员的人数
		int numOfArch = 0,numOfDes = 0,numOfPro = 0;
		for(int i = 0;i < total;i++) {
			if( team[i] instanceof Architect) {
				numOfArch++;
			}else if( team[i] instanceof Designer) {
				numOfDes++;
			}else if( team[i] instanceof Programmer) {
				numOfPro++;
			}
		}
		
		if( p instanceof Architect) {
			if(numOfArch >= 1) {
				throw new TeamException("团队中至多只能有一名架构师");
			}
		}else if(p instanceof Designer) {
			if(numOfDes >= 2) {
				throw new TeamException("团队中至多只能有两名设计师");
			}
		}else if(p instanceof Programmer) {
			if(numOfPro >= 3) {
				throw new TeamException("团队中至多只能有三名程序员");
			}
		}
		
//	将P(或e)添加现有的team中
//		team[total] = p;
//		total++;
		team[total++] = p;
//	p的status改变,memberId改变
		p.setStatus(Status.BUSY);
		p.setMemberId(counter++);
	}
	
	/**
	 * 
	 * <p>Title: isExist</p>  
	 * <p>Description: 判断指定的员工是否在现有的团队中</p>  
	 * 2022年1月12日
	 * @param e
	 * @return
	 * boolean
	 */
	private boolean isExist(Employee e) {
		for (int i = 0; i < total; i++) {
//			if(team[i].getId() == e.getId()) {
//				return true;
//			}	
			return team[i].getId() == e.getId();	
		}
		return false;
	}
	
	/**
	 * 
	 * <p>Title: removeMember</p>  
	 * <p>Description: </p>  
	 * 2022年1月12日
	 * @param memberId
	 * void
	 */
	public void removeMember(int memberId) {
		
	}
	
	
	
}
