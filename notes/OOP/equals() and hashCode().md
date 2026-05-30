# Java `equals()` and `hashCode()` Notes

## Introduction

In Java, `equals()` and `hashCode()` are used to determine whether two objects should be considered logically equal.

They are especially important when working with collections such as:

- HashMap
- HashSet
- Hashtable
- LinkedHashMap
- LinkedHashSet

Without properly overriding these methods, Java compares object references instead of object data.

---

# Example Class

```java
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }
}
```

---

# Problem Statement

Consider the following code:

```java
Person p1 = new Person("Raj");
Person p2 = new Person("Raj");
```

Even though both objects contain the same value (`Raj`), Java treats them as different objects because they are stored at different memory locations.

---

# Memory Representation

```java
Person p1 = new Person("Raj");
Person p2 = new Person("Raj");
```

### Object 1

```text
p1
 |
 v
Person
name = "Raj"
```

### Object 2

```text
p2
 |
 v
Person
name = "Raj"
```

Although both objects contain the same data:

```text
Raj == Raj
```

Their memory references are different:

```text
p1 != p2
```

---

# Default Behavior of equals()

By default, `equals()` from the Object class compares memory addresses.

```java
System.out.println(p1.equals(p2));
```

Output:

```text
false
```

Reason:

```text
Different memory locations
Different object references
```

---

# Why Override equals()?

Sometimes we do not care about memory addresses.

We only care whether the object data is the same.

Example:

```java
Person p1 = new Person("Raj");
Person p2 = new Person("Raj");
```

Business expectation:

```text
Both persons should be considered equal.
```

To achieve this, override `equals()`.

---

# Conditions for Object Equality

Two objects are considered equal when:

### 1. Same Class Type

Both objects must belong to the same class.

```java
Person p1
Person p2
```

Valid comparison.

```java
Person p1
Animal a1
```

Invalid comparison.

---

### 2. Important Instance Variables Must Match

Values used for comparison should be the same.

Example:

```java
p1.name = "Raj"
p2.name = "Raj"
```

Result:

```text
Equal
```

---

### 3. Business Logic Says They Represent the Same Entity

Example:

```java
Employee(id=101)
Employee(id=101)
```

Even if memory locations differ, they represent the same employee.

---

# Overriding equals()

```java
@Override
public boolean equals(Object obj) {

    if (this == obj)
        return true;

    if (obj == null)
        return false;

    if (getClass() != obj.getClass())
        return false;

    Person other = (Person) obj;

    return name.equals(other.name);
}
```

---

# What is hashCode()?

A hash code is an integer value generated from object data.

Java collections use this value for:

- Fast searching
- Fast insertion
- Fast lookup

Example:

```java
HashSet<Person>
HashMap<Person, String>
```

---

# Rule Between equals() and hashCode()

Java contract:

```text
If two objects are equal,
their hashCode() values must also be equal.
```

Example:

```java
p1.equals(p2) == true
```

Then:

```java
p1.hashCode() == p2.hashCode()
```

Must be:

```text
true
```

---

# Overriding hashCode()

```java
@Override
public int hashCode() {
    return name.hashCode();
}
```

---

# Complete Example

```java
import java.util.Objects;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Person other = (Person) obj;

        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
```

---

# Test Program

```java
public class Runner {

    public static void main(String[] args) {

        Person p1 = new Person("Raj");
        Person p2 = new Person("Raj");

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
```

Output:

```text
true
82033
82033
```

---

# Real-World Example

Consider a banking application.

```java
Customer c1 = new Customer(1001);
Customer c2 = new Customer(1001);
```

Although two separate objects are created:

```text
Memory Address -> Different
Customer ID -> Same
```

Business logic:

```text
Both represent the same customer.
```

Therefore:

```java
equals()
```

should compare:

```java
customerId
```

instead of memory location.

---

# Interview Points

### What does equals() do?

Used to compare object contents logically.

---

### What does hashCode() do?

Generates a hash value used by hash-based collections.

---

### Can we override equals() without hashCode()?

Yes, but it breaks the contract and causes issues in:

- HashMap
- HashSet
- Hashtable

---

### Can two objects have the same hashCode()?

Yes.

This is called a hash collision.

---

### If two objects are equal, can hashCode() be different?

No.

Equal objects must return the same hashCode.

---

# Key Takeaway

- Default `equals()` compares references.
- Override `equals()` to compare object data.
- Override `hashCode()` whenever `equals()` is overridden.
- Equal objects must produce the same hash code.
- Collections like HashMap and HashSet heavily rely on `equals()` and `hashCode()`.