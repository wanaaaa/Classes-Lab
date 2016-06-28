package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StopLight red = new StopLight("red");

        if (red.isGreen()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        Car carOne = new Car("gray", "jeep", 100);

        for (int i = 0; i < 30; i++) {
            if (red.isGreen()) {
                carOne.go();
            } else if (red.isRed()) {
                carOne.stop();
            } else if (red.isYellow()) {
                carOne.slow();
            }
        }
    }
}
