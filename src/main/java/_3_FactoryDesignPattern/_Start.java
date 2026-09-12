package _3_FactoryDesignPattern;

public class _Start {

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("           START                ");
        System.out.println("================================");

        // Get current package dynamically
        Package pkg = _Start.class.getPackage();
        if (pkg != null) {
            System.out.println("Current Module: " + pkg.getName());
        } else {
            System.out.println("No package defined.");
        }
    }
}
