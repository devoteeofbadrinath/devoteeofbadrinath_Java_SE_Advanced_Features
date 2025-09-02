package com.brdj.advancedjava.examples.example07;

import java.time.LocalDateTime;
import java.util.List;

import static com.brdj.advancedjava.examples.example05.Validation.checkThat;

public record Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {

    public Order {

        checkThat(customer != null, "customer must not be null");
        checkThat(dateTime != null, "dateTime must not be null");
        checkThat(lines != null && !lines.isEmpty(), "lines must not be null or empty");

        lines = List.copyOf(lines);
    }

    // Rules:
    // - The canonical constructor's access level cannot be more restrictive than that of the record itself
    // - The canonical constructor cannot have a 'throws' clause/

    public static Order createOrderAtCurrentDateTime(long id, Customer customer, List<OrderLine> lines) {
        return new Order(id, customer, LocalDateTime.now(), lines);
    }
}