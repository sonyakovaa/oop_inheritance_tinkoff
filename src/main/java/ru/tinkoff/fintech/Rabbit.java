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
        /* In the else branch, the System.exit(1) call breaks the tests, so I added the creation of an instance of an animal without a name.
         * If not added, it will create an instance of an animal named null. */
    }
}
