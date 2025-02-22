package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] arg) {
        
       // Product p1 = new Product();

        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        Product p1 = ac.getBean(Product.class);
        p1.setId(1);
        p1.setName("Tumbler");
        System.out.println(p1);

        Product p2 = ac.getBean(Product.class);
        //Product p2 = new Product();
        p2.setId(2);
        p2.setName("Bucket");        
        System.out.println(p2);
    }  
}