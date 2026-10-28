package _6_SingletonDesignPattern_IMP;

/**
 * Created : 2026-08-05 00:32:59
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 * @see <a href="https://javaconceptoftheday.com/java-singleton-design-pattern-implementation-with-examples/">Singleton Design Pattern – JavaConceptOfTheDay</a>
 */
public class F_BillPughSingleton {
    private F_BillPughSingleton(){}

    private static class SingletonHelper{
        private static final F_BillPughSingleton INSTANCE = new F_BillPughSingleton();
    }

    private static F_BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
