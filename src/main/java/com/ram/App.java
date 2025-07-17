package com.ram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Product p= (Product) context.getBean("product");
        p.productDetails();
    }
}
