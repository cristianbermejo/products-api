package com.github.cristianbermejo.course.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.cristianbermejo.course.products.model.Product;
import com.github.cristianbermejo.course.products.service.ProductService;

@RestController
public class ProductController {

	 @Autowired
	 ProductService service;
	 
	 @GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<Product> getAll() {
		 return service.getAll();
	 }
	 
	 @PutMapping("/product/{code}/stock?substractUnits={units}")
	 public void updateStock(@PathVariable("code") int productCode, @RequestParam("units") int units) {
		 service.updateStock(productCode, units);
	 }
	 
	 @GetMapping(value = "/product/{code}/price", produces = MediaType.TEXT_PLAIN_VALUE)
	 public String getProductPrice(@PathVariable("code") int productCode) {
		 return String.valueOf(service.getProductPrice(productCode));
	 }
}
