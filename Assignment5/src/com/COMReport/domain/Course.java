package com.COMReport.domain;

public class Course {

	private String courseCode;
	private String description;
	private Integer unit;
	private String day;
	private String time;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getUnit() {
		return unit;
	}
	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public String toString() {
		String out = "";
		String align;
		
		//fix alignemnt of columns when printed
		if(description.length()<=10) {
			align = "\t\t\t";
		}
		else if(description.length()<=15) {
			align = "\t\t";
		}
		else align = "\t";
		
		
		out += "\n" + courseCode + "\t" + description + align + unit + "\t" + day + "\t" + time;
		return out;
	}
}
