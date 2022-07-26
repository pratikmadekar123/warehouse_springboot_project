package com.in.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.nt.model.OrderMethod;
@Repository
public interface IOrderMethodRepository extends JpaRepository<OrderMethod, Integer> {

}
