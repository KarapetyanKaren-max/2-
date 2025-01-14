package org.skypro;

import java.util.Arrays;

public class ProductBasket {
    private Product[] products = new Product[5];

    // Этот класс содержит в себе одну корзину с продуктами, которые купил один пользователь
    // Вам нужно реализовать следующие публичные методы
    public void addProduct(Product name) {
        for (int number = 0; number < products.length; number++) {
            if (products[number] == null) {
                products[number] = name;
                System.out.println("Продукт в корзину добавлен");
                break;
            }
            if (number == products.length - 1) {
                System.out.println("корзина заполнена");
            }
        }
    }

    @Override
    public String toString() {
        return "ProductBasket{" +
                "products=" + Arrays.toString(products) +
                '}';
    }

    public int priceBasket() {
        int sum = 0;
        if (products[0] == null) {
            System.out.println("Корзина пуста");
        } else {
            for (Product variable : products) {
                sum = sum + variable.getPrice();
            }
            return sum;
        }
        return 0;
    }
    public void printBasket() {
        if (products[0] == null) {
            System.out.println("Корзина пуста");
        }
        for (Product variable : products) {
            if (variable != null) {
                System.out.println(variable);
            }
        }
        System.out.println("Цена корзины: " + priceBasket());
    }
    public void deleteProduct () {
        for (int number = 0; number < products.length; number++) {
            products[number] = null;
        }
        System.out.println("Корзина очищена");
    }
}
