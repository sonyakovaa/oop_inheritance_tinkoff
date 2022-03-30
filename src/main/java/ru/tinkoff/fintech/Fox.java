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
        /* In the else branch, the System.exit(1) call breaks the tests, so I added the creation of an instance of an animal without a name.
         * If not added, it will create an instance of an animal named null. */
    }
}
