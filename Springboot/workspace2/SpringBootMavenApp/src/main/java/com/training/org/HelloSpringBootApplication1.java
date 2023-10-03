package com.training.org;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class HelloSpringBootApplication1 {
	
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(HelloSpringBootApplication1.class, args);
		System.out.println("CTX"+ctx);
		
		String[] beanNames = ctx.getBeanDefinitionNames(); 
        Arrays.sort(beanNames);
         for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        
	}
	
}