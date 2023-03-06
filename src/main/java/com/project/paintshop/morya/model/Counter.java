package com.project.paintshop.morya.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="counters")
public class Counter {
	
	@Id
	private String counterId;
	private int nextValue;
	private String intitialValue;
	
	public Counter() {
		// TODO Auto-generated constructor stub
	}
	
	public int nextValue() {
		
		return ++nextValue;
	}

	public Counter(String counterId, int nextValue, String intitialValue) {
		super();
		this.counterId = counterId;
		this.nextValue = nextValue;
		this.intitialValue = intitialValue;
	}

	public String getCounterId() {
		return counterId;
	}

	public void setCounterId(String counterId) {
		this.counterId = counterId;
	}

	public int getNextValue() {
		return nextValue;
	}

	public void setNextValue(int nextValue) {
		this.nextValue = nextValue;
	}

	public String getIntitialValue() {
		return intitialValue;
	}

	public void setIntitialValue(String intitialValue) {
		this.intitialValue = intitialValue;
	}

	@Override
	public String toString() {
		return "Counter [counterId=" + counterId + ", nextValue=" + nextValue + ", intitialValue=" + intitialValue
				+ "]";
	}
}
