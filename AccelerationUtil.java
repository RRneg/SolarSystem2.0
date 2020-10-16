public final class AccelerationUtil {
    double m;
    double r;

    public AccelerationUtil() {
    }

    static double freeFallAcceleration(double m, double r) {
        double g;
        final double gg = 6.67;
        g = (gg * m) / (r * r);
        return (g);
    }
}
