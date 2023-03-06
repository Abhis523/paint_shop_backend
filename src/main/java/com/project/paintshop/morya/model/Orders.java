package com.project.paintshop.morya.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Orders {

//	orderId VARCHAR2(20) PRIMARY KEY,
//	custId VARCHAR2(20) NOT NULL,
//	productId VARCHAR2(20) NOT NULL,
//	quantity NUMBER,
//	totalCost NUMBER,
//	orderDate DATE,
	
	@Id
	private String orderId;
	private String custId;
	private String productId;
	private Integer quantity;
	private Integer totalCost;
	private Date orderDate;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}
	
	public Orders(String orderId, String custId, String productId, Integer quantity, Integer totalCost,
			Date orderDate) {
		super();
		this.orderId = orderId;
		this.custId = custId;
		this.productId = productId;
		this.quantity = quantity;
		this.totalCost = totalCost;
		this.orderDate = orderDate;
	}

	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", custId=" + custId + ", productId=" + productId + ", quantity="
				+ quantity + ", totalCost=" + totalCost + ", orderDate=" + orderDate + "]";
	}	
}
