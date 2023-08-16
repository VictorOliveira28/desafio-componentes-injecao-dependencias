package com.victoroliveira.componentes_injecao_dependencia.entities;

import org.springframework.beans.factory.annotation.Autowired;

import com.victoroliveira.componentes_injecao_dependencia.services.OrderService;
import com.victoroliveira.componentes_injecao_dependencia.services.ShippingService;

public class Order {
	
	private int code;
	private double basic;
	private double discount;
	
	@Autowired
	private OrderService orderService;
	@Autowired
	private	ShippingService shippingService;
	
	public Order() {		
	}

	public Order(Integer code, Double basic, Double discount) {
		super();
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public Double getDiscount() {
		return discount / 100.0;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public ShippingService getShippingService() {
		return shippingService;
	}

	public void setShippingService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
}
