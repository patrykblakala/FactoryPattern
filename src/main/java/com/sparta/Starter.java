package com.sparta;

public class Starter {
    public static void start() {
        SpartanFactory spartanFactory = new SpartanFactory();
        Spartan spartan1 = new spartanFactory.createSpartan("Java Developer");
        Spartan spartan2 = new spartanFactory.createSpartan("Java SDET");
        Spartan spartan3 = new spartanFactory.createSpartan("C# Developer");
        Spartan spartan4 = new spartanFactory.createSpartan("C# SDET");
        Spartan spartan5 = new spartanFactory.createSpartan("Data Engineer");
        Spartan spartan6 = new spartanFactory.createSpartan("Business Analyst");
        Spartan spartan7 = new spartanFactory.createSpartan("DevOps Engineer");

        System.out.println(spartan1);
        System.out.println(spartan2);
        System.out.println(spartan3);
        System.out.println(spartan4);
        System.out.println(spartan5);
        System.out.println(spartan6);
        System.out.println(spartan7);
    }
}
