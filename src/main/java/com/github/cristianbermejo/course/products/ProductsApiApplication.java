package com.github.cristianbermejo.course.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"com.github.cristianbermejo.course.products.controller",
		"com.github.cristianbermejo.course.products.service"
})
@EnableJpaRepositories(basePackages = "com.github.cristianbermejo.course.products.dao")
@EntityScan
public class ProductsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApiApplication.class, args);
	}

}
