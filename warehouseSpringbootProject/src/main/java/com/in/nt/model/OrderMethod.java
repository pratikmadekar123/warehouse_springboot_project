package com.in.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="OrderMethod")
@Data
public class OrderMethod {
	@Id
	@GeneratedValue
	@Column(name="OrdeID")
	private Integer orderId;
	@Column(name="OrderMethod")
	private String orderMethod;
	@Column(name="OrderType")
	private String orderType;
	@Column(name="orderAccepted")
	private String orderAcpt;
	@Column(name="orderDesc")
	private String orderDesc;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderAcpt() {
		return orderAcpt;
	}
	public void setOrderAcpt(String orderAcpt) {
		this.orderAcpt = orderAcpt;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	@Override
	public String toString() {
		return "OrderMethod [orderId=" + orderId + ", orderMethod=" + orderMethod + ", orderType=" + orderType
				+ ", orderAcpt=" + orderAcpt + ", orderDesc=" + orderDesc + "]";
	}
	

}
