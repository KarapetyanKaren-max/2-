package org.skypro;

import java.util.Objects;

public class Product {

    public String products;
    private String name;
    private int price;

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(products, product.products) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, name, price);
    }
}

