
package com.example.apollopharmacy.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Medicine {
	
	@Id
	int medicineid ;
	String name ;
	String description;
	String type ;
	String uses ;
	int price ;
	
	public Medicine() {
		
	}
	public Medicine(int medicineid, String name, String description, String type, String uses, int price) {
		this.medicineid = medicineid;
		this.name = name;
		this.description = description;
		this.type = type;
		this.uses = uses;
		this.price = price;
	}
	public int getMedicineid() {
		return medicineid;
	}
	public void setMedicineid(int medicineid) {
		this.medicineid = medicineid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUses() {
		return uses;
	}
	public void setUses(String uses) {
		this.uses = uses;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Medicine [medicineid=" + medicineid + ", name=" + name + ", description=" + description + ", type="
				+ type + ", uses=" + uses + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	


}
