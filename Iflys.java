package com.company;

//only one class per file can be public
public interface Iflys {
    String fly();
}

class CanFly implements Iflys {
    @Override
    public String fly(){
        return "is flying";
    }
}

class CantFly implements Iflys {
    @Override
    public String fly() {
        return "is walking";
    }
}
