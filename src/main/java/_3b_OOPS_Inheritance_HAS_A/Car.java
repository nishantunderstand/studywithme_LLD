package _3b_OOPS_Inheritance_HAS_A;

public class Car {
    private Engine engine = new Engine();

    void start(){
        engine.start();
        System.out.println("Car is Running");
    }
}


/**
 * How Different from USES-A, Here Car Own the Engine
 */