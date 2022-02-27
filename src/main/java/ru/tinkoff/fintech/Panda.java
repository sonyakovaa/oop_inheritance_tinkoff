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
        /* In the else branch, the System.exit(1) call breaks the tests, so I added the creation of an instance of an animal without a name.
         * If not added, it will create an instance of an animal named null. */
    }
}
