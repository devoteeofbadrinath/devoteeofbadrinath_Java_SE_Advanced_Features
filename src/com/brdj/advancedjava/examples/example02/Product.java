package com.brdj.advancedjava.examples.example02;

public record Product(Long id, String name, String description) {

    // The compiler translates this to a final class
    // with private final fields for the components

    // The compiler generates a constructor that initializes the fields

    // The compiler generates accessor methods:
    // public long id { return this.id; }
    // public String name { return this.name; }
    // public String id { return this.description; }

    // Instance fields are not allowed
    // private int value;

    // Static fields are allowed
    private static int VALUE = 23;

    // Static blocks are allowed
    // Instance initializer blocks to a record are not allowed

    public boolean hasDescription() {
        return description != null && !description.isBlank();
    }

}
