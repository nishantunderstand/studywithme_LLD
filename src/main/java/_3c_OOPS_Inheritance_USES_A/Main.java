package _3c_OOPS_Inheritance_USES_A;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Driver d1 = new Driver();
        d1.drive(c1);
    }
}

/**
 * Difference B/W HAS-A vs USES-A
 * Driver Doesn't Own the Car, He Just Uses it.
 * How Different from USES-A, Here Car Own the Engine.
 */