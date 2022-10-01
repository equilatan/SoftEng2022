package com.COMReport.techsrv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.COMReport.domain.Student;

public class StudentDA {

	private ArrayList<Student> studentList;
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public StudentDA(String blockCode) throws FileNotFoundException {
		
		Scanner studFile = new Scanner(new FileReader("/home/emiya/git/SoftEng2022/Assignment5/src/studentInfo.csv"));
		
		studentList = new ArrayList<Student>();
		
		while(studFile.hasNext()) {
			String studRow = studFile.nextLine();
			String[] studRowSpecific = studRow.split(",");
			
			if(studRowSpecific[0].contentEquals(blockCode)) {
				Student student = new Student();
				student.setStudentNumber(studRowSpecific[1]);
				student.setName(studRowSpecific[2]);
				student.setProgram(studRowSpecific[3]);
				
				CourseDA courseDA = new CourseDA(student.getStudentNumber());
				student.setCourseList(courseDA.getCourseList());
				
				studentList.add(student);
			}
			
		}
		
		
		
	}
}
