package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserRegistration {

	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empId;
	
	@Column(nullable=false)
	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;
	private String address;
	
	@Column(nullable=false)
	private Long phoneNumber;
	private Integer loginId;
	
	@OneToOne
	@JoinColumn(name="loginId", insertable=false, updatable=false)
	private Login login;

	//default constructor
	public UserRegistration() {

	}

	//parameterized constructor
	public UserRegistration(Integer empId, String firstName, String lastName, Integer age, String gender,
			String address, Long phoneNumber, Integer loginId) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.loginId = loginId;
	}

	public UserRegistration(Integer empId, String firstName, String lastName, Integer age, String gender,
			String address, Long phoneNumber, Integer loginId, Login login) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.loginId = loginId;
		this.login = login;
	}

	//getters and setters
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	//toString()
	@Override
	public String toString() {
		return "UserRegistration [empId=" + empId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", gender=" + gender + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", loginId=" + loginId + ", login=" + login + "]";
	}
	
}
