package com.greatlearning.DriverClass;

import com.greatlearning.adminDepartment.AdminDepartment;
import com.greatlearning.hrDepartment.HrDepartment;
import com.greatlearning.techDepartment.TechDepartment;

public class DriverClass {
	public static void main(String[] args) {
		AdminDepartment ad = new AdminDepartment();
		System.out.println("Welcome to "+ ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkdeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println("\n");
		
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("\n");
		
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(ad.isTodayAHoliday());
		
		}

}
