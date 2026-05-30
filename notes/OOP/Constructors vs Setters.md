# Constructors vs Setters in Java

## Constructor

### Definition
A constructor is a special method that has the same name as the class.

### Purpose
The main job of a constructor is to initialize instance variables (IV) during object creation.

### Characteristics
- Constructor name must be the same as the class name.
- Constructor is automatically called when an object is created using the `new` keyword.
- Constructor does not have a return type.
- Used to provide initial values to object variables.

### Example

```java
public class Person {

    String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }
}
```

### Object Creation

```java
Person p1 = new Person("John");
```

### What Happens Internally

1. Class gets loaded.
2. Memory is allocated for the object.
3. Constructor is called automatically.
4. Instance variables are initialized.

### Real-World Example

Consider an Employee object:

```java
Employee emp = new Employee("Raj", 101);
```

At the time of creation itself, required values are assigned to the object.

---

## Setter Method

### Definition

A setter is a normal method used to update or modify an instance variable after object creation.

### Purpose

The job of a setter is to change the value of an existing object variable.

### Characteristics

- Setter is a regular method.
- It is called explicitly by the programmer.
- Used to modify object state after creation.
- Helps achieve encapsulation.

### Example

```java
public class Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
```

### Usage

```java
Person p1 = new Person();

p1.setName("John");
```

### What Happens Internally

1. Object is created.
2. Constructor executes.
3. Object exists in memory.
4. Setter is called manually.
5. Variable value gets updated.

---

# Constructor vs Setter

| Constructor | Setter |
|------------|----------|
| Called automatically during object creation | Called manually after object creation |
| Used for initialization | Used for updating values |
| Same name as class | Any valid method name |
| No return type | Usually void |
| Runs once during object creation | Can be called multiple times |
| Mandatory values can be provided here | Optional changes can be made here |

---

# Example Comparison

## Using Constructor

```java
Person p1 = new Person("John");
```

Value is assigned immediately when the object is created.

---

## Using Setter

```java
Person p1 = new Person();

p1.setName("John");
```

Object is created first, then the value is assigned later.

---

# Why Use Constructor?

When an object cannot exist without certain values.

Example:

```java
Person p1 = new Person("John");
```

A person should have a name at creation time.

---

# Why Use Setter?

When values may change after object creation.

Example:

```java
Person p1 = new Person("John");

p1.setName("David");
```

The name is updated after the object is already created.

---

# Interview Question

### Q: What is the difference between a Constructor and a Setter?

### Answer:

A constructor is used to initialize an object's state at the time of object creation and is invoked automatically when an object is created.

A setter is a normal method used to modify or update an object's state after the object has already been created and must be called explicitly.

Constructors are mainly used for mandatory initialization, whereas setters are used for optional or later modifications.