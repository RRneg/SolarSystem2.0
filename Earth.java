package ua.com.solarsystem.planet;

import ua.com.solarsystem.core.PlanetAcceleration;

public class Earth implements PlanetAcceleration {

    double g;


    public double acceleration(double m, double r) {
        return g;
    }
}





