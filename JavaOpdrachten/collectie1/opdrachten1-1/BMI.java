public class BMI
{
    // lengte in centimeter
    private int lengte;
    // gewicht in kg
    private double massa;

    public BMI() {
        lengte = 170;
        massa = 70;
    }

    public BMI(int len,  double mass) {
        setLengte(len);
        setMassa(mass);
    }

    public int getLengte() {
        return lengte;
    }  

    public double getMassa() {
        return massa;
    }

    public void setLengte(int len) {
        if (lengte>0) {
            lengte = len;
        }
    }

    public void setMassa(double mass) {
        if (mass>0) {
            massa = mass;
        }
    }

    public double getBMI() {
        return 100 * 100 * massa / lengte / lengte;
    }

    public void printDetails() {
        System.out.println("Je lengte is " + lengte + " centimeter");
        System.out.println("Je gewicht is " + massa + " kilogram");
        System.out.println("Je BMI is " + getBMI());
    }
}
