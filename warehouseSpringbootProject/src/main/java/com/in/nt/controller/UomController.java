package com.in.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.in.nt.model.Uom;
import com.in.nt.services.IUomService;

@Controller
//@RequestMapping("/uom")
public class UomController {
	private static final Logger LOGGER = LogManager.getLogger(UomController.class);
	
	@Autowired
	private IUomService uomService;

	@GetMapping("/home")
	public String homePage() {
		return "uomRegister";
	}

	//get from
	@GetMapping("/create")
	public String createUom(Model map) {
		Uom uom = new Uom();
		map.addAttribute("uom", uom);
   LOGGER.info("Create method"+uom);
		return "uomRegister";
	}

	// submit form data
	@PostMapping("/save")
	public String saveUom(@ModelAttribute("uom") Uom uom) {
		uomService.saveUom(uom);
		 LOGGER.info("save method"+uom);
		//String msg = "uom "+uom.getUomId()+ "  is saved.";
		return "redirect:/data";
	}

	//get all data
	@GetMapping("/data")
	public String getAllUom(Model map){
		List<Uom> list = uomService.getAllUom();
		map.addAttribute("lists", list);
		map.addAttribute("msg", "Hello World");

		return "uomData";
	}
	// delete record
	@GetMapping("/delete/{id}")
	public String deleteUom(@PathVariable("id") Integer id) {
		uomService.deleteUom(id);
		return "redirect:/data";
	}
	
	//update/edit record
	@GetMapping("/edit/{id}")
	public String editUom(@PathVariable("id") Integer id, Model model) {
		Uom uom = uomService.getUomById(id);
		 model.addAttribute("uom", uom);
		return "editUom";
	}
	
	@PostMapping("/update/{id}")
	public String updateUom(@PathVariable Integer id,
			@ModelAttribute("uom") Uom uom,
			Model model) {
		
		Uom existingUom = uomService.getUomById(id);
		
		  existingUom.setUomId(id); 
		  existingUom.setUomModel(uom.getUomModel());
		  existingUom.setUomType(uom.getUomType());
		  existingUom.setUomDesc(uom.getUomDesc());
		 
		LOGGER.info("update emthod"+existingUom);
		uomService.updateUom(existingUom);
	return "redirect:/data";	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
