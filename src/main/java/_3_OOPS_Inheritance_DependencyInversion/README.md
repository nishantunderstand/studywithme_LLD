Let's use the **same `Car` + `Engine` example** for all three.

## 1. IS-A → Inheritance

```java
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
}
```

Relationship:

```text
Car IS-A Vehicle
```

Because:

```java
class Car extends Vehicle
```

---

## 2. HAS-A → Composition / Aggregation

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

Because `Car` contains an `Engine`.

---

## 3. USES-A → Dependency

Instead of keeping the `Engine` as a field:

```java
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

`Car` temporarily needs `Engine` to perform an operation.

---

# All Three Together

```java
// IS-A
class Vehicle {
}

class Car extends Vehicle {
    // Car IS-A Vehicle
}
```

```java
// HAS-A
class Engine {
}

class Car {
    private Engine engine = new Engine();

    // Car HAS-A Engine
}
```

```java
// USES-A
class Car {

    void start(Engine engine) {
        engine.start();

        // Car USES-A Engine
    }
}
```

### ⭐ Easy Memory Trick

```text
IS-A   → extends / implements
         Car IS-A Vehicle

HAS-A  → field/member variable
         Car HAS-A Engine

USES-A → method parameter / local usage
         Car USES-A Engine
```

**One important nuance:** In Java, “USES-A” isn't an official language construct or formal UML relationship name in the same way `IS-A` and `HAS-A` are commonly taught. It is a useful interview shorthand for a **dependency relationship**.
