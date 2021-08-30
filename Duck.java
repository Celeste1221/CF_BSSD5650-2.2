package com.company;

public class Duck extends Animal {

    public Duck(){
        setCovering("feathers");
        setFlyingType(new CanFly());
        setNumLegs(new TwoLegs());
    }

    @Override
    public String eat() {
        return "ate some bread";
    }

    @Override
    public String speak() {
        return "quack quack";
    }
}
