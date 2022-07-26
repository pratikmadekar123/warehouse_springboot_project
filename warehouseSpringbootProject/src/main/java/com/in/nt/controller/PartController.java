package com.in.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.in.nt.model.Part;
import com.in.nt.services.IPartService;

@Controller
public class PartController {

	@Autowired
	private IPartService partService;

	public PartController(IPartService partService) {
		super();
		this.partService = partService;
	}

	
	@GetMapping("/part/data")
	public String getAllPart(Model model) {
		List<Part> list  = partService.getAllPart();
		model.addAttribute("partList", list);
		return "partData";
	}

	@GetMapping("/part/register")
	public String createPart(Model model) {
		Part part = new Part();
		model.addAttribute("part", part);	
		return "registerPart";
	}
	@PostMapping("/part/save")
	public String savePartData(@ModelAttribute Part part) {
		partService.savePart(part);
		return "redirect:/part/data";
	}
	
	@GetMapping("/part/edit/{id}")
	public String editPart(@PathVariable Integer id, Model map) {
		Part part = partService.getOnePart(id);
		map.addAttribute("editPart", part);
		return "editPart";
	}
	
	@PostMapping("/part/update/{id}")
	public String updatePartData(@PathVariable("id") Integer id, @ModelAttribute("Part") Part part, Model model) {
		Part oldPartData = partService.getOnePart(id);
		oldPartData.setPartId(id);
		oldPartData.setPartCode(part.getPartCode());
		oldPartData.setPartW(part.getPartW());
		oldPartData.setPartH(part.getPartH());
		oldPartData.setPartL(part.getPartL());
		oldPartData.setPartCurrency(part.getPartCurrency());
		oldPartData.setPartCost(part.getPartCost());
		oldPartData.setPartDesc(part.getPartDesc());
		partService.updatePart(oldPartData);
		return "redirect:/part/data";
	}
	
	@GetMapping("/part/delete/{id}")
	public String deletePartData(@PathVariable("id") Integer id) {
		partService.deletePart(id);
		return "redirect:/part/data";
	}
	
}
