# Exception Handling in Java

## What is Exception Handling?

Exception Handling is the mechanism used to handle abnormal situations (exceptions) that interrupt the normal flow of a program.

### Definition

> Any unwanted interruption that disrupts the normal flow of an application is called an exception.

---

# Normal Flow

```text
A --------------------------> B
```

Program executes normally.

---

# Interrupted Flow

```text
A --------X----------> B
```

Because of an exception, the flow gets disturbed.

---

# Examples of Risky Code

Certain operations are prone to exceptions.

### Reading Files

```java
FileReader reader =
        new FileReader("data.txt");
```

Possible exception:

```text
FileNotFoundException
```

---

### Database Connection

```java
Connection connection =
        DriverManager.getConnection(url);
```

Possible exception:

```text
SQLException
```

---

### Accessing Null Objects

```java
String name = null;

System.out.println(name.length());
```

Possible exception:

```text
NullPointerException
```

---

### Accessing Invalid Array Index

```java
int[] arr = {10,20,30};

System.out.println(arr[5]);
```

Possible exception:

```text
ArrayIndexOutOfBoundsException
```

---

### Accessing Elements That Are Not Loaded

```java
WebElement element = driver.findElement(locator);

element.click();
```

Possible exceptions:

```text
NoSuchElementException
StaleElementReferenceException
```

---

# Risky Code

Code that may throw exceptions is called risky code.

Examples:

1. Reading files
2. Database operations
3. Network communication
4. API calls
5. Array access
6. Null object access

---

# Why Do We Need Exception Handling?

---

## 1. Make Applications Robust

Without exception handling:

```java
System.out.println("Start");

int result = 10 / 0;

System.out.println("End");
```

Output:

```text
Start
ArithmeticException
```

Program terminates.

---

With exception handling:

```java
System.out.println("Start");

try {

    int result = 10 / 0;

} catch (ArithmeticException e) {

    System.out.println("Handled");
}

System.out.println("End");
```

Output:

```text
Start
Handled
End
```

Application continues normally.

---

## 2. Provide Proper Error Messages

Bad:

```text
NullPointerException
```

Good:

```text
Username cannot be empty.
```

or

```text
Unable to connect to database.
```

Meaningful messages improve usability.

---

## 3. Improve User Experience

Instead of:

```text
Application Crashed
```

Show:

```text
Something went wrong.
Please try again later.
```

---

## 4. Simplify Debugging

Exception stack traces help developers locate problems quickly.

Example:

```text
NullPointerException
at EmployeeService.java:25
```

Developer immediately knows where the problem occurred.

---

# Common Runtime Exceptions

## NullPointerException

```java
String name = null;

name.length();
```

Occurs when accessing members of a null reference.

---

## ArrayIndexOutOfBoundsException

```java
int[] arr = {1,2,3};

System.out.println(arr[5]);
```

Occurs when index does not exist.

---

## ArithmeticException

```java
int result = 10 / 0;
```

Output:

```text
ArithmeticException
```

---

## NumberFormatException

```java
Integer.parseInt("ABC");
```

Output:

```text
NumberFormatException
```

---

# Exception Handling Keywords

Java provides five keywords:

```text
try
catch
finally
throw
throws
```

---

# try Block

Contains risky code.

```java
try {

    int result = 10 / 0;
}
```

---

# catch Block

Handles exceptions.

```java
catch (ArithmeticException e) {

    System.out.println("Exception handled");
}
```

---

# finally Block

Always executes.

Used for cleanup activities.

```java
finally {

    System.out.println("Closing resources");
}
```

---

# throw Keyword

Used to explicitly throw an exception.

```java
throw new ArithmeticException();
```

---

# throws Keyword

Delegates exception handling to the caller.

```java
public void readFile()
        throws IOException {

}
```

---

# Exception Handling Flow

```text
try
 ↓
Exception Occurs?
 ↓
Yes
 ↓
catch
 ↓
finally
```

If no exception occurs:

```text
try
 ↓
finally
```

---

# Real-World Examples

## File Reading

```java
try {

    FileReader reader =
            new FileReader("test.txt");

} catch (FileNotFoundException e) {

    System.out.println("File not found");
}
```

---

## Database Connection

```java
try {

    Connection connection =
            DriverManager.getConnection(url);

} catch (SQLException e) {

    System.out.println("Unable to connect");
}
```

---

## Selenium Example

```java
try {

    driver.findElement(By.id("login"))
            .click();

} catch (NoSuchElementException e) {

    System.out.println("Element not found");
}
```

---

# Exception Handling Benefits

| Benefit | Description |
|----------|-------------|
| Robust Application | Prevents abnormal termination |
| Proper Error Messages | Helps users understand problems |
| Better User Experience | Graceful failure |
| Easy Debugging | Stack traces help developers |
| Resource Cleanup | Using finally block |

---

# Interview Questions

## Q1. What is an exception?

An exception is an unwanted interruption that disrupts the normal flow of a program.

---

## Q2. What is risky code?

Code that has the possibility of throwing exceptions.

Examples:

- File reading
- Database operations
- API calls
- Array access

---

## Q3. Why do we need exception handling?

- To make applications robust.
- To provide proper error messages.
- To improve user experience.
- To simplify debugging.

---

## Q4. Which block contains risky code?

```java
try
```

block.

---

## Q5. Which block handles exceptions?

```java
catch
```

block.

---

## Q6. Does finally always execute?

Yes.

Except:

- JVM crash
- System.exit()

---

## Q7. What is the difference between throw and throws?

| throw | throws |
|---------|--------|
| Explicitly throws exception | Delegates exception handling |
| Used inside method | Used in method signature |
| Followed by object | Followed by class name |

---

# Key Takeaways

- Exceptions interrupt normal program execution.
- Risky code should be placed inside the `try` block.
- Exception handling prevents abnormal program termination.
- Proper error messages improve user experience.
- Exception handling simplifies debugging.
- Java provides five keywords:
  - `try`
  - `catch`
  - `finally`
  - `throw`
  - `throws`
- Robust applications always handle exceptions gracefully.