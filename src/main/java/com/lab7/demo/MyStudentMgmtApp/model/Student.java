package com.lab7.demo.MyStudentMgmtApp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;





@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	
	@Column(nullable = false)
	private String studentNumber;
	private String firstName;
	private String middleName;
	
	@Column(nullable = false)
	private String lastName;
	private Double cgpa;
	private LocalDate dateOfEnrollement;
	@OneToOne
//	@JoinColumn(name = "transcript_id")
	private Transcript transcript;
	@ManyToOne
//	@JoinColumn(name="classroom_id")
	@JoinTable(
		name = "student_classroom",
		joinColumns = @JoinColumn(name = "student_id"),
		inverseJoinColumns = @JoinColumn(name = "classroom_id")
				
	)
	private Classroom classroom;
	
	
	public Student() {
		
	}
	
	
	public Student(Long studentId, @NotEmpty String studentNumber, String firstName, String middleName,
			@NotEmpty String lastName, Double cgpa, LocalDate dateOfEnrollement, Transcript transcript) {
		super();
		this.studentId = studentId;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollement = dateOfEnrollement;
		this.transcript = transcript;
	}

	

	public Student(@NotEmpty String studentNumber, String firstName, String middleName, @NotEmpty String lastName,
			Double cgpa, LocalDate dateOfEnrollement, Transcript transcript) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollement = dateOfEnrollement;
		this.transcript = transcript;
	}


	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getCgpa() {
		return cgpa;
	}
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	public LocalDate getDateOfEnrollement() {
		return dateOfEnrollement;
	}
	public void setDateOfEnrollement(LocalDate dateOfEnrollement) {
		this.dateOfEnrollement = dateOfEnrollement;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}


	public Classroom getClassroom() {
		return classroom;
	}


	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	
	
	
	
	

}
