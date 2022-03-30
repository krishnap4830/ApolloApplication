package com.example.apollopharmacy.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import com.example.apollopharmacy.bean.Medicine;



public class CSVconvertor
{
	
	public static String TYPE = "text/csv";
	static String[] HEADERs = { "medicineid", "name", "description", "type","uses","price"}; 
	  
	public static boolean hasCSVFormat(MultipartFile file) {
	    if (TYPE.equals(file.getContentType())
	    		|| file.getContentType().equals("application/vnd.ms-excel")) {
	      return true;
	    }

	    return false;
	  }

	  public static List<Medicine> csvToDatabase(InputStream is) {
	    try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        CSVParser csvParser = new CSVParser(fileReader,
	            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

	      List<Medicine> medicineList = new ArrayList<>();

	      Iterable<CSVRecord> csvRecords = csvParser.getRecords();
	     
	      for (CSVRecord csvRecord : csvRecords) {
	    	  Medicine medince= new Medicine(
	              Integer.parseInt(csvRecord.get("medicineid")),
	              csvRecord.get("name"),
	              csvRecord.get("description"),
	              csvRecord.get("type"),
	              csvRecord.get("uses"),
	              Integer.parseInt(csvRecord.get("price"))
	              );
	    	  
	    	  medicineList.add(medince);
	      }
	     
	      return medicineList;
	    } catch (IOException e) {
	      throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
	    }
	  }

}
