package com.association.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.association.mapping.entity.Aadhar;



@Repository
public interface AadharRepo extends JpaRepository<Aadhar, Integer> {

}
