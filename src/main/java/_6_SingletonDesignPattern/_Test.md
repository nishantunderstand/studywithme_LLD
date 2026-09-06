Singleton : You have a single insance of object thrrought the object


Eager
Eager 
Eager Static Block
Lazy 
Lazy Initalized 
lazy Synchrnozied
Lazy Double Checking lock


----
Eager
public class Singleton{
private final Singleton INSTANCE = new Singleton();
private Singleton(){}
public static Singleton getInstance(){
return INSTANCE;
}
}


public class Singleton{
private final Singleton INSTANCE;
static{
    try(){
        INSTANCE = new Singleton();
    }
    catch(Exception e){
        System.out.println(e.stacktrace());
    }
}
private Singleton(){}
public static Singleton getInstance(){
return INSTANCE;
}
}




---

Lazy


public class Singleton{
private static Singleton INSTANCE;
private Singleton(){}
public static Singleton getInstance(){
    INSTANCE = new Singleton();
}
}



public class Singleton{
private static Singleton INSTANCE;
private Singleton(){}
public synchronized static Singleton getInstance(){
if(INSTANCE==null){
INSTANCE = new Singleton();
}
return INSTANCE;
}



public class Singleton{
private static volatile Singleton INSTANCE;
private Singleton(){}
public static Singleton getInstance(){
if(INSTANCE==null){
    synchronized(Singleton.class){
        if(INSTANCE==null){
        INSTANCE = new Singleton();
}
}
}
return INSTANCE;
}


