package com.lab7.demo.MyStudentMgmtApp.model;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classroomId;
	private String buildingName;
	private Integer roomNo;
	@OneToMany(mappedBy = "classroom")
	List<Student> student;
	
	public Classroom() {
		
	}
	
	public Classroom(String buildingName, Integer roomNo) {
		super();
		this.buildingName = buildingName;
		this.roomNo = roomNo;
	}
	public Long getClassroomId() {
		return classroomId;
	}
	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public Integer getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(Integer roomNo) {
		this.roomNo = roomNo;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	

}
