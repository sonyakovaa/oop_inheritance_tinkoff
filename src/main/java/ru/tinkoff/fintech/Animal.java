package ru.tinkoff.fintech;

public class Animal {
    private int foodNeeded;
    private String name;
    private double countEat;

    public Animal(final int foodNeeded) {
        this.foodNeeded = foodNeeded;
    }

    public final int getFoodNeeded() {
        return foodNeeded;
    }

    public final void setFoodNeeded(final int foodNeeded) {
        this.foodNeeded = foodNeeded;
    }

    public final double getCountEat() {
        return countEat;
    }

    public final void setCountEat(final double countEat) {
        this.countEat = countEat;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public void eat(final BagFood bagFood) {
        int feedFromBag = bagFood.getFood();
        if (feedFromBag >= this.getFoodNeeded()) {
            feedFromBag -= this.getFoodNeeded();
            bagFood.setFood(feedFromBag);
            double temp = this.getCountEat() + 1;
            this.setCountEat(temp);
        } else {
            double temp = this.getCountEat() + (feedFromBag * 1.0 / this.getFoodNeeded());
            bagFood.setFood(0);
            this.setCountEat(temp);
        }
    }
}
