package com.brdj.advancedjava.examples.example08;

public class RecordsExample08 {

    public static void main(String[] args) {
        var customer1 = new Customer1(500567L, "joes", "joe", "smith", "joe.smith@example.com");
        System.out.println(customer1);

        var customer2 = new Customer2(500567L, new FullName("Joe", "Smith"), new NickName("joes"), new EmailAddress("joe.smith@example.com"));
        System.out.println(customer2);

    }
}
