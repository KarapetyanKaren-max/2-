package org.skypro;

public class App {
    private static Product[] products;{

        new Product(25, "Молоко");
        new Product(50, "Рыба");
        new Product(35, "Хрен");
        new Product(120, "Масло");
        new Product(540, "Торт");
    }
    static ProductBasket basket = new ProductBasket();

    static void addProduct(String name) {
        for (int number = 0; number < products.length; number++)
            if (products[number].productsName.equalsIgnoreCase(name.trim())) {
                System.out.println("Продукт есть в магазине");
                basket.addProduct(products[number]);
                break;

            } else {
                System.out.println("Продукта в магазине нет");
            }
    }

    public static void main(String[] args) {
        System.out.println("Добавить продукт в корзину");
        String product = "молоко";
        addProduct(product);
        addProduct(product);
        addProduct(product);
        addProduct(product);
        basket.printBasket();
        System.out.println("Стоимость корзины: " + basket.priceBasket());
    }
}
