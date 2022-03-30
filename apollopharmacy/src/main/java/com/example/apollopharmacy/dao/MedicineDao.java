package com.example.apollopharmacy.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.apollopharmacy.bean.Medicine;



@Repository
public interface MedicineDao extends JpaRepository<Medicine,Integer>{
	
	ArrayList<Medicine> findById(int id);
	ArrayList<Medicine> findByName(String name);

}
