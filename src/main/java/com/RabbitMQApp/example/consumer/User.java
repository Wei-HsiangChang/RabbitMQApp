package com.RabbitMQApp.example.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.RabbitMQApp.example.config.MessagingConfig;
import com.RabbitMQApp.example.dto.OrderStatus;

@Component
public class User {
	
	@RabbitListener(queues = MessagingConfig.QUEUE)
	public void consumeMessageFromQueue(OrderStatus orderstatus) {
		System.out.println("Message received from queue: " + orderstatus);
		
	}

}
