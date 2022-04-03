package com.example.apollopharmacy.controller;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.apollopharmacy.bean.Medicine;
import com.example.apollopharmacy.bean.Usercredentials;
import com.example.apollopharmacy.bean.Userprofile;
import com.example.apollopharmacy.service.AdminService;
import com.example.apollopharmacy.service.CSVService;
import com.example.apollopharmacy.service.CSVconvertor;
import com.example.apollopharmacy.service.ResponseMessage;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class Admin {
	
	@Autowired
	private AdminService adserv;
	
	@Autowired
	private CSVService fileService;
	
//	@RequestMapping(value="/check" ,method=RequestMethod.POST)
//	public ResponseEntity<Usercredentials> login(@RequestBody Usercredentials user)
//	{
//		Usercredentials uc=adserv.check(user);
//		return new ResponseEntity<>(uc,HttpStatus.CREATED);
//	}
//	
	@PostMapping(value="/Login")
	public ResponseEntity<ResponseMessage> login(@RequestBody Usercredentials user)
	{
		System.out.println("controller");
		String str=adserv.check(user);
//		return new ResponseEntity<>(str,HttpStatus.CREATED);
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(str));
		
	}
	
//	@GetMapping("/Login")
//	public ResponseEntity<ResponseMessage> loginn(@RequestBody Usercredentials user)
//	{
//		System.out.println("controller");
//		String str=adserv.check(user);
////		return new ResponseEntity<>(str,HttpStatus.CREATED);
//		return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(str));
//			
//	}
	
	@RequestMapping(value="/upload",method = RequestMethod.POST)
	  public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
	    String message = "";

	    if (CSVconvertor.hasCSVFormat(file)) {
	      try {
	    	 
	        fileService.save(file);
	        
	        message = "Uploaded the file successfully: " + file.getOriginalFilename();
	       
	        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	      } catch (Exception e) {
	        message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
	      }
	    }

	    message = "Please upload a csv file!";
	    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
	  }
	
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public ResponseEntity<Userprofile> register(@RequestBody Userprofile user)
	{
		Userprofile up =adserv.addUser(user);
		return new ResponseEntity<>(up,HttpStatus.CREATED);
	}
	@RequestMapping(value="/medicine",method = RequestMethod.POST)
	public ResponseEntity<Medicine> addmedicine(@RequestBody Medicine med)
	{
		Medicine m =adserv.addMed(med);
		return new ResponseEntity<>(m,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/view")
	public List<Medicine> viewmedicine()
	{
		List<Medicine> m =adserv.viewMed();
		return m;
	}
	
	@GetMapping(value="/viewbyid/{medicineid}")
	public ArrayList<Medicine> viewById(@PathVariable("medicineid") int id)
	{
		ArrayList<Medicine> m =adserv.viewById(id);
		return m;
	}
	
	@GetMapping(value="/viewbyname/{name}")
	public ArrayList<Medicine> viewByName(@PathVariable("name") String name)
	{
		ArrayList<Medicine> m =adserv.viewByName(name);
		return m;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteMed(@PathVariable("id") int id) {
		
		adserv.deleteMed(id);
		return new ResponseEntity<>("Medicine has been deleted!", HttpStatus.OK);
	}
	
	@RequestMapping(value="/updatemedicine" ,method=RequestMethod.POST)
	public ResponseEntity<Medicine> modifyMedicine(@RequestBody Medicine medicine)
	{
		System.out.println("update");
		Medicine vb=adserv.modifyMed(medicine);
		return new ResponseEntity<>(vb,HttpStatus.CREATED);
		
	}
//	@PostMapping("/Login")
//	public void jack()
//	{
//		System.out.println("hiii");
//	}
	
	
}




















//	@GetMapping("/tutorials")
//	  public ResponseEntity<List<Medicine>> getAllTutorials() {
//	    try {
//	      List<Medicine> tutorials = fileService.getAllTutorials();
//
//	      if (tutorials.isEmpty()) {
//	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	      }
//
//	      return new ResponseEntity<>(tutorials, HttpStatus.OK);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
	
	
//}

