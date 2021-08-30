package com.company;

public interface IWalks {
    String walk();
}
class TwoLegs implements IWalks {
    @Override
    public String walk(){
        return "walking on 2 legs";
    }
}
class FourLegs implements IWalks {
    @Override
    public String walk() {
        return "walking on 4 legs";
    }
}

class NoLegs implements IWalks {
    @Override
    public String walk() {
        return "walking on no legs";
    }
}