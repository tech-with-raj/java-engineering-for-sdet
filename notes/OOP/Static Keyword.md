# Static Keyword Usage in Java

## What is `static`?

The `static` keyword belongs to the class rather than to individual objects.

- Memory is allocated only once.
- Shared among all objects.
- Can be used with:
  - Variables
  - Methods
  - Blocks
  - Nested Classes
  - Import statements

---

# 1. Static Variable

## Purpose
Used when a value should be common for all objects.

### Example

```java
class Employee {

    static String companyName = "Infosys";
}
```

### Memory Behavior

Only one copy exists in memory.

```java
Employee e1 = new Employee();
Employee e2 = new Employee();

System.out.println(Employee.companyName);
```

### Real-world Usage

- Constants
- Counters
- Shared configurations
- Common data

Example:

```java
class Student {

    static int studentCount = 0;

    Student() {
        studentCount++;
    }
}
```

---

# 2. Static Method

## Purpose

Can be called without creating an object.

### Example

```java
class Utility {

    static void printMessage() {
        System.out.println("Hello");
    }
}
```

Calling:

```java
Utility.printMessage();
```

### Characteristics

- Belongs to class.
- Can access only static members directly.
- Cannot use `this`.
- Cannot access instance variables directly.

### Real-world Usage

Utility/helper methods.

Example:

```java
Math.max();
Collections.sort();
Arrays.asList();
```

---

# 3. Static Block

## Purpose

Used for one-time initialization.

### Syntax

```java
class Demo {

    static {

        System.out.println("Static block executed");
    }
}
```

### Execution

Runs only once when the class is loaded.

Order:

1. Static variables
2. Static block
3. Main method
4. Constructor
5. Object creation

---

## Use Cases

### Loading Configuration

```java
static {

    System.out.println("Reading configuration...");
}
```

### Database Connection Setup

```java
static {

    System.out.println("Initializing DB connection");
}
```

### Reading Data From Resource Files

```java
static {

    System.out.println("Loading properties file");
}
```

### Logging Setup

```java
static {

    System.out.println("Logger initialized");
}
```

---

# Static Block vs Constructor

## Static Block

### Used For

Initializing static variables.

### Runs

Only once.

### Executes

When class loads.

### Can Use

Static variables only.

### Cannot Use

`this`

Example:

```java
class Employee {

    static {

        System.out.println("Executed once");
    }
}
```

---

## Constructor

### Used For

Initializing instance variables.

### Runs

Every time an object is created.

### Executes

During object creation.

### Can Use

Instance variables.

### Can Use

`this`

Example:

```java
class Employee {

    String name;

    Employee() {

        this.name = "Raj";
    }
}
```

---

# Static Import

Without static import:

```java
System.out.println(Math.sqrt(25));
System.out.println(Math.max(10,20));
```

With static import:

```java
import static java.lang.Math.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(sqrt(25));
        System.out.println(max(10,20));
    }
}
```

---

# Static Nested Class (Inner Class)

```java
class Outer {

    static class Inner {

        void display() {

            System.out.println("Inside inner class");
        }
    }
}
```

Usage:

```java
Outer.Inner obj = new Outer.Inner();

obj.display();
```

---

# Why Main Method is Static?

```java
public static void main(String[] args)
```

Because JVM should call the method without creating an object.

```java
ClassName.main(args);
```

No object creation is required.

---

# Object Creation Is Simple

```java
Employee emp = new Employee();
```

Object contains:

- Instance variables
- Instance methods

Static members are not part of every object.

They belong to the class itself.

---

# Method Area (Class Area)

Static members are stored in Method Area.

Contains:

- Static variables
- Static methods
- Static blocks
- Class metadata

Only one copy exists.

---

# Important Restrictions

## Static Method Cannot Access Non-static Variable

❌

```java
class Demo {

    int age = 25;

    static void display() {

        System.out.println(age);
    }
}
```

Because static methods belong to class, while `age` belongs to object.

---

## Static Method Cannot Use `this`

❌

```java
static void display() {

    System.out.println(this.name);
}
```

Reason:

`this` refers to current object.

Static methods do not have any object reference.

---

# Final + Static

Often used together for constants.

```java
class Constants {

    static final double PI = 3.14159;
}
```

Access:

```java
System.out.println(Constants.PI);
```

---

# Interview Questions

## Q1. Can a static method be overridden?

No.

Static methods are method hidden, not overridden.

---

## Q2. Can a constructor be static?

No.

Constructors belong to objects, whereas static belongs to class.

---

## Q3. Can a static method access instance variables?

No.

An object reference is required.

---

## Q4. Can static block access non-static variables?

No.

Because no object exists at that time.

---

## Q5. Can we have multiple static blocks?

Yes.

They execute in the same order they are written.

```java
static {
    System.out.println("Block 1");
}

static {
    System.out.println("Block 2");
}
```

Output:

```
Block 1
Block 2
```

---

# Real-world Examples

### Math Class

```java
Math.sqrt();
Math.max();
```

### Arrays Utility

```java
Arrays.sort(arr);
```

### Collections Utility

```java
Collections.sort(list);
```

### Singleton Pattern

One-time object creation.

### Builder Design Pattern

Often uses static nested classes.

Example:

```java
Student student =
        new Student.Builder()
                .setName("Raj")
                .setAge(27)
                .build();
```

---

# Key Takeaways

- `static` belongs to class, not object.
- Static variable → shared data.
- Static method → utility methods.
- Static block → one-time initialization.
- Static import → avoid class name repetition.
- Static nested class → helper class inside another class.
- Static members are created once and shared.
- Static methods cannot use instance variables directly.
- `this` cannot be used inside static context.
- Main method is static so JVM can execute it without creating an object.