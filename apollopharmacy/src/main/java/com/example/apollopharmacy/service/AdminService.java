package com.example.apollopharmacy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apollopharmacy.bean.Medicine;
import com.example.apollopharmacy.bean.Usercredentials;
import com.example.apollopharmacy.bean.Userprofile;
import com.example.apollopharmacy.dao.LoginDao;
import com.example.apollopharmacy.dao.MedicineDao;
import com.example.apollopharmacy.dao.UserProfileDao;

@Service
public class AdminService {
	
	@Autowired
	private LoginDao lDao;
	@Autowired
	private UserProfileDao udao;
	@Autowired
	private MedicineDao mdao;
	
	public String check(Usercredentials user)
	{
		if(user!= null)
		{
			int id=user.getUserid();
		    if(user.getPassword().equals(lDao.findById(id).get().getPassword()))
		    {
		    	return "yes";
		    }
		    else
		    	return "no";
			
			
		}
		else {
			return "no";
		}
		
	}
	
	public Userprofile addUser(Userprofile user)
	{
		if(user!=null)
		{
			Userprofile up=udao.save(user);
			return up; 
		}
		else
		{
			return user;
		}
	}
	
	public Medicine addMed(Medicine med)
	{
		if(med!=null)
		{
			Medicine m=mdao.save(med);
			
			return m; 
		}
		else
		{
			return med;
		}
	}
	
	public List<Medicine> viewMed()
	{
		List<Medicine> m=new ArrayList<>();
		mdao.findAll().forEach(m::add);
		return m;
			
	}
	
	public ArrayList<Medicine> viewById(int id)
	{
		
		ArrayList<Medicine> m=mdao.findById(id);
		System.out.println(m);
		return m;
			
	}
	
	public ArrayList<Medicine> viewByName(String name)
	{
		
		ArrayList<Medicine> m =mdao.findByName(name);
		return m;
			
	}
	
	public void deleteMed(int id)
	{
		mdao.deleteById(id);
	}

	public Medicine modifyMed(Medicine medicine) {
		
		if(medicine!=null)
		{
			int id=medicine.getMedicineid();
			Medicine rb=mdao.findById(id).get(0);
			rb.setName(medicine.getName());
			rb.setDescription(medicine.getDescription());
			rb.setType(medicine.getType());
			rb.setUses(medicine.getUses());
			rb.setPrice(medicine.getPrice());
			
			return mdao.save(rb);
		}
		else
			return medicine;
	}
}
