package com.mystore.app;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
class Product {
    
    private int id;
    private String name;

    
    public Product() {
        System.out.println("In Product constructor");
    }

    public Product(String name, int id) {
       this.name = name;
       this.id = id;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "'}";
    }

}
