public class Neptune extends Planet implements PlanetAcceleration {
    double m = 1015.92;
    double r = 24750;

    public Neptune(double m, double r) {
    }

    double g;

    @Override
    public double acceleration(double m, double r) {
        this.m = m;
        this.r = r;
        return g;
    }
}


