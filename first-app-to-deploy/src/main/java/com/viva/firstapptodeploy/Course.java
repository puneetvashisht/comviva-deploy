package com.viva.firstapptodeploy;

public class Course {

	int id;
	
	
	String title;	
	String summary;
	public Course(){}
	public Course(String title, String summary) {

		this.title = title;
		this.summary = summary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", summary=" + summary + "]";
	}
	
	
	

}
