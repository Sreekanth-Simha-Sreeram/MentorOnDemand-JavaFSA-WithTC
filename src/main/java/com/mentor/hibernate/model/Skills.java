package com.mentor.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Skills")
public class Skills {
	
	@Id
	@Column(name="skillsId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int skillsId;
	
	@Column(name="name")
	String name;
	
	@Column(name="toc")
	String toc;
	
	@Column(name="prerequisites")
	String prerequisites;

	public int getSkillsId() {
		return skillsId;
	}

	public void setSkillsId(int skillsId) {
		this.skillsId = skillsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToc() {
		return toc;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}

	
	
	

}
