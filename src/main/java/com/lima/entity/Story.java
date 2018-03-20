package com.lima.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Story {

	@Id
	private Long id;
	private String descr;
	private Long equipeId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getdescr() {
		return descr;
	}
	public void setdescr(String descr) {
		this.descr = descr;
	}
	public Long getEquipeId() {
		return equipeId;
	}
	public void setEquipeId(Long equipeId) {
		this.equipeId = equipeId;
	}
	
}
