package _6_SingletonDesignPattern_IMP;

/**
 * Created : 2026-08-05 00:28:21
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 * @see <a href="https://javaconceptoftheday.com/java-singleton-design-pattern-implementation-with-examples/">Singleton Design Pattern – JavaConceptOfTheDay</a>
 */
public class E_LazyInstantiated_DoubleCheckingSingleton {

    private static volatile E_LazyInstantiated_DoubleCheckingSingleton instance;

    private E_LazyInstantiated_DoubleCheckingSingleton(){}

    public static E_LazyInstantiated_DoubleCheckingSingleton getInstance(){
        if(instance==null){ //<--
            synchronized(E_LazyInstantiated_DoubleCheckingSingleton.class){  //<--
                if(instance==null){ //<--
                    instance = new E_LazyInstantiated_DoubleCheckingSingleton();
                }
            }
        }
        return instance;
    }
}


/**
 * Remaining Problems
 *
 * Even this Singleton can be broken using:
 *
 * Reflection
 * Serialization
 * Cloning
 */


// Why static
// Why Volatile
// Why private constructor
// Why Synchronized
// How does volatile establish happens-before?