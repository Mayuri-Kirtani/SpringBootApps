package com.association.mapping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.association.mapping.entity.Aadhar;
import com.association.mapping.service.AadharService;

@Controller
@RequestMapping("/api/adhar")
public class AadharController {
	
	@Autowired
	private AadharService adharService;
	
	@PostMapping("/add")
	public Aadhar saveAll(Aadhar aadhar) {
		return adharService.addAadharUser(aadhar);
	}
	
	@GetMapping("/all")
	public List<Aadhar> getAllAadharUser(){
		List<Aadhar> adhar= adharService.getAllAadharHolder();
		System.out.println("Get all adhar hoder");
		return adhar;
	}
	
	@GetMapping("/{id}")
	public Optional<Aadhar> getAdharById(int id) {
		Optional<Aadhar> adharId=adharService.getAadharById(id);
		if(adharId.isPresent()) {
         System.out.println("Record retrived successfully");
		}
		else {
			System.out.println("Record not found");
		}
		return adharId;
	}
	
	

	
}
