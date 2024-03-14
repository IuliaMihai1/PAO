package animal.bird;

import java.util.Objects;

public class Duck extends Bird {

    private int length;

    public Duck(int noOfLegs, String name, String colour, int length) {
        super(noOfLegs, name, colour);
        this.length = length;
    }

    @Override
    public void move() {
        System.out.println("I can swim!");
    }

    @Override
    public void sing() {
        System.out.println("I can quack!");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Duck duck = (Duck) o;
        return this.getLength() == duck.getLength()
                && Objects.equals(this.getName(), duck.getName())
                && Objects.equals(this.getColour(), duck.getColour())
                && this.getNoOfLegs() == duck.getNoOfLegs();
    }
    @Override
    public int hashCode() {
        return Objects.hash(length, getName(), getColour(), getNoOfLegs());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
