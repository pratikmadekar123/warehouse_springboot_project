package com.in.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.in.nt.model.ShipmentType;
import com.in.nt.services.IShipmentTypeService;

@Controller
public class ShipmentTypeController {
	
	@Autowired
	private IShipmentTypeService shType;
	
	@GetMapping("/shipment/data")
	public String getAllShipment(Model map) {
		List<ShipmentType> list = shType.getAllShipments();
		map.addAttribute("list", list);
		return "shipmentTypeData";
		
	}
	@GetMapping("/shipment/register")
	public String createShipment(Model model) {
		ShipmentType shipment = new ShipmentType();
		model.addAttribute("shipment", shipment);
		return "shipmentRegister";
	}
	@PostMapping("/shipment/save")
	public String createShipmentType(@ModelAttribute("shipment") ShipmentType shipment) {
		shType.createShipment(shipment);
		
		return "redirect:/shipment/data";
	}
	
	@GetMapping("/shipment/edit/{id}")
	public String editShipmentType(@PathVariable("id") Integer id, Model model){
		
		ShipmentType shipment = shType.getOneShipmentType(id);
		model.addAttribute("shipment", shipment);
		
		return "editShipmentType";
	}
	
	@PostMapping("/shipment/update/{id}")
	public String updateShipmentType(@ModelAttribute ShipmentType shipment, @PathVariable("id") Integer id, Model map) {
		ShipmentType ship = shType.getOneShipmentType(id);
		ship.setShipId(id);
		ship.setShipMode(shipment.getShipMode());
		ship.setShipCode(shipment.getShipCode());
		ship.setEnbShip(shipment.getEnbShip());
		ship.setShipGrade(shipment.getShipGrade());
		ship.setShipDesc(shipment.getShipDesc());
		shType.updateShipment(ship);
		
		return "redirect:/shipment/data";
	}
	
	@GetMapping("/shipment/{id}")
	public String deleteShipmentType(@PathVariable("id") Integer id) {
		shType.deleteShipment(id);
		return "redirect:/shipment/data";
	}
}
