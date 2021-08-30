package com.company;

public class Dog extends Animal {

    public Dog() {
        setCovering("fur");
        setFlyingType(new CantFly());
        setNumLegs(new FourLegs());
    }

    @Override
    public String eat() {
        return "ate some kibble";
    }

    @Override
    public String speak() {
        return "woof woof";
    }
}
