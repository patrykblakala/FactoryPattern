package com.sparta;

public class Starter {
    public static void start() {
        SpartanFactory spartanFactory = new SpartanFactory();
        Spartan spartan1 = spartanFactory.createSpartan("Java Developer");
        Spartan spartan2 = spartanFactory.createSpartan("Java SDET");
        Spartan spartan3 = spartanFactory.createSpartan("C# Developer");
        Spartan spartan4 = spartanFactory.createSpartan("C# SDET");
        Spartan spartan5 = spartanFactory.createSpartan("Data Engineer");
        Spartan spartan6 = spartanFactory.createSpartan("Business Analyst");
        Spartan spartan7 = spartanFactory.createSpartan("DevOps Engineer");

        spartan1.work();
        spartan2.work();
        spartan3.work();
        spartan4.work();
        spartan5.work();
        spartan6.work();
        spartan7.work();
    }
}
