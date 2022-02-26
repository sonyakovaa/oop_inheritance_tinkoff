package ru.tinkoff.fintech;
import ru.tinkoff.fintech.Zoo;
import ru.tinkoff.fintech.BagFood;

public class Main {
    public static void main(String args[]) {
        BagFood food = new BagFood(1000);
        Zoo zoo = new Zoo();
        zoo.feedAnimals(food);
    }
}
