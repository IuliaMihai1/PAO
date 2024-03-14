package animal.bird;

import animal.Animal;

public class Bird extends Animal {

    private String colour;

    public Bird(int noOfLegs, String name, String colour) {
        super(name, noOfLegs);         //call parent class constructor
        this.colour = colour;
    }

    /**
     * Suprascriere metoda (method overriding)
     */
    @Override
    public void move() {
        System.out.println("I can fly!");
    }

    public void sing() {
        System.out.println("I can chirp!");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
