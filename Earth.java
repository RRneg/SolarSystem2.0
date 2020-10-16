public class Earth extends Planet implements PlanetAcceleration {
    double m = 59.76;
    double r = 6.378;
    int choice;

    public int getChoice() {
        return choice;
    }


    public Earth(double m, double r) {
    }

    double g;


    @Override
    public double acceleration(double m, double r) {
        this.m = m;
        this.r = r;
        return g;
    }
}





