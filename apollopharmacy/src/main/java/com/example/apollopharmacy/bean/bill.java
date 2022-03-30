
package com.example.apollopharmacy.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class bill {
	
	@Id
	int cartid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userid",referencedColumnName ="userid")
	Userprofile userid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="medicineid",referencedColumnName ="medicineid")
	Medicine medicineid;
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="type",referencedColumnName ="type")
//	Medicine type; 
	int quantity;
	int cost ; 
	String orderdate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Adminuserid",referencedColumnName ="userid")
	Usercredentials useridd; 
	
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public Userprofile getUserid() {
		return userid;
	}
	public void setUserid(Userprofile userid) {
		this.userid = userid;
	}
	public Medicine getMedicineid() {
		return medicineid;
	}
	public void setMedicineid(Medicine medicineid) {
		this.medicineid = medicineid;
	}
//	public Medicine getType() {
//		return type;
//	}
//	public void setType(Medicine type) {
//		this.type = type;
//	}
	public Usercredentials getUseridd() {
		return useridd;
	}
	public void setUseridd(Usercredentials useridd) {
		this.useridd = useridd;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	
	


}
