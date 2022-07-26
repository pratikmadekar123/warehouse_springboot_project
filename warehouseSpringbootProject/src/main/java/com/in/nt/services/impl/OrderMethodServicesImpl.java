package com.in.nt.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.nt.model.OrderMethod;
import com.in.nt.repository.IOrderMethodRepository;
import com.in.nt.services.IOrderMethodServices;
@Service
public class OrderMethodServicesImpl implements IOrderMethodServices {

	@Autowired
	private IOrderMethodRepository orderMethod;

	@Transactional
	public List<OrderMethod> getAllOrder() {
		// TODO Auto-generated method stub
		return orderMethod.findAll();
	}

	@Transactional
	public OrderMethod getOneOrderMethod(Integer id) {
		// TODO Auto-generated method stub
		return orderMethod.findById(id).get();
	}

	@Transactional
	public OrderMethod saveOrderMethod(OrderMethod order) {
		// TODO Auto-generated method stub
		return orderMethod.save(order);
	}

	@Transactional
	public void deleteOrder(Integer id) {
		orderMethod.deleteById(id);
	}

	@Transactional
	public OrderMethod updateOrder(OrderMethod order) {
		// TODO Auto-generated method stub
		return orderMethod.save(order);
	}

}
