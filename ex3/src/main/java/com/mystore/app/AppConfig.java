package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mystore.app")
public class AppConfig {

    @Bean
    public Product tumbler() {
        Product product = new Product();
        product.setId(1);
        product.setName("Tumbler");
        product.setBarcode();
        return product;
    }

    @Bean
    public Product bucket() {
        Product product = new Product();
        product.setId(2);
        product.setName("Bucket");
        product.setBarcode();
        return product;
    }
}
