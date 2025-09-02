package com.brdj.advancedjava.examples.example06;

import java.math.BigDecimal;

public record OrderLine(Product product, int quantity, BigDecimal price) {
}
