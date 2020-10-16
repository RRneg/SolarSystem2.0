public class Saturn extends Planet implements PlanetAcceleration {
    double m = 59.76;
    double r = 6.378;

    public Saturn(double m, double r) {
    }

    double g;

    @Override
    public double acceleration(double m, double r) {
        this.m = m;
        this.r = r;
        return g;
    }
}


