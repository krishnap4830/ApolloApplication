
package com.example.apollopharmacy.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor 
public class bill {
	
	@Id
	int cartid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userid",referencedColumnName ="userid")
	Userprofile userid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="medicineid",referencedColumnName ="medicineid")
	Medicine medicineid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="medicinename",referencedColumnName ="name")
	Medicine name;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="type",referencedColumnName ="type")
//	Medicine type; 
	
	int quantity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="price",referencedColumnName ="price")
	Medicine price;
	
	String customername;
	String mobilenum;
	String orderdate;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="Adminuserid",referencedColumnName ="userid")
//	Usercredentials useridd; 
	
	
	
	/*
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
	} */
	
	


}
