public class Jupiter extends Planet implements PlanetAcceleration {
    double m = 18766.4328;
    double r = 71300;

    public Jupiter(double m, double r) {
    }

    double g;

    @Override
    public double acceleration(double m, double r) {
        this.m = m;
        this.r = r;
        return g;
    }
}


