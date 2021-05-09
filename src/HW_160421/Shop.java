package HW_160421;

import java.util.ArrayList;

public class Shop {
    private  ArrayList<Products> listOfProduct = new ArrayList<>();

    /*добавить товар (принимает в качестве параметра объект товара и добавляет его в список товаров магазина).
    При попытке добавить товар с уже существующим id в списке, вставка производится не должна.
    */
    public void addProduct(Products p) throws ProductException {
        if (!listOfProduct.contains(p)){
            this.listOfProduct.add(p);
        } else {
            throw new ProductException("Product " + p.getName() + " ProductId = " + p.getProductId() +
                    " Price = " + p.getPrice() + " with this id already exists!");
        }
    }
    /*получить все товары (метод возвращает список всех товаров в магазине)*/
    public ArrayList<Products> getListOfProduct() throws ProductException {
        if (listOfProduct.size() > 0) {
            return listOfProduct;
        } else {
            throw new ProductException("List is empty\n");
        }
    }
    //удалить товар (метод принимает в качестве параметра id товара и удаляет из списка товар с соответствующим id)
    public void removeProduct(int productId) {
        listOfProduct.removeIf(products -> products.getProductId() == productId);
    }
    //редактировать товар (находим товар по его id, изменяем его параметры и сохраняем)
    public void editProduct(int productId, String name, int price) {
        for (Products p : listOfProduct) {
            if (p.getProductId() == productId) {
                p.setPrice(price);
                p.setName(name);
            }
        }
    }
        public void printListOfProduct() {
            for (Products products : listOfProduct) {
                System.out.printf("Product ID: %d\t Name: %s\t Price: %d\n", products.getProductId(), products.getName(),
                        products.getPrice());
        }
    }
}
