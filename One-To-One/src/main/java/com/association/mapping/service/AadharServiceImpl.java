package com.association.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.association.mapping.entity.Aadhar;
import com.association.mapping.repo.AadharRepo;

@Service
public class AadharServiceImpl implements AadharService {

	@Autowired
	private AadharRepo repo;
	
	@Override
	public Aadhar addAadharUser(Aadhar aadhar) {
		return repo.save(aadhar);	

	}

	@Override
	public List<Aadhar> getAllAadharHolder() {
		
		return repo.findAll();
	}

	@Override
	public Optional<Aadhar> getAadharById(int id) {
		
		return Optional.of(repo.getById(id));
	}

}
