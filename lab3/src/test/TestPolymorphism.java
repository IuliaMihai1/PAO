package test;

import animal.Animal;
import animal.bird.Bird;
import animal.ape.Ape;

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Ape(2, "gorilla", "big");
        Animal a3 = new Bird(2, "sparrow", "gray");

        moveAndEat(a1);
        moveAndEat(a2);
        moveAndEat(a3);
    }

    public static void moveAndEat(Animal animal) {
        animal.move();
        animal.eat();
    }
}
