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
        /* В ветке else вызов System.exit(1) ломает тесты, поэтому добавила создание экземпляра животного без имени.
         * Если же не добавить, то он будет создавать экземпляр животного с именем null. */
    }
}
