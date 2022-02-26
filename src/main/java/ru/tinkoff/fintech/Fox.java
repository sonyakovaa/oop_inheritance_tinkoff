package ru.tinkoff.fintech;

import java.util.Objects;

public class Fox extends Animal {
    public Fox(final String name) {
        super(21);
        if (!Objects.equals(name, "") && (name.charAt(0) == 'F' || name.charAt(0) == 'f')) {
            this.setName(name);
        }
    }
}
