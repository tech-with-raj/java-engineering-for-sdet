# Java Inheritance 

## What is Inheritance?

Inheritance is an OOP (Object-Oriented Programming) concept that allows one class to acquire the properties and behaviors of another class.

It helps in:

- Code Reusability
- Better Maintainability
- Establishing Parent-Child Relationships
- Reducing Duplicate Code

---

## Inheritance Relationship

### Parent Class (Super Class)

A class whose properties and methods are inherited by another class.

```java
class Parent {

    int age = 50;

    void display() {
        System.out.println("Parent Method");
    }
}
```

### Child Class (Sub Class)

A class that inherits properties and methods from another class.

```java
class Child extends Parent {

    void show() {
        System.out.println("Child Method");
    }
}
```

### Creating Object

```java
public class Main {

    public static void main(String[] args) {

        Child child = new Child();

        child.display(); // inherited method
        child.show();    // child method
        System.out.println(child.age); // inherited variable
    }
}
```

---

# Parent-Child Relationship

Inheritance creates a relationship between two classes.

```text
Parent Class (Super Class)
            |
            |
         extends
            |
            |
Child Class (Sub Class)
```

Example:

```java
class Animal {

    void eat() {
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog Barks");
    }
}
```

---

# Benefits of Inheritance

### 1. Code Reusability

Child class can directly use parent class members.

### 2. Less Code Duplication

Common functionality can be written once in the parent class.

### 3. Easy Maintenance

Changes in the parent class automatically become available to child classes.

### 4. Better Organization

Classes can be structured in a hierarchical manner.

---

# Types of Inheritance

Java supports the following inheritance types through classes:

## 1. Single Inheritance

One child class inherits from one parent class.

```text
Class A
    |
    |
Class B
```

Example:

```java
class A {

    void display() {
        System.out.println("Class A");
    }
}

class B extends A {

}
```

---

## 2. Multilevel Inheritance

A class inherits from a class which itself inherits from another class.

```text
Class A
    |
Class B
    |
Class C
```

Example:

```java
class A {

    void parent() {
        System.out.println("A");
    }
}

class B extends A {

}

class C extends B {

}
```

Here:

- B inherits A
- C inherits B
- C can access members of both A and B

---

## 3. Multiple Inheritance (Not Supported Through Classes)

```text
      Class A
        |
        |
      Class C
        |
        |
      Class B
```

Java does NOT support multiple inheritance using classes because it can create ambiguity (Diamond Problem).

Invalid Example:

```java
class A {

}

class B {

}

// Not Allowed
class C extends A, B {

}
```

Reason:

If both parent classes contain the same method, Java cannot determine which implementation should be used.

### Diamond Problem

```text
      A
     / \
    B   C
     \ /
      D
```

Class D may receive the same method from both B and C, causing ambiguity.

Therefore, Java does not support multiple inheritance with classes.

---

# Accessing Parent Class Members

```java
class Parent {

    int age = 50;

    void display() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {

    void show() {

        System.out.println(age);
        display();
    }
}
```

---

# Important Keywords

### extends

Used to establish inheritance.

```java
class Child extends Parent {

}
```

---

# Key Interview Points

### What is Inheritance?

Inheritance is an OOP feature that allows one class to acquire the properties and methods of another class for code reusability and relationship building.

### Which keyword is used for inheritance?

```java
extends
```

### What is Parent Class?

The class whose properties and methods are inherited.

### What is Child Class?

The class that inherits properties and methods from another class.

### Does Java support Multiple Inheritance?

- No, through classes.
- Yes, through interfaces.

### Why is Multiple Inheritance not supported in Java?

To avoid ambiguity and the Diamond Problem.

---

# Quick Summary

- Inheritance establishes a Parent-Child relationship.
- Parent Class = Super Class.
- Child Class = Sub Class.
- `extends` keyword is used for inheritance.
- Supports code reusability.
- Types:
  - Single Inheritance
  - Multilevel Inheritance
- Multiple Inheritance through classes is not supported.
- Diamond Problem is the primary reason for restricting multiple inheritance in classes.