package com.example.apollopharmacy.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Usercredentials 
{
	
	/*@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid",referencedColumnName = "userid")
	Userprofile userid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "password",referencedColumnName = "password")
	Userprofile password;

	public Userprofile getUserid() {
		return userid;
	}

	public void setUserid(Userprofile userid) {
		this.userid = userid;
	}

	public Userprofile getPassword() {
		return password;
	}

	public void setPassword(Userprofile password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usercredentials [userid=" + userid + ", password=" + password + "]";
	}

	public Usercredentials(Userprofile userid, Userprofile password) {

		this.userid = userid;
		this.password = password;
	}
	

	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "active",referencedColumnName = "active")
//	boolean active ;
	
	
	

	
//	public boolean isActive() {
//		return active;
//	}
//	public void setActive(boolean active) {
//		this.active = active;
//	}
//	@Override
//	public String toString() {
//		return "Usercredentials [userid=" + userid + ", password=" + password + ", active=" + active + "]";
//	}
	*/
	
	
	
//	@Id
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "userid",referencedColumnName = "userid")
//	private Userprofile userid;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "password",referencedColumnName = "password")
//	private Userprofile password;
//
//	public Userprofile getUserid() {
//		return userid;
//	}
//
//	public void setUserid(Userprofile userid) {
//		this.userid = userid;
//	}
//
//	public Userprofile getPassword() {
//		return password;
//	}
//
//	public void setPassword(Userprofile password) {
//		this.password = password;
//	}
//
//	@Override
//	public String toString() {
//		return "Usercredentials [userid=" + userid + ", password=" + password + "]";
//	}
//
//	public Usercredentials(Userprofile userid, Userprofile password) {
//		super();
//		this.userid = userid;
//		this.password = password;
//	}
	
	
	
	@Id
	int userid;
	String password;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Usercredentials [userid=" + userid + ", password=" + password + "]";
	}
	public Usercredentials(int userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public Usercredentials() {
		
	}
	
	
	
	
	
	

}

