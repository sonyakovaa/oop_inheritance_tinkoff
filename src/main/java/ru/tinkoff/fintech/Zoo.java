package ru.tinkoff.fintech;

import java.util.ArrayList;

public class Zoo {

    public final void feedAnimals(final BagFood bagFood) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Panda(""));
        animals.add(new Rabbit("Rorya"));
        animals.add(new Fox("Fetya"));

        for (int i = 0; !foodBagIsEmpty(bagFood); i++) {
            animals.get(i % animals.size()).eat(bagFood);
        }

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " ate " + animal.getCountEat() + " times");
        }
    }

    public static boolean foodBagIsEmpty(final BagFood bagFood) {
        int checkingTheBag = bagFood.getFood();
        return checkingTheBag == 0;
    }
}
