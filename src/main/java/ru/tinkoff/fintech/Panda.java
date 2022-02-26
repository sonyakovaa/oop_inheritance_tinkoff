package ru.tinkoff.fintech;

import java.util.Objects;

public class Panda extends Animal {
    public Panda(final String name) {
        super(200);
        if (!Objects.equals(name, "") && (name.charAt(0) == 'P' || name.charAt(0) == 'p')) {
            this.setName(name);
        }
    }
}
