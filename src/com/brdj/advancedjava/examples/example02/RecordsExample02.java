package com.brdj.advancedjava.examples.example02;

public class RecordsExample02 {

    public static void main(String[] args) {
        var product = new Product(100123L, "Apples", "Tasty red apples");

        var productId = product.id();
        var productName = product.name();
        System.out.printf("Product %d has name: %s%n", productId, productName);

        System.out.println("Does it have a description? " + product.hasDescription());
    }
}
