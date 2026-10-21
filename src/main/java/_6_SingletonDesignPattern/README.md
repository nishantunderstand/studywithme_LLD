package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-05 00:31:23
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 * @see <a href="https://javaconceptoftheday.com/java-singleton-design-pattern-implementation-with-examples/">Singleton Design Pattern – JavaConceptOfTheDay</a>
 */


---

public class _SingletonTemplate {

Constructor : private Default

Field :
1. private static ClassType : 90 % of Time 
2. private static final ClassType 
3. volatile : When Thread Saftey

Static getInstance : for Instance Retrieval

<---  Standard Approach --->
1. a) Hiding the constructors
2. b) private static variable instance of same type as of class
3. c) Providing public static method getInstance()


Types 
1. Eager
2. Eager Static 
3. Lazy
4. Lazy Thread Safe
5. Lazy Double Checking Lock
6. Bill Pugh
7. Enum Singleton

---

How to safe from ?
1. Serialization
2. Reflection 
