public class Venus extends Planet implements PlanetAcceleration {
    double m = 48.1068;
    double r = 6.052;

    public Venus(double m, double r) {
    this.m = m;
    this.r = r;
    }

    double g;

    @Override
    public double acceleration(double m, double r) {
        return g;
    }
}


