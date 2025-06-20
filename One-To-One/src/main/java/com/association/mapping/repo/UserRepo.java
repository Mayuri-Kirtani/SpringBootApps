package com.association.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.association.mapping.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
