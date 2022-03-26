package com.greatlearning.techDepartment;

import com.greatlearning.superDepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment{

	public TechDepartment() {
		super();
	
	}
	
	public String departmentName() {
		return "Tech Depatment";
	}
	
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "Core java";
	}

	

}
