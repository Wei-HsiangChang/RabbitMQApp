package com.RabbitMQApp.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderStatus {
	

	private Order order;
	private String status;
	private String message;
	
	public OrderStatus(Order order, String status, String message) {
		super();
		this.setOrder(order);
		this.setStatus(status);
		this.setMessage(message);
	}
	
	public OrderStatus() {
		
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
