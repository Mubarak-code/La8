package com.lab7.demo.MyStudentMgmtApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Transcript {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long trascriptId;
	private String degreeTitle;
	
	
	
	
	public Transcript() {
		
	}
	
	public Transcript(String degreeTitle) {
		super();
		this.degreeTitle = degreeTitle;
	}
	public Transcript(Long trascriptId, String degreeTitle) {
		super();
		this.trascriptId = trascriptId;
		this.degreeTitle = degreeTitle;
	}
	public Long getTrascriptId() {
		return trascriptId;
	}
	public void setTrascriptId(Long trascriptId) {
		this.trascriptId = trascriptId;
	}
	public String getDegreeTitle() {
		return degreeTitle;
	}
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	

	
	
}
