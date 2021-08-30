package com.company;

public abstract class Animal {

    private String covering;
    private Iflys flyingType;
    private IWalks numLegs;

    public abstract String eat();
    public abstract String speak();

    public void setNumLegs(IWalks numLegs) {
        this.numLegs = numLegs;
    }
    public void setCovering(String covering) {
        this.covering = covering;
    }
    public void setFlyingType(Iflys flyingType) {
        this.flyingType = flyingType;
    }

    public String fly(){
        return flyingType.fly();
    }
    public String walk(){
        return numLegs.walk();
    }
    public String pet(){
        return "petting " + covering;
    }
}
