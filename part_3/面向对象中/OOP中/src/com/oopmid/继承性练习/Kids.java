package com.oopmid.继承性练习;
//kids继承mankind
public class Kids extends ManKind {
	
	private int yearsOld;
	
	
	public Kids() {
		
	}
	
	public Kids(int yearOld) {
		this.yearsOld = yearOld;
	}
	
	
	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}


	public void printAge() {
		System.out.println("I'm "+ yearsOld +" years old.");
	}
	
}
