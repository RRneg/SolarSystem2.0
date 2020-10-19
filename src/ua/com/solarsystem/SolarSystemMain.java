package ua.com.solarsystem;

import ua.com.solarsystem.io.PlanetReporter;
import ua.com.solarsystem.io.PlanetScanner;
import ua.com.solarsystem.planet.*;

public class SolarSystemMain {


    public static void main(String[] args) {
        int ch;
        double g = 0;
        double[] m = {48.1068, 59.76, 6.3345, 3.2868, 1015.92, 0.1195, 5618.0376, 860.544, 18766.4328};
        //массив масс планет
        double[] r = {6.052, 6.378, 3.488, 2.439, 24750, 2, 60100, 26500, 71300};
        //массив радиусов планет
        PlanetScanner planetScanner = new PlanetScanner();
        ch = planetScanner.planetScaner();
        System.out.println(ch);

        switch (ch) {
            case (1):
                Venus venus = new Venus();
                g = venus.acceleration(m[ch - 1], r[ch - 1]);
                break;
            case (2):
                Earth earth = new Earth();
                g = earth.acceleration(m[ch - 1], r[ch - 1]);
                break;
            case (3):
                Mars mars = new Mars();
                g = mars.acceleration(m[ch - 1], r[ch - 1]);
                break;
            case (4):
                Mercury mercury = new Mercury();
                g = mercury.acceleration(m[ch - 1], r[ch - 1]);
                break;
            case (5):
                Neptune neptune = new Neptune();
                g = neptune.acceleration(m[ch - 1], r[ch - 1]);
                break;
            case (6):
                Pluto pluto = new Pluto();
                g = pluto.acceleration(m[ch - 1], r[ch - 1]);
                break;
            case (7):
                Saturn saturn = new Saturn();
                g = saturn.acceleration(m[ch - 1], r[ch - 1]);
                break;
            case (8):
                Uranus uranus = new Uranus();
                g = uranus.acceleration(m[ch - 1], r[ch - 1]);
                break;
            case (9):
                Jupiter jupiter = new Jupiter();
                g = jupiter.acceleration(m[ch - 1], r[ch - 1]);
                break;


        }

        PlanetReporter planetReporter = new PlanetReporter();

        planetReporter.planetReporter(g);


    }
}
