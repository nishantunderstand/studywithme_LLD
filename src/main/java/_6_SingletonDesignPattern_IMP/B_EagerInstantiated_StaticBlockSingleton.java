package _6_SingletonDesignPattern_IMP;

/**
 * Created : 2026-08-05 00:36:12
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 * @see <a href="https://javaconceptoftheday.com/java-singleton-design-pattern-implementation-with-examples/">Singleton Design Pattern – JavaConceptOfTheDay</a>
 */
public class B_EagerInstantiated_StaticBlockSingleton {

    private static final B_EagerInstantiated_StaticBlockSingleton instance;

    B_EagerInstantiated_StaticBlockSingleton(){}

    static{
        try{
            instance = new B_EagerInstantiated_StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception Occured in creating Singleton instance");
        }
    }

    public static B_EagerInstantiated_StaticBlockSingleton getInstance(){
        return  instance;
    }
}

