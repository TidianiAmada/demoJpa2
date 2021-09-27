package com.saraya.app.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.app.entity.PersonInfo;

@Repository
public interface PersonRepo extends JpaRepository<PersonInfo, String> {
	
}
