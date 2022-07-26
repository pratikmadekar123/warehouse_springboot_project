package com.in.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.nt.model.Part;

@Repository
public interface IPartRepository extends JpaRepository<Part, Integer> {

	
}
