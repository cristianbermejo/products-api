package com.github.cristianbermejo.course.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.cristianbermejo.course.products.dao.ProductDao;
import com.github.cristianbermejo.course.products.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao dao;

	@Override
	public List<Product> getAll() {
		return dao.findAll();
	}

	@Override
	public double getProductPrice(int productCode) {
		return dao.findById(productCode).map(Product::getPrice).orElse(0D);
	}

	@Override
	public void updateStock(int productCode, int units) {
		Product product = dao.findById(productCode).orElse(null);
		
		if (product != null && product.getStock() > units) {
			product.setStock(product.getStock() - units);
			dao.save(product);
		}
	}

}
