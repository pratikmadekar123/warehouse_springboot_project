package com.in.nt.services;

import java.util.List;

import com.in.nt.model.OrderMethod;

public interface IOrderMethodServices {

	public List<OrderMethod> getAllOrder();
	public  OrderMethod getOneOrderMethod(Integer id);
	public OrderMethod saveOrderMethod(OrderMethod order);
	public void deleteOrder(Integer id);
	public OrderMethod updateOrder(OrderMethod order);
}
