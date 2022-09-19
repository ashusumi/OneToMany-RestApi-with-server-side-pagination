package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Product {
@Id
private Integer productId;
private String productName;
private String productDescription;
@ManyToOne
@JoinColumn(name="categoryId")
private Category category;
public Product(Category category) {
	super();
	this.category = category;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public Product() {
	
}
public Product(Integer productId, String productName, String productDescription) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productDescription = productDescription;
}
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}


}
