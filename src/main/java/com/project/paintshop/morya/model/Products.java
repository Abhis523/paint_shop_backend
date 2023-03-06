package com.project.paintshop.morya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table( name = "products")
@SecondaryTable(name = "productInfo", pkJoinColumns = @PrimaryKeyJoinColumn(name = "productId"))
public class Products {
//	productId varchar(20) PRIMARY KEY,
//	productName varchar(50) NOT NULL,
//	productTypeId varchar(20) NOT NULL,
//	imagePath varchar(200) NOT NULL,
//	description varchar(200) NOT NULL,
	
	@Id
	@Column(name = "productId")
	private String id;
	@Column(name = "productName")
	private String productName;
	@Column(name = "productTypeId")
	private String productTypeId;
	@Column(name = "imagePath")
	private String imagePath;
	@Column(name = "description")
	private String description;
	
	@Column(name = "productInfoId", table = "productInfo")
	private String productInfoId;
	@Column(name = "totalStock", table = "productInfo")
	private Integer totalStock;
	@Column(name = "unitPrice", table = "productInfo")
	private Integer price;
	@Column(name = "totalPrice", table = "productInfo")
	private Integer totalPrice;
	
	public String getId() {
		return id;
	}
	public void setProductId(String id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductInfoId() {
		return productInfoId;
	}
	public void setProductInfoId(String productInfoId) {
		this.productInfoId = productInfoId;
	}
	public Integer getTotalStock() {
		return totalStock;
	}
	public void setTotalStock(Integer totalStock) {
		this.totalStock = totalStock;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	@Override
	public String toString() {
		return "Products [id=" + id + ", productName=" + productName + ", productTypeId=" + productTypeId
				+ ", imagePath=" + imagePath + ", description=" + description + ", productInfoId=" + productInfoId
				+ ", totalStock=" + totalStock + ", price=" + price + ", totalPrice=" + totalPrice + "]";
	}
}
