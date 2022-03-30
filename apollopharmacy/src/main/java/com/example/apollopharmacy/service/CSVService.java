package com.example.apollopharmacy.service;

import java.io.ByteArrayInputStream;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.apollopharmacy.bean.Medicine;
import com.example.apollopharmacy.dao.MedicineDao;



@Service
public class CSVService {
  @Autowired
  MedicineDao repository;

  public void save(MultipartFile file) {
    try 
    {
    	
      List<Medicine> medicine = CSVconvertor.csvToDatabase(file.getInputStream());
      
      repository.saveAll(medicine);
      
    } 
    catch (IOException e) 
    {
    	
      throw new RuntimeException("fail to store csv data: " + e.getMessage());
    }
  }

  public List<Medicine> getAllTutorials() {
    return (List<Medicine>) repository.findAll();
  }
  
  
}
