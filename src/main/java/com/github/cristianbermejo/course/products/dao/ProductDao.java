package com.github.cristianbermejo.course.products.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.cristianbermejo.course.products.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
