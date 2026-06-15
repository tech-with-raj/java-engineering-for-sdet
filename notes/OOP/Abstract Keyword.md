# Abstract Keyword in Java

The `abstract` keyword is used to achieve abstraction.

It can be applied to:

1. Classes
2. Methods

---

# What is Abstraction?

Abstraction means hiding implementation details and exposing only the required behavior.

Example:

When driving a car, you use:

- Steering wheel
- Brake
- Accelerator

You do not need to know how the engine internally works.

Java abstraction follows the same principle.

---

# 1. Abstract Class

## Definition

An abstract class is a class that is declared using the `abstract` keyword.

```java
abstract class Parent {

}
```

---

## Characteristics

- Cannot create objects.
- Can contain abstract methods.
- Can contain normal methods.
- Can contain constructors.
- Can contain variables.
- Can contain static and final methods.

---

## Example

```java
abstract class Animal {

}
```

Invalid:

```java
Animal a = new Animal();
```

Compile-time error.

Because abstract classes cannot be instantiated.

---

# Object Creation Through Child Class

```java
abstract class Parent {

}

class Child extends Parent {

}
```

Valid:

```java
Parent p = new Child();
```

This is called upcasting.

---

# Why Can't We Create Objects of Abstract Class?

An abstract class is incomplete.

Some behavior is intentionally left for child classes to implement.

---

# 2. Abstract Method

## Definition

An abstract method has no body.

Syntax:

```java
abstract void display();
```

or

```java
public abstract void display();
```

---

## Example

```java
abstract class Parent {

    abstract void display();
}
```

Notice:

No curly braces.

```java
abstract void display();
```

---

# Child Class Must Override Abstract Methods

```java
abstract class Parent {

    abstract void display();
}

class Child extends Parent {

    @Override
    void display() {

        System.out.println("Display Method");
    }
}
```

---

# Method Overriding Happens

```java
Parent p = new Child();

p.display();
```

Output:

```text
Display Method
```

Runtime polymorphism occurs.

---

# Real-world Example

```java
abstract class Shape {

    abstract double area();
}
```

Child classes:

```java
class Circle extends Shape {

    @Override
    double area() {

        return 3.14 * 5 * 5;
    }
}
```

```java
class Rectangle extends Shape {

    @Override
    double area() {

        return 10 * 20;
    }
}
```

Usage:

```java
Shape shape = new Circle();

System.out.println(shape.area());
```

---

# Abstract Class Can Have Normal Methods

```java
abstract class Vehicle {

    abstract void start();

    void stop() {

        System.out.println("Vehicle stopped");
    }
}
```

Child class:

```java
class Car extends Vehicle {

    @Override
    void start() {

        System.out.println("Car started");
    }
}
```

---

# Abstract Class Can Have Constructors

```java
abstract class Parent {

    Parent() {

        System.out.println("Parent Constructor");
    }
}
```

Child:

```java
class Child extends Parent {

}
```

Object creation:

```java
Child c = new Child();
```

Output:

```text
Parent Constructor
```

Child automatically calls parent constructor using:

```java
super();
```

which is inserted by the compiler.

---

# Abstract Class Can Have Variables

```java
abstract class Employee {

    String company = "Google";
}
```

Child class:

```java
class Developer extends Employee {

}
```

Usage:

```java
Developer d = new Developer();

System.out.println(d.company);
```

---

# Abstract Class Can Have Static Methods

```java
abstract class Utility {

    static void display() {

        System.out.println("Static Method");
    }
}
```

Calling:

```java
Utility.display();
```

---

# Abstract Class Can Have Final Methods

```java
abstract class Parent {

    final void print() {

        System.out.println("Final Method");
    }
}
```

Child class cannot override it.

---

# Abstract Method Cannot Be Final

Invalid:

```java
abstract final void display();
```

Compile-time error.

Reason:

- Abstract method requires overriding.
- Final method restricts overriding.

Both are opposite concepts.

---

# Abstract Method Cannot Be Static

Invalid:

```java
abstract static void display();
```

Compile-time error.

Reason:

Static methods belong to class and cannot participate in method overriding.

Abstract methods require overriding.

---

# Abstract Method Cannot Be Private

Invalid:

```java
private abstract void display();
```

Compile-time error.

Reason:

Private methods are not visible in child classes.

Therefore overriding is impossible.

---

# Multiple Abstract Methods

```java
abstract class Payment {

    abstract void validate();

    abstract void process();

    abstract void generateReceipt();
}
```

Child:

```java
class CreditCardPayment extends Payment {

    @Override
    void validate() {

    }

    @Override
    void process() {

    }

    @Override
    void generateReceipt() {

    }
}
```

---

# If Child Does Not Override All Methods

Example:

```java
abstract class Parent {

    abstract void display();
}
```

```java
class Child extends Parent {

}
```

Compile-time error.

---

Alternative:

Make child abstract.

```java
abstract class Child extends Parent {

}
```

---

# Abstract Class and Inheritance

```java
abstract class Parent {

    abstract void display();
}
```

```java
class Child extends Parent {

    @Override
    void display() {

        System.out.println("Child Display");
    }
}
```

Inheritance enables abstraction.

---

# Abstract Class vs Concrete Class

| Feature | Abstract Class | Normal Class |
|-----------|---------------|--------------|
| Object Creation | Not Allowed | Allowed |
| Abstract Methods | Allowed | Not Allowed |
| Constructors | Allowed | Allowed |
| Variables | Allowed | Allowed |
| Static Methods | Allowed | Allowed |
| Final Methods | Allowed | Allowed |

---

# Abstract Class vs Interface

| Abstract Class | Interface |
|----------------|-----------|
| Supports constructors | No constructors |
| Supports instance variables | Only constants |
| Single inheritance | Multiple inheritance |
| Can contain concrete methods | Mostly abstract methods |
| Used for partial abstraction | Used for complete abstraction |

---

# Real-world Examples

## Shape Framework

```java
abstract class Shape {

    abstract double area();
}
```

Children:

- Circle
- Rectangle
- Triangle

---

## Payment Gateway

```java
abstract class Payment {

    abstract void processPayment();
}
```

Children:

- CreditCardPayment
- DebitCardPayment
- UpiPayment

---

## WebDriver Architecture

```java
WebDriver driver = new ChromeDriver();
```

Parent reference:

```java
WebDriver
```

Child object:

```java
ChromeDriver
```

Runtime polymorphism works because of abstraction and method overriding.

---

# Interview Questions

## Q1. Can we create an object of an abstract class?

No.

```java
Parent p = new Parent();
```

Compile-time error.

---

## Q2. Can abstract classes have constructors?

Yes.

Constructors execute when child objects are created.

---

## Q3. Can abstract classes have static methods?

Yes.

```java
abstract class Parent {

    static void display() {

    }
}
```

---

## Q4. Can abstract classes have final methods?

Yes.

Final methods cannot be overridden.

---

## Q5. Can abstract methods be static?

No.

```java
abstract static void display();
```

Invalid.

---

## Q6. Can abstract methods be final?

No.

```java
abstract final void display();
```

Invalid.

---

## Q7. Can abstract methods be private?

No.

Because child classes cannot override private methods.

---

## Q8. Can an abstract class have no abstract methods?

Yes.

Example:

```java
abstract class Parent {

    void display() {

        System.out.println("Normal Method");
    }
}
```

Still, object creation is not allowed.

---

# Key Takeaways

- `abstract` can be applied to classes and methods.
- Abstract classes cannot be instantiated.
- Abstract methods have no body.
- Child classes must override abstract methods.
- Method overriding enables runtime polymorphism.
- Abstract classes can contain constructors, variables, static methods and final methods.
- Abstract methods cannot be:
  - final
  - static
  - private
- Abstract and final are opposite concepts.
- Abstract classes provide partial abstraction.
- Inheritance and method overriding are the foundation of abstraction.