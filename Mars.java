public class Mars extends Planet implements PlanetAcceleration {
    double m = 6.3345;
    double r = 3.488;

    public Mars(double m, double r) {
    }

    double g;

    @Override
    public double acceleration(double m, double r) {
        this.m = m;
        this.r = r;
        return g;
    }
}


