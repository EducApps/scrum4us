package com.lima.entity;

public enum Status {
	
	TODO(1),
	DOING(2),
	VERIFY(3),
	DONE(4);
	
	private int value;
	
	private Status(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}

}
