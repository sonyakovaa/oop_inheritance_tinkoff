package ru.tinkoff.fintech;

import java.util.Objects;

public class Rabbit extends Animal {
    public Rabbit(final String name) {
        super(5);
        if (!Objects.equals(name, "") && (name.charAt(0) == 'R' || name.charAt(0) == 'r')) {
            this.setName(name);
        } else {
            this.setName("Rabbit without name");
        }
    }
}
