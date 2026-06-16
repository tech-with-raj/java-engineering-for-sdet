# Interface in Java

An interface is a blueprint of a class that defines a contract.

It is used to achieve:

- Abstraction
- Multiple Inheritance
- Loose Coupling
- Runtime Polymorphism

---

# Syntax

```java
interface Vehicle {

    void start();
}
```

Implementation:

```java
class Car implements Vehicle {

    @Override
    public void start() {

        System.out.println("Car Started");
    }
}
```

Usage:

```java
Vehicle v = new Car();

v.start();
```

---

# Characteristics of Interface

---

# 1. Before Java 8

Interfaces could only contain abstract methods.

```java
interface Vehicle {

    void start();

    void stop();
}
```

Equivalent to:

```java
public abstract void start();

public abstract void stop();
```

Methods had:

- No body
- Only declaration

---

## Example

```java
interface Payment {

    void processPayment();
}
```

Implementation:

```java
class CreditCardPayment implements Payment {

    @Override
    public void processPayment() {

        System.out.println("Payment Processed");
    }
}
```

---

# 2. Java 8 Features

Interfaces can contain concrete methods using the `default` keyword.

```java
interface Vehicle {

    default void display() {

        System.out.println("Default Method");
    }
}
```

Usage:

```java
class Car implements Vehicle {

}
```

```java
Car c = new Car();

c.display();
```

Output:

```text
Default Method
```

---

# Static Methods in Interface (Java 8)

```java
interface Utility {

    static void print() {

        System.out.println("Static Method");
    }
}
```

Calling:

```java
Utility.print();
```

---

# Why Default Methods Were Introduced?

To add new functionality without breaking existing implementations.

Example:

Suppose 100 classes implement:

```java
interface Vehicle {

    void start();
}
```

If we add:

```java
void stop();
```

All 100 classes must implement it.

Instead:

```java
default void stop() {

}
```

Existing classes continue to work.

---

# 3. Java 9 Features

Interfaces can contain private methods.

```java
interface Vehicle {

    private void helper() {

        System.out.println("Helper Method");
    }
}
```

Used internally by default methods.

---

## Example

```java
interface Calculator {

    default void add() {

        validate();
        System.out.println("Addition");
    }

    private void validate() {

        System.out.println("Validation");
    }
}
```

---

# Variables in Interface

Interfaces cannot have instance variables.

All variables are automatically:

- public
- static
- final

---

Example

```java
interface Constants {

    int MAX_SIZE = 100;
}
```

Equivalent to:

```java
public static final int MAX_SIZE = 100;
```

---

Usage:

```java
System.out.println(Constants.MAX_SIZE);
```

---

## Naming Convention

Constants are generally written in uppercase.

```java
int MAX_SIZE = 100;
int TIMEOUT = 30;
double PI = 3.14;
```

---

# No Constructors in Interface

Invalid:

```java
interface Vehicle {

    Vehicle() {

    }
}
```

Compile-time error.

Because interfaces cannot create objects.

---

# No Instance Variables

Invalid:

```java
interface Employee {

    String name;
}
```

Because every variable becomes:

```java
public static final
```

Therefore initialization is mandatory.

Correct:

```java
interface Employee {

    String COMPANY = "Google";
}
```

---

# Object Creation

Cannot create object of interface.

Invalid:

```java
Vehicle v = new Vehicle();
```

Compile-time error.

---

Correct:

```java
Vehicle v = new Car();
```

---

# Multiple Inheritance

Class can implement multiple interfaces.

```java
interface A {

    void display();
}
```

```java
interface B {

    void print();
}
```

```java
class Child implements A, B {

    @Override
    public void display() {

    }

    @Override
    public void print() {

    }
}
```

This provides multiple inheritance.

---

# Interface vs Abstract Class

| Feature | Interface | Abstract Class |
|----------|-----------|---------------|
| Object Creation | No | No |
| Constructors | No | Yes |
| Instance Variables | No | Yes |
| Multiple Inheritance | Yes | No |
| Abstract Methods | Yes | Yes |
| Concrete Methods | Java 8 onwards | Yes |
| Static Methods | Yes | Yes |
| Final Methods | No | Yes |

---

# Functional Interface

Contains exactly one abstract method.

Example:

```java
@FunctionalInterface
interface Calculator {

    int add(int a, int b);
}
```

Used in:

- Lambda Expressions
- Streams API

---

Example

```java
Calculator cal = (a, b) -> a + b;

System.out.println(cal.add(10, 20));
```

Output:

```text
30
```

---

# Marker Interface

Interface with no methods.

Example:

```java
Serializable
Cloneable
RandomAccess
```

Purpose:

Provide metadata to JVM.

---

# Default Method Example

```java
interface Vehicle {

    default void fuelType() {

        System.out.println("Petrol");
    }
}
```

Implementation:

```java
class Car implements Vehicle {

}
```

Usage:

```java
Car c = new Car();

c.fuelType();
```

---

# Diamond Problem

```java
interface A {

    default void display() {

        System.out.println("A");
    }
}
```

```java
interface B {

    default void display() {

        System.out.println("B");
    }
}
```

```java
class Child implements A, B {

}
```

Compile-time error.

Solution:

Override method.

```java
class Child implements A, B {

    @Override
    public void display() {

        A.super.display();
    }
}
```

---

# Real-world Example

## WebDriver Architecture

```java
WebDriver driver = new ChromeDriver();
```

Parent Interface:

```java
WebDriver
```

Implementation Class:

```java
ChromeDriver
```

Runtime polymorphism occurs.

---

## Comparator

```java
Comparator<Integer>
```

Used for custom sorting.

---

## Runnable

```java
Runnable
```

Used for multithreading.

---

## Comparable

```java
Comparable
```

Used for natural ordering.

---

## Collection Framework

Interfaces:

- List
- Set
- Queue
- Map

Implementations:

- ArrayList
- LinkedList
- HashSet
- TreeSet

---

# Interview Questions

## Q1. Can an interface have concrete methods?

Yes.

From Java 8 onwards using:

```java
default
```

and

```java
static
```

methods.

---

## Q2. Can an interface have private methods?

Yes.

From Java 9 onwards.

---

## Q3. Can an interface have constructors?

No.

Interfaces cannot be instantiated.

---

## Q4. Can an interface have instance variables?

No.

All variables are:

```java
public static final
```

---

## Q5. Can we create objects of interface?

No.

```java
Vehicle v = new Vehicle();
```

Invalid.

---

## Q6. Can a class implement multiple interfaces?

Yes.

```java
class Child implements A, B {

}
```

---

## Q7. Can interfaces extend interfaces?

Yes.

```java
interface A {

}

interface B extends A {

}
```

---

## Q8. Can an interface extend multiple interfaces?

Yes.

```java
interface A {

}

interface B {

}

interface C extends A, B {

}
```

---

# Interface Keywords Summary

| Member | Allowed |
|----------|---------|
| Abstract Method | ✅ |
| Default Method | ✅ Java 8 |
| Static Method | ✅ Java 8 |
| Private Method | ✅ Java 9 |
| Instance Variable | ❌ |
| Constructor | ❌ |
| Object Creation | ❌ |
| Multiple Inheritance | ✅ |
| Runtime Polymorphism | ✅ |

---

# Key Takeaways

- Interface is a blueprint of a class.
- Interfaces provide abstraction.
- Before Java 8, interfaces contained only abstract methods.
- Java 8 introduced default and static methods.
- Java 9 introduced private methods.
- All interface variables are public static final.
- Interfaces do not have constructors.
- Interfaces support multiple inheritance.
- Objects cannot be created directly.
- Runtime polymorphism is achieved through interfaces.
- Selenium WebDriver is one of the best examples of interface usage.