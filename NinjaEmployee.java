package com.company;

public class NinjaEmployee extends Employee implements NinjaInterface {

    private Ninja ninja = new Ninja();


    public NinjaEmployee(Ninja ninja) {
        this.ninja = ninja;
    }

    public NinjaEmployee(int id, String name, String address, Ninja ninja) {
        super(id, name, address);
        this.ninja = ninja;
    }

    public NinjaEmployee(int id, String name, String address) {
        super(id, name, address);
    }

    public NinjaEmployee() {
    }


    @Override
    public void ninjaFunc1() {
        ninja.ninjaFunc1();
    }

    @Override
    public void ninjaFunc2() {
        ninja.ninjaFunc2();
    }

    @Override
    public String toString() {
        return "Ninja Employee { " +
                "ninja = " + ninja.toString() +
                '}';
    }
}
