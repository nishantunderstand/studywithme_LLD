package _6_SingletonDesignPattern_IMP;

/**
 * Created : 2026-08-05 00:31:23
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 * @see <a href="https://javaconceptoftheday.com/java-singleton-design-pattern-implementation-with-examples/">Singleton Design Pattern – JavaConceptOfTheDay</a>
 */
public class A_EagerInstantiated_Singleton {

    private static final A_EagerInstantiated_Singleton instance = new A_EagerInstantiated_Singleton();

    private A_EagerInstantiated_Singleton(){}

    private static A_EagerInstantiated_Singleton getInstance(){
        return instance;
    }
}
