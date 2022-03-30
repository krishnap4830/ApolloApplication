package com.example.apollopharmacy.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "orderr")
public class Order {
	
	@Id
	int orderid ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid",referencedColumnName = "userid")
	Userprofile userid ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderdate",referencedColumnName = "orderdate")
	bill orderdate ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cartid",referencedColumnName = "cartid")
	bill cartid ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address",referencedColumnName = "address")
	Userprofile address ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mobileno",referencedColumnName = "mobileno")
	Userprofile mobileno ;
	
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Userprofile getUserid() {
		return userid;
	}
	public void setUserid(Userprofile userid) {
		this.userid = userid;
	}
	public bill getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(bill orderdate) {
		this.orderdate = orderdate;
	}
	public bill getCartid() {
		return cartid;
	}
	public void setCartid(bill cartid) {
		this.cartid = cartid;
	}
	public Userprofile getAddress() {
		return address;
	}
	public void setAddress(Userprofile address) {
		this.address = address;
	}
	public Userprofile getMobileno() {
		return mobileno;
	}
	public void setMobileno(Userprofile mobileno) {
		this.mobileno = mobileno;
	}
	
	

}