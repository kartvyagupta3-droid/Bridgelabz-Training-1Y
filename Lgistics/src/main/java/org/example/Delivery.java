package org.example;

public class Delivery extends CheckPoints{

        Delivery(String id, String location, double distance, int exp, int act) {
            super(id, location, distance, exp, act);
        }

        double calculatePenalty() {
            if (isDelayed()) {
                return (actualTime - expectedTime) * 2;
            }
            return 0;
        }

        String getType() {
            return "Delivery";
        }
    }

