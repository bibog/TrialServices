package com.example.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.ProductPojo;
@RestController
public class ProductController {
	
@RequestMapping(value="/id",method =RequestMethod.GET)
public int getIdDetails(String b){
	System.out.println("inside the controller:Orderdetails  ");
	ProductPojo pdpj=new ProductPojo();
	String a=pdpj.getProductId();
			if (a.equalsIgnoreCase(b)){
				System.out.println("There was a id match");
				return 1;
			}else{
				System.out.println("There was an id mismatch");
				return 0;
			}
}		
public static void main(){
	ProductController pc=new ProductController();
	System.out.println(pc.getIdDetails("1"));
}
}

