package com.in.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.nt.model.WhUserType;
@Repository
public interface IWhUserTypeRepo extends JpaRepository<WhUserType, Integer> {

}
