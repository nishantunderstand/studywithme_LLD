package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-05 00:23:20
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 * @see <a href="https://javaconceptoftheday.com/java-singleton-design-pattern-implementation-with-examples/">Singleton Design Pattern – JavaConceptOfTheDay</a>
 */
public class C_LazyInstantiated_Singleton {

    private static C_LazyInstantiated_Singleton instance;

    private C_LazyInstantiated_Singleton(){}

    public static C_LazyInstantiated_Singleton getInstance(){
        if(instance==null){
            instance = new C_LazyInstantiated_Singleton();
        }
        return instance;
    }

    public static void main(String[] args){
        C_LazyInstantiated_Singleton ob1 = C_LazyInstantiated_Singleton.getInstance();
        C_LazyInstantiated_Singleton ob2 = C_LazyInstantiated_Singleton.getInstance();
        System.out.println(ob1 == ob2);
    }
}


// Why final is removed here ?
// Final is declared Exactly once at the time of declaration
// Yes, correct. In Java, a final variable must be initialized exactly once before it is used.
