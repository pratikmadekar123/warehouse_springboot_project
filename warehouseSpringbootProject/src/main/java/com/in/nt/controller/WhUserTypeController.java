package com.in.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.in.nt.model.WhUserType;
import com.in.nt.services.IWhUserTypeService;

@Controller
//@RequestMapping("/one")
public class WhUserTypeController {

	@Autowired
	private IWhUserTypeService whService;
	
	@GetMapping("/whuser/data")
	public String getAllWhUser(Model model) {
		List<WhUserType> list =whService.getAllWhUserType();
		model.addAttribute("lists", list);
		return "whUserData";
	}
	
	@GetMapping("/whuser/register")
	public String whUserRegister(Model model) {
		WhUserType whuser = new WhUserType();
		model.addAttribute("whuser", whuser);
		return "registerWhUser";
	}
	@PostMapping("/whuser/save")
	public String saveWhUser(@ModelAttribute("whuser") WhUserType whuser) {
	 whService.saveWhUserType(whuser);		
		
		return "redirect:/whuser/data";
	}
	
	@GetMapping("/whuser/edit/{id}")
	public String getOneWhUser(@PathVariable("id") Integer id,
			Model model
			){
		WhUserType whuser = whService.getOneWhUserType(id);
		model.addAttribute("whuser", whuser);
		return "editwhuser";
	}
	
	@PostMapping("/whuser/update/{id}")
	public String updateWhUser(@PathVariable Integer id,Model model,
			@ModelAttribute("WhUser") WhUserType whuser) {
		WhUserType oldWhUserType = whService.getOneWhUserType(id);
		oldWhUserType.setWhUserId(id);
		oldWhUserType.setUserType(whuser.getUserType());
		oldWhUserType.setUserCode(whuser.getUserCode());
		oldWhUserType.setUserFor(whuser.getUserFor());
		oldWhUserType.setUserEmail(whuser.getUserEmail());
		oldWhUserType.setUserContact(whuser.getUserContact());
		oldWhUserType.setUserIdType(whuser.getUserIdType());
		oldWhUserType.setIdnumber(whuser.getIdnumber());
		whService.saveWhUserType(oldWhUserType);
		return "redirect:/whuser/data";
	}
	
	@GetMapping("/whuser/delete/{id}")
	public String deleteWhUser(@PathVariable("id") Integer id, Model model) {
		whService.delete(id);;
		return "redirect:/whuser/data";
	}
	
}
