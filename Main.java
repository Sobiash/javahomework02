package com.company;

public class Main {

    public static void main(String[] args) {
        NinjaEmployee ninja1 = new NinjaEmployee();
        ninja1.ninjaFunc1();
        ninja1.ninjaFunc2();

        NinjaEmployee ninja2 = new NinjaEmployee(1, "Sumbal", "Pakistan");
        ninja2.ninjaFunc1();
        ninja2.ninjaFunc2();
        System.out.println(ninja2.getId());
        System.out.println(ninja2.getName());
        System.out.println(ninja2.getAddress());

        Ninja ninja3 = new Ninja();
        NinjaEmployee ninjaTest3 = new NinjaEmployee(1, "Nagi", "India", ninja3);
        ninjaTest3.ninjaFunc1();
        ninjaTest3.ninjaFunc2();
        System.out.println(ninjaTest3.getId());
        System.out.println(ninjaTest3.getName());
        System.out.println(ninjaTest3.getAddress());
        ninjaTest3.setName("Alex");
        ninjaTest3.setAddress("US");


        System.out.println("After changing: ");
        System.out.println(ninjaTest3.getName());
        System.out.println(ninjaTest3.getAddress());
        ninja3.moveTheNinja();

        NinjaEmployee ninjaTest4 = new NinjaEmployee(ninja3);


    }
}
