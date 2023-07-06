package org.example;

public class FireAlarm {

    public int Sum(int v1, int v2) {
        int finalsum = v1 + v2;
        System.out.println("The final sum of the given values is " + finalsum);
        return finalsum;
    }

    public void checkCO2(int storage) {
        System.out.println("skontrolujCO2 - poschodie: " + storage);
    }

    public void switchOnSpeaker(int storage) {
        System.out.println("zapniReproduktor - poschodie: " + storage);
    }


}
