package com.in.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.nt.model.ShipmentType;
@Repository
public interface IShipmentTypeRepo extends JpaRepository<ShipmentType, Integer> {

}
