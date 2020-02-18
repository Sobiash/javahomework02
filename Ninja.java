package com.company;

public class Ninja implements NinjaInterface {
    public Ninja() {
    }

    public void moveTheNinja() {
        System.out.println("Ninja chnaged");

    }


    public void ninjaFunc1() {
        System.out.println("This is first ninja ");

    }


    public void ninjaFunc2() {
        System.out.println("This is second ninja ");


    }

    @Override
    public String toString() {
        return "Ninja{} ";
    }
}
