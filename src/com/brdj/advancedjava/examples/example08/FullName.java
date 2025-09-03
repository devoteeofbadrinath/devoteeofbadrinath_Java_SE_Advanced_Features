package com.brdj.advancedjava.examples.example08;

import static com.brdj.advancedjava.examples.Validation.checkThat;

public record FullName(String firstName, String familyName) {

    public FullName {
        checkThat(firstName != null && !firstName.isBlank(), "firstName must not be null or blank");
        checkThat(familyName != null && !familyName.isBlank(), "familyName must not be blank");
    }

    @Override
    public String toString() {
        return firstName + ' ' + familyName;
    }
}
