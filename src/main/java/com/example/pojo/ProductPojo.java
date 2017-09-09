package com.example.pojo;

import java.util.ArrayList;

public class ProductPojo {
private String productName;
private String productId;
private String productCategory;
private ArrayList<ProductOrder> prodordrlist=new ArrayList<>();
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
public ArrayList<ProductOrder> getProdordrlist() {
	return prodordrlist;
}
public void setProdordrlist(ArrayList<ProductOrder> prodordrlist) {
	this.prodordrlist = prodordrlist;
}

}
