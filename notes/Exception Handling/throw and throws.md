# throw and throws in Java

Java provides two keywords for exception handling:

1. `throw`
2. `throws`

Although they look similar, they serve completely different purposes.

---

# throw Keyword

The `throw` keyword is used to explicitly throw an exception object.

---

## Syntax

```java
throw new ExceptionType();
```

Example:

```java
throw new ArithmeticException();
```

---

# Purpose of throw

Used when we want to generate an exception manually.

```java
if(condition) {

    throw new Exception();
}
```

---

# Example

```java
public class Test {

    public static void main(String[] args) {

        int age = 15;

        if(age < 18) {

            throw new ArithmeticException(
                    "Age must be greater than 18");
        }

        System.out.println("Eligible");
    }
}
```

Output:

```text
Exception in thread "main"
java.lang.ArithmeticException:
Age must be greater than 18
```

---

# Custom Exception Example

```java
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {

        super(message);
    }
}
```

Usage:

```java
public void validateAge(int age)
        throws InvalidAgeException {

    if(age < 18) {

        throw new InvalidAgeException(
                "Invalid Age");
    }
}
```

---

# Important Point

```java
throw
```

always throws an object.

Example:

```java
throw new IOException();
```

Here:

```java
new IOException()
```

creates one exception object.

---

# throw Creates Only One Exception Object

```java
throw new Exception();
```

creates exactly one exception object and transfers control to exception handling mechanism.

---

# Common Uses of throw

### Input Validation

```java
if(name == null) {

    throw new NullPointerException();
}
```

---

### Business Rule Validation

```java
if(balance < amount) {

    throw new IllegalArgumentException(
            "Insufficient balance");
}
```

---

### Custom Exceptions

```java
throw new InvalidAgeException(
        "Age should be above 18");
```

---

# throws Keyword

The `throws` keyword delegates exception handling responsibility to the caller.

---

## Syntax

```java
returnType methodName()
        throws ExceptionType {

}
```

Example:

```java
void readFile()
        throws IOException {

}
```

---

# Purpose of throws

Instead of handling the exception inside the method, we pass the responsibility to the caller.

---

# Example

```java
public void readFile()
        throws FileNotFoundException {

    File file = new File("demo.txt");

    FileReader fr = new FileReader(file);
}
```

---

The exception is not handled inside:

```java
readFile()
```

Responsibility moves to the caller.

---

# Caller

```java
public static void main(String[] args) {

    readFile();
}
```

Main method becomes the caller.

---

# Exception Flow

```text
main()
   ↓
readFile()
   ↓
throws FileNotFoundException
   ↓
main() handles it
```

---

# Handling at Caller

```java
public static void main(String[] args) {

    try {

        readFile();

    } catch (FileNotFoundException e) {

        System.out.println("File not found");
    }
}
```

---

# Multiple Exceptions

```java
public void process()
        throws IOException,
               SQLException {

}
```

---

# Exception Propagation

Method 1:

```java
void m1()
        throws IOException {

}
```

Method 2:

```java
void m2()
        throws IOException {

    m1();
}
```

Method 3:

```java
void m3()
        throws IOException {

    m2();
}
```

Exception propagates upward.

---

# Real Example

```java
public void readFile()
        throws FileNotFoundException {

    File file =
            new File("demo.txt");

    FileReader reader =
            new FileReader(file);
}
```

Possible exception:

```text
FileNotFoundException
```

Compiler forces handling because it is a checked exception.

---

# throws with Checked Exception

```java
public void connectDatabase()
        throws SQLException {

}
```

Examples:

- IOException
- SQLException
- FileNotFoundException

---

# throws with Unchecked Exception

Allowed but unnecessary.

```java
public void divide()
        throws ArithmeticException {

    int result = 10 / 0;
}
```

Compiler does not force handling.

---

# throw vs throws

| throw | throws |
|--------|--------|
| Used inside method | Used in method signature |
| Explicitly throws exception | Delegates exception handling |
| Followed by object | Followed by class names |
| Creates one exception object | Can declare multiple exceptions |
| Used with checked and unchecked exceptions | Mostly used with checked exceptions |

---

# Example

## Using throw

```java
if(age < 18) {

    throw new InvalidAgeException(
            "Age should be above 18");
}
```

---

## Using throws

```java
public void validateAge(int age)
        throws InvalidAgeException {

}
```

---

# throw + throws Together

```java
public void validateAge(int age)
        throws InvalidAgeException {

    if(age < 18) {

        throw new InvalidAgeException(
                "Age should be above 18");
    }
}
```

Here:

### throws

Declares that method may generate:

```java
InvalidAgeException
```

### throw

Actually creates and throws:

```java
new InvalidAgeException()
```

---

# Flow Diagram

```text
Caller (main)
        ↓
validateAge()
        ↓
throw new InvalidAgeException()
        ↓
throws InvalidAgeException
        ↓
Caller handles using try-catch
```

---

# Interview Questions

## Q1. What is the difference between throw and throws?

### throw

Used to explicitly throw an exception object.

### throws

Used to delegate exception handling responsibility to caller.

---

## Q2. Is throw followed by object or class?

Object.

```java
throw new IOException();
```

---

## Q3. Is throws followed by object or class?

Class names.

```java
throws IOException,
       SQLException
```

---

## Q4. Can throw be used with custom exceptions?

Yes.

```java
throw new InvalidAgeException(
        "Invalid Age");
```

---

## Q5. Can throws declare multiple exceptions?

Yes.

```java
throws IOException,
       SQLException
```

---

## Q6. Which keyword actually creates exception object?

```java
throw
```

Example:

```java
throw new Exception();
```

---

## Q7. Which keyword transfers responsibility to caller?

```java
throws
```

---

# Key Takeaways

- `throw` explicitly throws an exception object.
- `throws` delegates exception handling to caller.
- `throw` is followed by an object.
- `throws` is followed by exception class names.
- `throw` creates one exception object.
- `throws` can declare multiple exceptions.
- `throw` and `throws` are often used together.
- Checked exceptions commonly use `throws`.
- Exception propagation moves exceptions from callee to caller.
- Custom exceptions are usually used with both `throw` and `throws`.