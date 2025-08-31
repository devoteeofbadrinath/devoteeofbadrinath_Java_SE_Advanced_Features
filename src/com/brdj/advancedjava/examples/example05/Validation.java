package com.brdj.advancedjava.examples.example05;

/**
 * Utility method for validation, used in the examples.
 */
public class Validation {

    private Validation() {
    }

    public static void checkThat(boolean expr, String message) {
        if (!expr) {
            throw new IllegalArgumentException(message);
        }
    }
}
