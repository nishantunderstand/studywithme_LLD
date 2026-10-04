package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-15 12:16:00
 */


public class Main {
    public static void main(String[] args) {
        G_EnumSingleton obj1 = G_EnumSingleton.INSTANCE;
        G_EnumSingleton obj2 = G_EnumSingleton.INSTANCE;
        System.out.println(obj1 == obj2); // true
        obj1.doSomething();

        System.out.println("====== Thursday, August 20, 2026 8:11:14 PM ======\n");
        B_EagerInstantiated_StaticBlockSingleton instance1 = B_EagerInstantiated_StaticBlockSingleton.getInstance();
        B_EagerInstantiated_StaticBlockSingleton instance2 = B_EagerInstantiated_StaticBlockSingleton.getInstance();
        System.out.println(instance1 == instance2);

    }
}
