package HW_160421;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws ProductException {
        //создать объект магазина
        Shop shop = new Shop();
        //создать несколько товаров и добавить их в магазин
        try {
            shop.addProduct(new Products(1, "Dress", 54));
            shop.addProduct(new Products(2, "T-shirt", 10));
            shop.addProduct(new Products(3, "Skirt", 32));
            shop.addProduct(new Products(4, "Shoes", 120));

            shop.addProduct(new Products(2, "T-shirt", 10));
        }catch (ProductException ex){
            System.out.println(ex.getMessage());
        }

        //получить список товаров из магазина, отсортировать их по цене (по возрастанию) и вывести в консоль
        shop.getListOfProduct().sort(Comparator.comparing(Products::getPrice));
        shop.printListOfProduct();
        System.out.println();

        //удалить один товар
        shop.removeProduct(1);

        //получить список товаров из магазина, отсортировать их по порядку добавления
        // (последние добавленные должны быть в начале списка) и вывести в консоль
        shop.getListOfProduct().sort(Comparator.comparing(Products::getProductId).reversed());
        shop.printListOfProduct();
        System.out.println();

        //отредактировать один товар
        shop.editProduct(2, "Paints", 25);

        //получить список товаров и вывести их в консоль.
        shop.printListOfProduct();
    }
}