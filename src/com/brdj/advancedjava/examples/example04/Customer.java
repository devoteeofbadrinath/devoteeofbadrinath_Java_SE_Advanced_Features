package com.brdj.advancedjava.examples.example04;

public record Customer(long id, String name, String email) {

    @Override
    public boolean equals(Object o) {
        return o instanceof Customer other && this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}
