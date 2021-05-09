package HW_160421;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws ProductException {
        Shop shop = new Shop();
        shop.addProduct(new Products(1, "Dress", 54));
        shop.addProduct(new Products(2, "T-shirt", 10));
        shop.addProduct(new Products(3, "Skirt", 32));
        shop.addProduct(new Products(4, "Shoes", 120));

        shop.listOfProducts().sort(Comparator.comparing(Products::getPrice));
        shop.printListOfProduct();
        System.out.println();

        shop.removeProduct(3);

        shop.listOfProducts().sort(Comparator.comparing(Products::getProductId).reversed());
        shop.printListOfProduct();
        System.out.println();

        shop.editProduct(2, "Paints", 25);
        shop.printListOfProduct();
    }
}