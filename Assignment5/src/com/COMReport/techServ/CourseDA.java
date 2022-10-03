package com.COMReport.techServ;

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
			String rowCourse = courseFile.nextLine();
			String[] rowCourseSpecific = rowCourse.split(", ");
			
			if(studNo.contentEquals(rowCourseSpecific[0])) {
				course.setCourseCode(rowCourseSpecific[1]);
				course.setDescription(rowCourseSpecific[2]);
				course.setUnit(Integer.parseInt(rowCourseSpecific[3]));
				course.setDay(rowCourseSpecific[4]);
				course.setTime(rowCourseSpecific[5]);
				courseList.add(course);
			}
			
		}
		
	}

	public ArrayList<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
}
