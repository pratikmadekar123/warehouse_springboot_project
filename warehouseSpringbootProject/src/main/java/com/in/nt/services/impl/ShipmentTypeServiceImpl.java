package com.in.nt.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.nt.model.ShipmentType;
import com.in.nt.repository.IShipmentTypeRepo;
import com.in.nt.services.IShipmentTypeService;
@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {

	@Autowired
	private IShipmentTypeRepo shipmentType;

	@Transactional
	public List<ShipmentType> getAllShipments() {

		return shipmentType.findAll();
	}
	@Transactional
	public ShipmentType createShipment(ShipmentType shType) {
		return shipmentType.save(shType);
	}

	@Transactional
	public void deleteShipment(Integer id) {
		shipmentType.deleteById(id);

	}
	@Transactional
	public ShipmentType getOneShipmentType(Integer id) {
		
		return shipmentType.findById(id).get();
	}

	@Transactional
	public void updateShipment(ShipmentType shType) {
		
	}

}
