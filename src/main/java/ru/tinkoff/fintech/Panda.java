package ru.tinkoff.fintech;

import java.util.Objects;

public class Panda extends Animal {
    public Panda(final String name) {
        super(200);
        if (!Objects.equals(name, "") && (name.charAt(0) == 'P' || name.charAt(0) == 'p')) {
            this.setName(name);
        } else {
            this.setName("Panda without name");
        }
        /* В ветке else вызов System.exit(1) ломает тесты, поэтому добавила создание экземпляра животного без имени.
         * Если же не добавить, то он будет создавать экземпляр животного с именем null. */
    }
}
