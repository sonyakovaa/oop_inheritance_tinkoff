package ru.tinkoff.qa;

import org.junit.jupiter.api.Test;
import ru.tinkoff.fintech.*;

public class ZooTests {

    @Test
    public void foodBagSetter() {
        new BagFood(100).setFood(100);
    }

    @Test
    public void foodBagGetter() {
        new BagFood(100).getFood();
    }

    @Test
    public void foodBagConstructor() {
        new BagFood(100);
    }

    @Test
    public void animalConstructor() {
        new Animal(100);
    }

    @Test
    public void pandaExists() {
        new Panda("");
    }

    @Test
    public void rabbitExists() {
        new Rabbit("");
    }

    @Test
    public void foxExists() {
        new Fox("");
    }

    @Test
    public void zooFoodBagIsEmptyTrue() {
        assert new Zoo().foodBagIsEmpty(new BagFood(0));
    }

    @Test
    public void zooFoodBagIsEmptyFalse() {
        assert !new Zoo().foodBagIsEmpty(new BagFood(100));
    }

    @Test
    public void feedAnimalIsWorking() {
        BagFood bagFood = new BagFood(1000);
        new Zoo().feedAnimals(bagFood);
        assert bagFood.getFood() == 0;
    }
}
