package com.lima.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Backlog {
	
	@Id
	private Long id;
	private Long storyId;
	private String descr;
	private Double qty;
	private Integer status;
	private Long sprintId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesc() {
		return descr;
	}
	public void setDesc(String descr) {
		this.descr = descr;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Long getSprintId() {
		return sprintId;
	}
	public void setSprintId(Long sprintId) {
		this.sprintId = sprintId;
	}
	public Long getStoryId() {
		return storyId;
	}
	public void setStoryId(Long storyId) {
		this.storyId = storyId;
	}
	
	
}
