# Java String intern() Method

## Overview

The `intern()` method in Java is used to store and retrieve strings from the String Constant Pool (SCP).

It helps improve:

* Memory optimization
* Performance
* String reusability

This topic is very important for Java and SDET interviews because it tests understanding of:

* Heap memory
* String Constant Pool
* Object creation
* Reference handling

---

# What is String Constant Pool?

The String Constant Pool is a special memory area inside Heap memory where Java stores String literals.

Example:

```java id="4x3olr"
String data = "Hello World";
```

Here:

* `"Hello World"` is stored inside String Constant Pool.
* If the same value already exists, Java reuses it instead of creating a new object.

This improves memory efficiency.

---

# String Literal Example

```java id="qq4b4k"
String data = "Hello World";
String data2 = "Hello World";
```

## Explanation

Both references point to the same object inside String Constant Pool.

```java id="y6q6c2"
System.out.println(data == data2);
```

Output:

```java id="gwv7yn"
true
```

Because both references share the same memory location.

---

# Using new Keyword

```java id="oqmv4m"
String data1 = new String("Hello World");
```

## Explanation

When using `new` keyword:

* A new object is created in Heap memory.
* Even if the same value exists in String Pool, Java creates a separate object.

So:

```java id="7flhl0"
String data = "Hello World";
String data1 = new String("Hello World");

System.out.println(data == data1);
```

Output:

```java id="wk3y7l"
false
```

Because:

* `data` points to String Pool
* `data1` points to Heap memory object

---

# intern() Method

## Syntax

```java id="d8r47s"
stringReference.intern();
```

## Purpose

The `intern()` method moves or references the String object into the String Constant Pool.

---

# intern() Example

```java id="gj0qk1"
String data = "Hello World";

String data1 = new String("Hello World");

String data2 = data1.intern();

System.out.println(data == data2);
```

Output:

```java id="i33bxf"
true
```

## Explanation

* `data` points to SCP object
* `data1` points to Heap object
* `data1.intern()` returns reference from String Pool
* `data2` now points to the SCP object

So both references become equal.

---

# Memory Flow

## Without intern()

```text
String data = "Hello World";
String data1 = new String("Hello World");
```

Memory Created:

1. String Pool Object
2. Heap Object

Total:
2 Objects

---

## With intern()

```text
String data2 = data1.intern();
```

No extra object created.

Java reuses existing SCP object.

---

# Real-Time Interview Points

## Why String Pool Exists?

To reduce duplicate String object creation and save memory.

---

## Why Strings are Immutable?

Because String Pool sharing becomes safe only when Strings cannot be modified.

---

## Difference Between == and equals()

### ==

Checks reference memory location.

### equals()

Checks actual content.

---

# Real-Time SDET Usage

Understanding String internals helps in:

* Selenium text validation
* API response comparison
* Log validation
* Framework optimization
* Debugging memory issues

---

# Key Takeaways

* String literals are stored in String Constant Pool.
* `new String()` creates object in Heap memory.
* `intern()` returns String Pool reference.
* `==` compares references.
* `equals()` compares values.
* String Pool improves memory efficiency.

