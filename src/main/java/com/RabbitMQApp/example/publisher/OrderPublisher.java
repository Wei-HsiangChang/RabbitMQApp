package com.RabbitMQApp.example.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RabbitMQApp.example.config.MessagingConfig;
import com.RabbitMQApp.example.dto.Order;
import com.RabbitMQApp.example.dto.OrderStatus;

@RestController
@RequestMapping("/order")
public class OrderPublisher {
	
	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/{restaurantName}")
	public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
		order.setOrderId(UUID.randomUUID().toString());
		
		OrderStatus orderStatus = new OrderStatus(order, "PROCESS", "order placed successfully in " + restaurantName);
		
		template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.JAVA_ROUTING_KEY, orderStatus);
		
		return "Success !!";
		
	}

}
