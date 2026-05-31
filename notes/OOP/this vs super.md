# Java `this` and `super` Keyword Notes


# `this` Keyword in Java

## Definition

`this` is a reference variable in Java that refers to the **current object**.

It is mainly used in **3 places**.

---

## 1. Differentiate Instance Variables and Local Variables

### Problem

When constructor parameters and instance variables have the same name, Java gets confused about which variable to use.

### Example

```java
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }
}
```

### Explanation

```java
this.name
```

Refers to the instance variable.

```java
name
```

Refers to the local variable (constructor parameter).

### Memory Concept

#### Instance Variable

```java
private String name;
```

- Declared inside class
- Non-static
- Stored in Heap Memory
- Initialized with default values

#### Local Variable

```java
Student(String name)
```

- Exists inside method/constructor
- Highest priority during variable lookup
- No default value

### Variable Resolution Priority

Java first checks:

1. Local Variables
2. Instance Variables

Therefore:

```java
this.name = name;
```

means:

```java
instanceVariable = localVariable;
```

---

## 2. Constructor Chaining

### Definition

One constructor calls another constructor within the same class.

### Example

```java
public class Student {

    public Student() {
        System.out.println("Default Constructor");
    }

    public Student(String name) {
        this();
        System.out.println("Parameterized Constructor");
    }
}
```

### Explanation

```java
this();
```

calls another constructor of the same class.

### Rules

- Must be the first statement inside constructor.
- Used to avoid code duplication.
- Improves maintainability.

### Flow

```text
Parameterized Constructor
        ↓
      this()
        ↓
Default Constructor
```

This process is called:

### Constructor Chaining

---

## 3. `this` Refers to Current Object

### Definition

`this` always points to the current object that invoked the method or constructor.

### Example

```java
public class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(this.name);
    }
}
```

### Meaning

```java
this
```

means:

```java
current object
```

Example:

```java
Student s1 = new Student("Raj");
```

Inside constructor:

```java
this → s1
```

---

## Using `this` in equals()

### Example

```java
@Override
public boolean equals(Object obj) {

    Student other = (Student) obj;

    return this.name.equals(other.name);
}
```

### Meaning

```java
this.name
```

Current object's name

```java
other.name
```

Compared object's name

---

# `super` Keyword in Java

## Definition

`super` refers to the immediate parent class object.

It is used in inheritance.

---

# Relationship

```text
Parent Class
     ↑
     |
 Child Class
```

### Keywords

```java
this
```

Refers to current object.

```java
super
```

Refers to parent class object.

---

# Uses of `super`

## 1. Access Parent Class Variables

### Parent Class

```java
class Person {

    public int x = 10;
}
```

### Child Class

```java
class Student extends Person {

    int x = 20;

    public void display() {
        System.out.println(super.x);
    }
}
```

### Output

```text
10
```

### Why?

```java
super.x
```

accesses parent class variable.

Used to avoid name conflicts.

---

## 2. Access Parent Class Methods

### Parent

```java
class Person {

    public void display() {
        System.out.println("Parent Method");
    }
}
```

### Child

```java
class Student extends Person {

    public void display() {

        super.display();

        System.out.println("Child Method");
    }
}
```

### Output

```text
Parent Method
Child Method
```

---

## 3. Call Parent Constructor

### Parent

```java
class Person {

    Person(int x) {

        System.out.println("Parent Constructor");
    }
}
```

### Child

```java
class Student extends Person {

    Student(int x) {

        super(x);

        System.out.println("Child Constructor");
    }
}
```

### Output

```text
Parent Constructor
Child Constructor
```

### Explanation

```java
super(x);
```

calls parent class constructor.

### Rules

- Must be first statement inside constructor.
- Used during constructor chaining across inheritance hierarchy.

---

# Constructor Chaining Using `super`

### Flow

```text
Student Object Creation
          ↓
Child Constructor
          ↓
super()
          ↓
Parent Constructor
          ↓
Back to Child Constructor
```

---

# Parent Class Members Accessible via `super`

### Accessible

```text
public
protected
default (same package)
```

### Not Accessible

```text
private
```

Private members belong only to the parent class.

---

# Interview Questions

## Q1. Difference Between `this` and `super`

| this | super |
|--------|--------|
| Refers to current object | Refers to parent object |
| Used within same class | Used in child class |
| Calls current class constructor | Calls parent constructor |
| Resolves current class variable conflict | Resolves parent-child variable conflict |

---

## Q2. Can we use `this()` and `super()` together?

### Answer

No.

Both must be the first statement in a constructor.

Therefore Java does not allow:

```java
public Student() {

    this();

    super();
}
```

Compilation Error.

---

## Q3. Can `super()` be omitted?

### Answer

Yes.

If not written explicitly, Java inserts:

```java
super();
```

automatically.

Provided parent class has a default constructor.

---

## Q4. Can we access private variables using `super`?

### Answer

No.

Private members are not inherited.

```java
super.privateVariable
```

is not allowed.

---

# Quick Revision

## `this`

1. Differentiate local and instance variables.
2. Constructor chaining within same class.
3. Refers to current object.

---

## `super`

1. Access parent variables.
2. Access parent methods.
3. Call parent constructor.

---

## Golden Rule

```java
this  → Current Object
super → Parent Object
```