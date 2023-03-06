package com.project.paintshop.morya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

//you can called it as entity class

@Entity
@Table( name = "CustomerInfo")
@SecondaryTable( name = "CustAddress", pkJoinColumns = @PrimaryKeyJoinColumn(name="custId"))
public class CustomerInfo {
	
	@Id
	@Column(name="custId")
	private String custId;
	@Column(name="userName")
	private String userName;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="password")
	private String password;
	@Column(name="custEmail")
	private String custEmail;
	@Column(name="custContact")
	private Integer custContact;
	
//	adId VARCHAR2(20) PRIMARY KEY,
//	custId VARCHAR2(20),
//	address VARCHAR2(50) NOT NULL,
//	city VARCHAR2(50) NOT NULL,
//	state VARCHAR2(50) NOT NULL,
//	country VARCHAR2(50) NOT NULL,
	
	@Column(name="adId", table = "CustAddress")
	private String adId;
	@Column(name="address", table = "CustAddress")
	private String address;
	@Column(name="city", table = "CustAddress")
	private String city;
	@Column(name="state", table = "CustAddress")
	private String state;
	@Column(name="country", table = "CustAddress")
	private String country;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public Integer getCustContact() {
		return custContact;
	}
	public void setCustContact(Integer custContact) {
		this.custContact = custContact;
	}
	public String getAdId() {
		return adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "CustomerInfo [custId=" + custId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", password=" + password + ", custEmail=" + custEmail + ", custContact=" + custContact
				+ ", adId=" + adId + ", address=" + address + ", city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}
//	public CustomerInfo() {
//		// TODO Auto-generated constructor stub
//		UUID random = UUID.randomUUID();
//		custId = random.toString().replace("-","").substring(0,8);
////		this.userName = "Pranav";
////		this.firstName = "pranav";
////		this.lastName = "jungare";
////		this.password = "lion";
////		this.custEmail = "pj@gmail.coms";
////		this.custContact = 1234;
//	}

	/*
	 * public CustomerInfo(String custId, String userName, String firstName, String
	 * lastName, String password, String custEmail, int custContact) { super();
	 * this.custId = custId; this.userName = userName; this.firstName = firstName;
	 * this.lastName = lastName; this.password = password; this.custEmail =
	 * custEmail; this.custContact = custContact; }
	 */
	
}
