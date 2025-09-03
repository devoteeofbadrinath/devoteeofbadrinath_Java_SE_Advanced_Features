package com.brdj.advancedjava.examples.example08;

import java.util.regex.Pattern;

import static com.brdj.advancedjava.examples.Validation.checkThat;

public record EmailAddress(String value) {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(".+@.+\\..+");

    // The logic for validating the email address is now contained in this record, where it belongs.
    public EmailAddress {
        checkThat(value != null && !value.isBlank(), "value must not be null or blank");
        checkThat(EMAIL_PATTERN.matcher(value).matches(), "not a valid email address: " + value);
    }

    @Override
    public String toString() {
        return value;
    }
}
