package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
     public Product tumbler() {
        return new Product("Tumbler", 250);
    }

    @Bean
    public Product bucket() {
        return new Product("Bucket", 500);
    }
}