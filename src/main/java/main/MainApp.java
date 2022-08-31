package main;

import airConnection.FlightLeg;

public class MainApp {
    public static void main(String[] args) {

        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles")
                .price(4)
                .build();

        System.out.println(leg);

    }
}
