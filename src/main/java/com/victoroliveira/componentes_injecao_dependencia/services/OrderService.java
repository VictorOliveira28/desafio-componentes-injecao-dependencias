package com.victoroliveira.componentes_injecao_dependencia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victoroliveira.componentes_injecao_dependencia.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;

	public Double total(Order order) {
		    
	    double totalValue = order.getBasic() - (order.getBasic() * order.getDiscount());
	    
		return totalValue + shippingService.shipment(order);
	}

}
