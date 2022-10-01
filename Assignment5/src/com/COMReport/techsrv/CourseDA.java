package com.COMReport.techsrv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import com.COMReport.domain.Course;

public class CourseDA {

	private ArrayList<Course> courseList;
	
	public CourseDA(String studNo) throws FileNotFoundException {
		
		Scanner courseFile = new Scanner(new FileReader("/home/emiya/git/SoftEng2022/Assignment5/src/scheduleInfo.csv"));
		
		courseList = new ArrayList<Course>();
		while(courseFile.hasNext()) {
			
			Course course = new Course();
			String courseRow = courseFile.nextLine();
			String[] courseRowSpecific = courseRow.split(", ");
			
			if(studNo.contentEquals(courseRowSpecific[0])) {
				course.setCourseCode(courseRowSpecific[1]);
				course.setDescription(courseRowSpecific[2]);
				course.setUnit(Integer.parseInt(courseRowSpecific[3]));
				course.setDay(courseRowSpecific[4]);
				course.setTime(courseRowSpecific[5]);
				courseList.add(course);
			}
			
			//123, ITL221-18, OOP Lab, 1, Mon, 7:00 - 10:00AM

			
		}
		
	}

	public ArrayList<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
}
