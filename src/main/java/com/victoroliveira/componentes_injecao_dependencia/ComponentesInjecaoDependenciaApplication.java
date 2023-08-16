package com.victoroliveira.componentes_injecao_dependencia;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.victoroliveira.componentes_injecao_dependencia.entities.Order;
import com.victoroliveira.componentes_injecao_dependencia.services.OrderService;
import com.victoroliveira.componentes_injecao_dependencia.services.ShippingService;

@Component
@SpringBootApplication
public class ComponentesInjecaoDependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ComponentesInjecaoDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Cód: ");
		int code = sc.nextInt();
		System.out.print("Valor base: ");
		double base = sc.nextDouble();
		System.out.print("Desconto: ");
		double discount = sc.nextDouble();
		
		Order order = new Order(code, base, discount);

		
		System.out.println("Pedido Codigo " + order.getCode());
		System.out.print("Valor total: R$ " + String.format("%.2f", orderService.total(order)));

	}

}
