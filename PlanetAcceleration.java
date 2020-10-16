interface PlanetAcceleration {

    default double acceleration(double m, double r) {
        double g;
        AccelerationUtil accelerationUtil = new AccelerationUtil();
        g = accelerationUtil.freeFallAcceleration(m, r);
        return g;
    }
}
