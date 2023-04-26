package com.github.cristianbermejo.course.products.service;

import java.util.List;

import com.github.cristianbermejo.course.products.model.Product;

public interface ProductService {
	List<Product> getAll();
	double getProductPrice(int productCode);
	void updateStock(int productCode, int units);
}
