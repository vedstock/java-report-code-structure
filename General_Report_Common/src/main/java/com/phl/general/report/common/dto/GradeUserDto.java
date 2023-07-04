package com.phl.general.report.common.dto;

public class GradeUserDto {
	Integer id;
	String firstname;
	String lastname;
	String username;
	String courseName;
	String moduleName;
	Integer moduleGradePass;
	Integer userFinalGrade;
	Integer completionstate;
	String timecompleted;
	// Default values
	Integer courseId;
	Integer moduleId;
	// GET/SET
	public Integer getid() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getcourseName() {
		return courseName;
	}
	public void setcourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getmoduleName() {
		return moduleName;
	}
	public void setmoduleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public Integer getmoduleGradePass() {
		return moduleGradePass;
	}
	public void setmoduleGradePass(Integer moduleGradePass) {
		this.moduleGradePass = moduleGradePass;
	}
	public Integer getuserFinalGrade() {
		return userFinalGrade;
	}
	public void setuserFinalGrade(Integer userFinalGrade) {
		this.userFinalGrade = userFinalGrade;
	}
	public Integer getcompletionstate() {
		return completionstate;
	}
	public void setcompletionstate(Integer completionstate) {
		this.completionstate = completionstate;
	}
	public String gettimecompleted() {
		return timecompleted;
	}
	public void set(String timecompleted) {
		this.timecompleted = timecompleted;
	}
	public Integer getcourseId() {
		return courseId;
	}
	public void setcourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getmoduleId() {
		return moduleId;
	}
	public void setmoduleId(Integer moduleId) {
		this.moduleId = moduleId;
	}
}
