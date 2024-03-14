package animal;

public class Animal {
    private String name;

    private int noOfLegs;

    public Animal() { //constructor
    }

    /* Supraincarcare constructor (overloading) */
    public Animal(String name, int noOfLegs) { //constructor
        this.noOfLegs = noOfLegs;
        this.name = name;
    }

    public void move() {
        System.out.println("I can move!");
    }

    public void eat() {
        System.out.println("I need something to eat!");
    }

    /* Supraincarcare metoda (overloading) */
    public void eat(String whatIEat) {
        System.out.println("I eat " + whatIEat);
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
