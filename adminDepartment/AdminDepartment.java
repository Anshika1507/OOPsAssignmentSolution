package com.greatlearning.adminDepartment;

import com.greatlearning.superDepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	
	public AdminDepartment() {
		super();
	}

	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents submission.";
	}
	
	public String getWorkdeadline() {
		return "Complete by EOD.";
	}
	

}
