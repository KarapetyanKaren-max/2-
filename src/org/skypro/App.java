package org.skypro;

public class App {
    private static Product[] products;

    {
        String name = "name";
        for (
                int number = 0; number < products.length; number++)
            if (products[number].products.equalsIgnoreCase(name.trim())) {
                System.out.println("Продукт есть в магазине");
                ProductBasket basket = null;
                basket.addProduct(products[number]);
                break;


            } else {
                System.out.println("Продукта в магазине нет");
            }
    }

    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();
        basket.addProduct(new Product(25, "Молоко"));
        basket.addProduct(new Product(25, "Рыба"));
        basket.addProduct(new Product(25, "Хрен"));
        basket.addProduct(new Product(25, "Масло"));
        basket.addProduct(new Product(25, "Торт"));
        System.out.println();
        System.out.println("Добавить продукт в корзину");
        basket.printBasket();
        System.out.println("Стоимость корзины: " + basket.priceBasket());

    }
}