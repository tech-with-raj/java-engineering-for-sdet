# Final Keyword in Java

The `final` keyword is used to restrict modification.

It can be applied to:

1. Variables
2. Methods
3. Classes

---

# 1. Final Variable

## Syntax

```java
final int X = 10;
```

A final variable becomes a constant.

After assigning a value once, it cannot be changed.

```java
final int AGE = 25;

AGE = 30;      // Compile-time Error
```

---

## Characteristics

- Read-only variable.
- Value cannot be modified.
- Assignment can happen only once.

---

## Naming Convention

Final constants are generally written in uppercase.

```java
final int MAX_SIZE = 100;
final double PI = 3.14;
final String COMPANY_NAME = "Google";
```

---

## Getter and Setter

Getter is allowed:

```java
public int getAge() {
    return age;
}
```

Setter is not useful for final variables:

```java
public void setAge(int age) {      // Not required
    this.age = age;
}
```

---

## Real-world Usage

### Constants

```java
final double GST = 18.0;
```

### Immutable Objects

Builder Pattern heavily uses final variables.

Example:

```java
public class Student {

    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

# Final Reference Variable

```java
final Employee emp = new Employee();
```

The reference cannot change.

```java
emp = new Employee();      // Error
```

But the object's data can still change.

```java
emp.setName("Raj");
```

Therefore:

- Object is mutable.
- Reference is immutable.

---

# 2. Final Method

## Syntax

```java
class Parent {

    final void display() {

        System.out.println("Parent Method");
    }
}
```

---

## Final Methods Cannot Be Overridden

```java
class Child extends Parent {

    @Override
    void display() {

    }
}
```

Compile-time error.

Because final methods cannot be overridden.

---

## Example

```java
class Payment {

    final void validate() {

        System.out.println("Validation logic");
    }
}

class CreditCardPayment extends Payment {

    // Cannot override validate()
}
```

---

## Why Use Final Methods?

To prevent modification of critical business logic.

Examples:

- Validation logic
- Security methods
- Authentication methods
- Framework internal methods

---

# Final Method and Abstract

Invalid combination:

```java
abstract final void display();
```

Compile-time error.

Reason:

- Abstract method requires overriding.
- Final method prevents overriding.

Both are opposite concepts.

---

# Polymorphism with Final Methods

Method overriding does not happen.

```java
Parent p = new Child();

p.display();
```

Output:

```text
Parent Method
```

Because the method is final.

---

# 3. Final Class

## Syntax

```java
final class Employee {

}
```

A final class cannot be inherited.

---

## Example

```java
final class Parent {

}

class Child extends Parent {

}
```

Compile-time error.

---

## Why Use Final Classes?

To prevent subclass creation.

Used when behavior should never be changed.

---

## Real-world Examples

### String Class

```java
String
```

is a final class.

Therefore:

```java
class MyString extends String {

}
```

Not possible.

---

### Wrapper Classes

```java
Integer
Double
Boolean
Character
```

All are final classes.

---

## Why String Is Final?

For:

- Immutability
- Security
- Thread safety
- Performance

---

# Static Final Variables

Most common combination.

```java
static final int MAX_SIZE = 100;
```

Meaning:

- `static` → One copy for the entire class.
- `final` → Cannot be changed.

---

## Example

```java
class Constants {

    static final double PI = 3.14159;
}
```

Access:

```java
System.out.println(Constants.PI);
```

No object creation required.

---

# Memory View

```java
class Constants {

    static final int MAX_SIZE = 100;
}
```

Only one copy exists in Method Area.

Shared by all objects.

Value remains fixed throughout program execution.

---

# Final Keyword Summary

| Applied To | Meaning |
|------------|---------|
| Variable | Value cannot change |
| Method | Cannot be overridden |
| Class | Cannot be inherited |
| Reference Variable | Reference cannot point to another object |
| static final | Constant shared by entire class |

---

# Interview Questions

## Q1. Can a final variable be modified?

No.

```java
final int x = 10;

x = 20;
```

Compile-time error.

---

## Q2. Can a final method be overridden?

No.

Final methods cannot participate in runtime polymorphism.

---

## Q3. Can a final class be inherited?

No.

```java
final class A {

}

class B extends A {

}
```

Compile-time error.

---

## Q4. Can we make an abstract method final?

No.

```java
abstract final void display();
```

Invalid.

Because:

- Abstract → must override.
- Final → cannot override.

---

## Q5. Can a constructor be final?

No.

Constructors are never inherited, so there is no concept of overriding them.

---

## Q6. Can a final object change its data?

Yes.

```java
final Employee emp = new Employee();

emp.setName("Raj");
```

Allowed.

But:

```java
emp = new Employee();
```

Not allowed.

---

# Real-world Examples

## Constants Class

```java
class AppConstants {

    static final String URL = "https://google.com";
    static final int TIMEOUT = 30;
}
```

---

## Builder Design Pattern

```java
public class Student {

    private final String name;
    private final int age;

    private Student(Builder builder) {

        this.name = builder.name;
        this.age = builder.age;
    }
}
```

Final fields make objects immutable.

---

## Security

Prevent subclasses from changing sensitive behavior.

```java
final class EncryptionManager {

}
```

---

# Key Takeaways

- Final variable → constant.
- Final variables are read-only.
- Naming convention is UPPER_CASE.
- Final method → cannot be overridden.
- Final class → cannot be inherited.
- Abstract and final cannot be used together.
- Final reference variable cannot point to another object.
- Object state may still change if object is mutable.
- `static final` is used to create constants.
- Builder Pattern frequently uses final fields to create immutable objects.