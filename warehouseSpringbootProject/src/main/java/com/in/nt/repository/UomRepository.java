package com.in.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.nt.model.Uom;

@Repository
public interface UomRepository extends   JpaRepository<Uom, Integer>   {

	

}
