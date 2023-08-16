package com.victoroliveira.componentes_injecao_dependencia.services;

import org.springframework.stereotype.Service;

import com.victoroliveira.componentes_injecao_dependencia.entities.Order;

@Service
public class ShippingService {
	
	public Double shipment(Order order) {

		double totalValue = order.getBasic() - (order.getBasic() * order.getDiscount());

		if (totalValue < 100.0) {

			return 20.0;

		} else if (totalValue >= 100.0 && (totalValue) <= 200.0) {

			return 12.0;

		} else {

			return 0.0;
		}
	}

}