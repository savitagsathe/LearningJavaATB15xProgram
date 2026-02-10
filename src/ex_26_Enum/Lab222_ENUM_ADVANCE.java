package ex_26_Enum;

public class Lab222_ENUM_ADVANCE {
    static void main(String[] args) {
        double earthGravity=planet.EARTH.surfaceGravity();
        System.out.println(earthGravity);
        double mercuryGravity=planet.MERCURY.surfaceGravity();
        System.out.println(mercuryGravity);
        System.out.println(planet.valueOf("EARTH").getMass());
        System.out.println(planet.EARTH.getMass());
    }
}
enum planet{
    MERCURY(3.303e23, 2.4397e6),
    VENUS(4.869e24, 6.0518e6),
    EARTH(5.976e24, 6.37814e6),
    MARS(6.421e23, 3.3972e6);

    private final double mass;//in kg
    private final double radius;//in meters

    planet(double mass,double radius){
        this.mass=mass;
        this.radius=radius;
    }

    public double getMass(){
        return mass;
    }

    public double getRadius() {
        return radius;
    }
    public double surfaceGravity(){
        final double g=6.67300E-11;
        return g * mass / (radius * radius);
    }
}