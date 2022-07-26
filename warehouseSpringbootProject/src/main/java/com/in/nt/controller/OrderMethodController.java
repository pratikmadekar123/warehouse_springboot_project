package com.in.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.in.nt.model.OrderMethod;
import com.in.nt.services.IOrderMethodServices;

@Controller
public class OrderMethodController {

	@Autowired
	private IOrderMethodServices orderService;
	
	@GetMapping("/ordermethod/data")
	public String getAllOrder(Model model) {
		List<OrderMethod> lists =orderService.getAllOrder();
		model.addAttribute("lists", lists);
		
		return "orderMethodData";
	}
	
	@GetMapping("/ordermethod/register")
	public String orderRegister(Model model) {
		OrderMethod order =new OrderMethod();
		model.addAttribute("order", order);
		return "orderRegister";
	}
	@PostMapping("/ordermethod/save")
	public String saveOrder(@ModelAttribute("order") OrderMethod order, Model model) {
		orderService.saveOrderMethod(order);
		
		return "redirect:/ordermethod/data";
	}
	
	@GetMapping("/ordermethod/edit/{id}")
	public String editOrder(@PathVariable("id")Integer id,Model model) {
		OrderMethod order =orderService.getOneOrderMethod(id);
		model.addAttribute("order", order);
		return "editOrder";
	}
	
	@PostMapping("/ordermethod/update/{id}")
	public String updateOrder(@PathVariable Integer id, Model model,@ModelAttribute("order") OrderMethod order) {
		OrderMethod oldOrder =orderService.getOneOrderMethod(id);
		oldOrder.setOrderId(id);
		oldOrder.setOrderMethod(order.getOrderMethod());
		oldOrder.setOrderType(order.getOrderType());
		oldOrder.setOrderAcpt(order.getOrderAcpt());
		oldOrder.setOrderDesc(order.getOrderDesc());
		orderService.saveOrderMethod(oldOrder);
		return "redirect:/ordermethod/data";
		
	}
	@GetMapping("/ordermethod/delete/{id}")
	public String deleteOrder(@PathVariable("id") Integer id, Model model) {
		orderService.deleteOrder(id);
		return "redirect:/ordermethod/data";
	}
}
