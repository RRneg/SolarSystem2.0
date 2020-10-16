public class Pluto extends Planet implements PlanetAcceleration {
    double m = 0.1195;
    double r = 2;

    public Pluto(double m, double r) {
    }

    double g;

    @Override
    public double acceleration(double m, double r) {
        this.m = m;
        this.r = r;
        return g;
    }
}


