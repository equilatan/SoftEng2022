package com.COMReport.domain;

import java.util.List;

public class BlockSection {

	private String blockCode;
	private String description;
	private String adviser;
	private List<Student> studentList;
	
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public String getBlockCode() {
		return blockCode;
	}
	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAdviser() {
		return adviser;
	}
	public void setAdviser(String adviser) {
		this.adviser = adviser;
	}
	
	public String toString() {
		
		String out = "";
		
		out += "Block Section: " + getBlockCode();
		out += "\t\t\tBlock Section Description: " + getDescription();
		out += "\nClass Adviser: " + getAdviser() + "\n";
		
		for(Student student : studentList) {
			out += "\n" + student;
		}
		
		return out;
	}
	
}
