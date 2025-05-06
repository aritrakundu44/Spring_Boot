package com.example.ecommerce;

import com.example.ecommerce.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(EcommerceApplication.class, args);
		MyController bean = run.getBean(MyController.class);
		System.out.println(bean.getPhone());
	}

}
