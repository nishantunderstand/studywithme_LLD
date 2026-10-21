Sure. Here is the **same `Vehicle → Car → Engine` example with `main()`**, showing all three relationships clearly.

## 1. IS-A → Inheritance

```java
class Vehicle {

    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}
```

Relationship:

```text
Car IS-A Vehicle
```

### Main

```java
public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.move();   // inherited from Vehicle
        car.drive();  // Car's own method
    }
}
```

---

# 2. HAS-A → Composition

```java
class Engine {

    void start() {
        System.out.println("Engine Started");
    }
}

class Car {

    private Engine engine = new Engine();

    void startCar() {
        engine.start();
    }
}
```

Relationship:

```text
Car HAS-A Engine
```

Because `Car` **contains** an `Engine`.

### Main

```java
public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.startCar();
    }
}
```

Output:

```text
Engine Started
```

---

# 3. USES-A → Dependency

```java
class Engine {

    void start() {
        System.out.println("Engine Started");
    }
}

class Car {

    void startCar(Engine engine) {
        engine.start();
    }
}
```

Relationship:

```text
Car USES-A Engine
```

Here `Engine` is supplied to the method.

### Main

```java
public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Engine engine = new Engine();

        car.startCar(engine);
    }
}
```

Output:

```text
Engine Started
```

---

# ⭐ All Three Together

| Relationship | Code                      | Meaning                    |
| ------------ | ------------------------- | -------------------------- |
| **IS-A**     | `Car extends Vehicle`     | Car is a Vehicle           |
| **HAS-A**    | `Car { Engine engine; }`  | Car contains/has an Engine |
| **USES-A**   | `startCar(Engine engine)` | Car uses Engine            |

### Easy Memory Trick

```text
IS-A
↓
Inheritance
Car IS-A Vehicle

HAS-A
↓
Field / Composition / Aggregation
Car HAS-A Engine

USES-A
↓
Dependency
Car USES-A Engine
```

And this connects directly to your SOLID preparation:

```text
USES-A
   ↓
Dependency
   ↓
Dependency Injection
   ↓
Dependency Inversion Principle
```
