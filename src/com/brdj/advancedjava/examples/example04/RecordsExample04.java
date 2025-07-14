package com.brdj.advancedjava.examples.example04;

import com.brdj.advancedjava.examples.example03.Customer;

public class RecordsExample04 {

    public static void main(String[] args) {
        var customer = new Customer(500567L, "Joe Smith", "joe.smith@example.com");
        System.out.println(customer);
    }
}
