package com.in.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="whusertype")
@Data
public class WhUserType {
	@Id
	@GeneratedValue
	@Column(name="whuserid")
	private Integer whUserId;
	
	@Column(name="usertype")
	private String userType;
	@Column(name="usercode")
	private String userCode;
	@Column(name="userfor")
	private String userFor;
	@Column(name="useremail")
	private String userEmail;
	@Column(name="usercontact")
	private String userContact;
	@Column(name="useridtype")
	private String userIdType;
	@Column(name="idNumber")
	private String idnumber;
	
	
	
	public WhUserType(Integer whUserId) {
		super();
		this.whUserId = whUserId;
	}
	public Integer getWhUserId() {
		return whUserId;
	}
	public void setWhUserId(Integer whUserId) {
		this.whUserId = whUserId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserFor() {
		return userFor;
	}
	public void setUserFor(String userFor) {
		this.userFor = userFor;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserContact() {
		return userContact;
	}
	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}
	public String getUserIdType() {
		return userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	
	public WhUserType() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "WhUserType [whUserId=" + whUserId + ", userType=" + userType + ", userCode=" + userCode + ", userFor="
				+ userFor + ", userEmail=" + userEmail + ", userContact=" + userContact + ", userIdType=" + userIdType
				+ ", idnumber=" + idnumber + "]";
	}
	
	

}
