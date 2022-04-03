package com.example.apollopharmacy.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor 
public class Userprofile {
	
	@Id
	int userid ;
	String firstname ;
	String lastname ;
	String dob ;
	String gender ;
	String address ;
	String mobileno ;
	String emailid;
//	boolean active;
	String password;
	String type;
	
	/*
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
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
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
//	public boolean isActive() {
//		return active;
//	}
//	public void setActive(boolean active) {
//		this.active = active;
//	}
//	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	public Userprofile(int userid, String firstname, String lastname, String dob, String gender, String address,
//			String mobileno, String emailid, String password) {
//		super();
//		this.userid = userid;
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.dob = dob;
//		this.gender = gender;
//		this.address = address;
//		this.mobileno = mobileno;
//		this.emailid = emailid;
//		this.password = password;
//		this.active=false;
//	}
	@Override
	public String toString() {
		return "Userprofile [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob
				+ ", gender=" + gender + ", address=" + address + ", mobileno=" + mobileno + ", emailid=" + emailid
				+ ", password=" + password + "]";
	}
public Userprofile(int userid, String firstname, String lastname, String dob, String gender, String address,
		String mobileno, String emailid, String password) {
	super();
	this.userid = userid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.dob = dob;
	this.gender = gender;
	this.address = address;
	this.mobileno = mobileno;
	this.emailid = emailid;
	this.password = password;
}
public Userprofile() {

}
*/

	
	
	
	
	
	
	
	
	


}