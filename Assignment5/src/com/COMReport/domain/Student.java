package com.COMReport.domain;

import java.util.List;

public class Student {

	private String studentNumber;
	private String name;
	private String program;
	private List<Course> courseList;
	
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	
	public String toString() {
		String out = "";
		out += "\nStudent Number: " + studentNumber;
		out += "\t\t\tStudent Name: " + name;
		out += "\tProgram: " + program;
		out += "\n\nSchedule";
		out += "\nCourse code\tDescription\tUnit\tDay\tTime";
		for(Course course : courseList) {
			out += course;
		}
		return out;
	}
	
}
