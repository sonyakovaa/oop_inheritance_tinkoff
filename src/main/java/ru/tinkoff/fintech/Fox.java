package ru.tinkoff.fintech;

import java.util.Objects;

public class Fox extends Animal {
    public Fox(final String name) {
        super(21);
        if (!Objects.equals(name, "") && (name.charAt(0) == 'F' || name.charAt(0) == 'f')) {
            this.setName(name);
        } else {
            this.setName("Fox without name");
        }
        /* В ветке else вызов System.exit(1) ломает тесты, поэтому добавила создание экземпляра животного без имени.
         * Если же не добавить, то он будет создавать экземпляр животного с именем null. */
    }
}
