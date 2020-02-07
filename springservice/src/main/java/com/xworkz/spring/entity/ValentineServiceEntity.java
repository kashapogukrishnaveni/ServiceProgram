package com.xworkz.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="valentine")
public class ValentineServiceEntity {

	@Id
	@GenericGenerator(name="kittu",strategy="increment")
	@GeneratedValue(generator="kittu")
	@Column(name="V_ID")
	private int id;
	@Column(name="V_NAME")
	private String name;
	@Column(name="V_STATUS")
	private String status;
	@Column(name="V_AMOUNTSPENT")
	private int amountSpent;
	@Column(name="V_GIFT")
	private String gift;
	
	public ValentineServiceEntity() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAmountSpent() {
		return amountSpent;
	}

	public void setAmountSpent(int amountSpent) {
		this.amountSpent = amountSpent;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}

	@Override
	public String toString() {
		return "ValentineServiceEntity [id=" + id + ", name=" + name + ", status=" + status + ", amountSpent="
				+ amountSpent + ", gift=" + gift + "]";
	}	
}

