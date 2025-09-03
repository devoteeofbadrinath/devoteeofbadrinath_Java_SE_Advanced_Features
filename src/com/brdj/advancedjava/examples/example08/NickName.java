package com.brdj.advancedjava.examples.example08;

import static com.brdj.advancedjava.examples.Validation.checkThat;

public record NickName(String value) {

    public NickName {
        checkThat(value != null && !value.isBlank(), "value must not be null or blank");
    }

    @Override
    public String toString() {
        return value;
    }
}
