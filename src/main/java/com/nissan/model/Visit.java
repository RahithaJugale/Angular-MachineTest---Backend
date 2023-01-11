package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.joda.time.DateTime;

@Entity
public class Visit {

	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer visitId;
	private String custName;
	private String contactPerson;
	private Long contactNo;
	private String interestProduct;
	private String visitSubject;
	private String description;
	private DateTime visitDateTime;
	private Boolean isDisabled;
	private Boolean isDeleted;
	private Integer empId;
	
	@ManyToOne
	@JoinColumn(name="empId", insertable=false, updatable=false)
	private UserRegistration userRegistration;

	//default constructor
	public Visit() {

	}

	//parameterized constructors
	public Visit(Integer visitId, String custName, String contactPerson, Long contactNo, String interestProduct,
			String visitSubject, String description, DateTime visitDateTime, Boolean isDisabled, Boolean isDeleted,
			Integer empId) {
		super();
		this.visitId = visitId;
		this.custName = custName;
		this.contactPerson = contactPerson;
		this.contactNo = contactNo;
		this.interestProduct = interestProduct;
		this.visitSubject = visitSubject;
		this.description = description;
		this.visitDateTime = visitDateTime;
		this.isDisabled = isDisabled;
		this.isDeleted = isDeleted;
		this.empId = empId;
	}

	public Visit(Integer visitId, String custName, String contactPerson, Long contactNo, String interestProduct,
			String visitSubject, String description, DateTime visitDateTime, Boolean isDisabled, Boolean isDeleted,
			Integer empId, UserRegistration userRegistration) {
		super();
		this.visitId = visitId;
		this.custName = custName;
		this.contactPerson = contactPerson;
		this.contactNo = contactNo;
		this.interestProduct = interestProduct;
		this.visitSubject = visitSubject;
		this.description = description;
		this.visitDateTime = visitDateTime;
		this.isDisabled = isDisabled;
		this.isDeleted = isDeleted;
		this.empId = empId;
		this.userRegistration = userRegistration;
	}

	//getters and setters
	public Integer getVisitId() {
		return visitId;
	}

	public void setVisitId(Integer visitId) {
		this.visitId = visitId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public String getInterestProduct() {
		return interestProduct;
	}

	public void setInterestProduct(String interestProduct) {
		this.interestProduct = interestProduct;
	}

	public String getVisitSubject() {
		return visitSubject;
	}

	public void setVisitSubject(String visitSubject) {
		this.visitSubject = visitSubject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DateTime getVisitDateTime() {
		return visitDateTime;
	}

	public void setVisitDateTime(DateTime visitDateTime) {
		this.visitDateTime = visitDateTime;
	}

	public Boolean getIsDisabled() {
		return isDisabled;
	}

	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public UserRegistration getUserRegistration() {
		return userRegistration;
	}

	public void setUserRegistration(UserRegistration userRegistration) {
		this.userRegistration = userRegistration;
	}

	//toString()
	@Override
	public String toString() {
		return "Visit [visitId=" + visitId + ", custName=" + custName + ", contactPerson=" + contactPerson
				+ ", contactNo=" + contactNo + ", interestProduct=" + interestProduct + ", visitSubject=" + visitSubject
				+ ", description=" + description + ", visitDateTime=" + visitDateTime + ", isDisabled=" + isDisabled
				+ ", isDeleted=" + isDeleted + ", empId=" + empId + ", userRegistration=" + userRegistration + "]";
	}
}
