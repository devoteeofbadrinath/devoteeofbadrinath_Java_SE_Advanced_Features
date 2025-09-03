package com.brdj.advancedjava.examples.example07;

import static com.brdj.advancedjava.examples.Validation.checkThat;

public record Product(long id, String name, String description) {

    public Product {
        checkThat(name != null && !name.isBlank(), "name must not be null or blank");
    }

    public Product(long id, String name) {
        this(id, name, null);
    }
}
