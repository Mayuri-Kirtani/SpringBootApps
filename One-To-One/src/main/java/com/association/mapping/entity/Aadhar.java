package com.association.mapping.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Aadhar")
public class Aadhar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="aadr_id")
	private int aadrId;
	private String addrHolderName;
	private int age;
	private String addr;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userId")
	private User user;
	
	public int getAddrId() {
		return aadrId;
	}
	public void setAddrId(int addrId) {
		this.aadrId = addrId;
	}
	public String getAddrHolderName() {
		return addrHolderName;
	}
	public void setAddrHolderName(String addrHolderName) {
		this.addrHolderName = addrHolderName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}	
	
	
}
