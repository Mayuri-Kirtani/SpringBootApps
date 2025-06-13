package com.association.mapping.service;

import java.util.List;
import java.util.Optional;

import com.association.mapping.entity.Aadhar;

public interface AadharService {

	public Aadhar addAadharUser(Aadhar aadhar);
	public List<Aadhar> getAllAadharHolder();
	public Optional<Aadhar> getAadharById(int id);
}
