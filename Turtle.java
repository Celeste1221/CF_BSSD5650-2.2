package com.company;

public class Turtle extends Animal {
    public Turtle(){
        setCovering("half-shell");
        setFlyingType(new CantFly());
        setNumLegs(new FourLegs());
    }

    @Override
    public String eat() {
        return "ate some grass";
    }

    @Override
    public String speak() {
        return "squeak";
    }
}
