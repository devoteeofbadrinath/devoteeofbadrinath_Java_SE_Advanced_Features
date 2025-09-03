package com.brdj.advancedjava.examples;

/**
 * Utility method for validation, used in the examples.
 */
/**
 * Utility method for validation, used in the examples.
 */
public final class Validation {

    private Validation() {
    }

    public static void checkThat(boolean expr, String message) {
        if (!expr) {
            throw new IllegalArgumentException(message);
        }
    }
}

