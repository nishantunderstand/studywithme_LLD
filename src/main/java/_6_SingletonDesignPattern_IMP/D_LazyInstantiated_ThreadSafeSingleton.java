package _6_SingletonDesignPattern_IMP;

/**
 * Created : 2026-08-05 00:26:14
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 * @see <a href="https://javaconceptoftheday.com/java-singleton-design-pattern-implementation-with-examples/">Singleton Design Pattern – JavaConceptOfTheDay</a>
 */
public class D_LazyInstantiated_ThreadSafeSingleton {

    private static D_LazyInstantiated_ThreadSafeSingleton instance;

    private D_LazyInstantiated_ThreadSafeSingleton(){}

    public static synchronized D_LazyInstantiated_ThreadSafeSingleton getInstance(){
        if(instance==null){
            instance = new D_LazyInstantiated_ThreadSafeSingleton();
        }
        return instance;
    }

}
