# String vs StringBuffer in Java

## String

* String is immutable in Java.
* Once a String object is created, it cannot be modified.
* Any modification creates a new String object.
* Introduced in JDK 1.0.
* String class is non-synchronized.

---

## Example of String Literal

```java id="f1e5k7"
String name = "Raj";
```

### Notes

* Stored inside the String Intern Pool.
* Only unique String values are stored.
* Helps improve memory efficiency.

---

# Heap Memory Example

```java id="4d2kvm"
String name4 = new String("Hello");
```

### Notes

* Objects created using `new` keyword are stored in Heap memory.

---

# intern() Method

```java id="7k3mvn"
name4.intern();
```

### Purpose

* Returns reference from String Intern Pool.
* Improves memory optimization.

---

# StringBuffer

## Features

* StringBuffer is mutable.
* Modifications are possible without creating new objects.
* Introduced in JDK 1.0.
* Thread-safe.
* Methods are synchronized.

---

# Important Points

* String → Immutable
* StringBuffer → Mutable
* StringBuffer methods are synchronized
* String literals are stored in String Intern Pool
* `new String()` objects are stored in Heap memory
