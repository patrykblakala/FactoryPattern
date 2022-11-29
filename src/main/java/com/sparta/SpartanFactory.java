package com.sparta;

public class SpartanFactory {
    public Spartan createSpartan(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch(channel)
        {
            case "Java Developer":
                return new JavaDeveloper();
            case "Java SDET":
                return new JavaSdet();
            case "C# Developer":
                return new CSharpDeveloper();
            case "C# SDET":
                return new CSharpSdet();
            case "Data Engineer":
                return new DataEngineer();
            case "Business Analyst":
                return new BusinessAnalyst();
            case "DevOps Engineer":
                return new DevOpsEngineer();
            default:
                throw new IllegalArgumentException("Unknown Channel");
        }

    }
}
