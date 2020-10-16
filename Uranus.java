public class Uranus extends Planet implements PlanetAcceleration {
    double m = 860.544;
    double r = 26500;

    public Uranus(double m, double r) {
    }

    double g;

    @Override
    public double acceleration(double m, double r) {
        this.m = m;
        this.r = r;
        return g;
    }
}


