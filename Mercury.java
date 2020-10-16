public class Mercury extends Planet implements PlanetAcceleration {
    double m = 3.2868;
    double r = 2.439;

    public Mercury(double m, double r) {
    }

    double g;

    @Override
    public double acceleration(double m, double r) {
        this.m = m;
        this.r = r;
        return g;
    }
}


