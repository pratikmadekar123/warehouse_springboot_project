package com.in.nt.services;

import java.util.List;

import com.in.nt.model.ShipmentType;

public interface IShipmentTypeService {

	public List<ShipmentType> getAllShipments();
	public ShipmentType createShipment(ShipmentType shType);
	public void deleteShipment(Integer id);
	public ShipmentType getOneShipmentType(Integer id);
	public void updateShipment(ShipmentType shType);
	
}
