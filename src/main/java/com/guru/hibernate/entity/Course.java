package com.guru.hibernate.entity;

public class Course {

	private int courseId;
	private String courseName;
	private String tutorName;

	public Course() {
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTutorName() {
		return tutorName;
	}

	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", tutorName=" + tutorName + "]";
	}

}
