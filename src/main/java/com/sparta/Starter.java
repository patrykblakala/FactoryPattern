package com.sparta;

public class Starter {
    public static void start() {
        SpartanFactory spartanFactory = new SpartanFactory();
        Spartan spartan1 = new spartanFactory.getSpartan("Java Developer");
        Spartan spartan2 = new spartanFactory.getSpartan("Java SDET");
        Spartan spartan3 = new spartanFactory.getSpartan("C# Developer");
        Spartan spartan4 = new spartanFactory.getSpartan("C# SDET");
        Spartan spartan5 = new spartanFactory.getSpartan("Data Engineer");
        Spartan spartan6 = new spartanFactory.getSpartan("Business Analyst");
        Spartan spartan7 = new spartanFactory.getSpartan("DevOps Engineer");

        System.out.println(spartan1);
        System.out.println(spartan2);
        System.out.println(spartan3);
        System.out.println(spartan4);
        System.out.println(spartan5);
        System.out.println(spartan6);
        System.out.println(spartan7);
    }
}
