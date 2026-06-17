# Enum in Java (Enumeration)

`enum` stands for **Enumeration**.

It was introduced in **Java 5**.

An enum is a special type (special class) used to represent a fixed set of constant values.

---

# Why Enum?

Before enums, constants were represented using:

```java
int
String
```

Example:

```java
String paymentMode = "UPI";
```

Problems:

- Typing mistakes are possible.
- Invalid values are allowed.
- No compile-time type checking.

Example:

```java
paymentMode = "UPIII";
```

No compile-time error.

---

# Enum Provides Type Safety

```java
enum PaymentMode {

    UPI,
    CREDIT_CARD,
    NET_BANKING
}
```

Usage:

```java
PaymentMode mode = PaymentMode.UPI;
```

Invalid:

```java
mode = "UPI";
```

Compile-time error.

---

# Real-world Examples

## Payment Modes

```java
enum PaymentMode {

    UPI,
    CREDIT_CARD,
    NET_BANKING
}
```

---

## Order Status

```java
enum OrderStatus {

    PLACED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}
```

---

## Days of Week

```java
enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
```

---

## Browser Types

Useful in Selenium Framework:

```java
enum BrowserType {

    CHROME,
    FIREFOX,
    EDGE
}
```

Usage:

```java
BrowserType browser = BrowserType.CHROME;
```

---

# Enum is a Special Class

```java
enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY
}
```

Behind the scenes:

```java
class Day extends Enum<Day> {

}
```

All enums ultimately inherit from:

```java
java.lang.Enum
```

Therefore:

```text
Object
   ↑
Enum
   ↑
Day
```

---

# Enum Constants

```java
enum Color {

    RED,
    GREEN,
    BLUE
}
```

Each constant is:

```java
public static final
```

internally.

---

# Enum Objects

```java
Color.RED
Color.GREEN
Color.BLUE
```

are objects.

Each constant is created only once.

---

# Memory Efficient

Enum constants behave like Singleton objects.

Only one object exists for each constant.

Example:

```java
Color c1 = Color.RED;
Color c2 = Color.RED;

System.out.println(c1 == c2);
```

Output:

```text
true
```

Because both references point to the same object.

---

# Enum Constructor

Enums can have constructors.

Example:

```java
enum Day {

    MONDAY,
    TUESDAY;

    Day() {

        System.out.println("Constructor Called");
    }
}
```

---

## Constructor Visibility

Constructor cannot be public.

Allowed:

```java
private Day() {

}
```

or simply:

```java
Day() {

}
```

Not allowed:

```java
public Day() {

}
```

---

# Cannot Create Enum Objects

Invalid:

```java
Day d = new Day();
```

Compile-time error.

Objects are created internally by JVM.

---

# Enum with Variables

```java
enum Laptop {

    HP(50000),
    DELL(60000),
    LENOVO(55000);

    private int price;

    Laptop(int price) {

        this.price = price;
    }
}
```

---

# Enum with Methods

```java
enum Laptop {

    HP,
    DELL,
    LENOVO;

    public void display() {

        System.out.println("Laptop Enum");
    }
}
```

Usage:

```java
Laptop.HP.display();
```

---

# Enum with Constructor + Variable + Method

```java
enum StudentGrade {

    A(90),
    B(80),
    C(70);

    private int minimumMarks;

    StudentGrade(int minimumMarks) {

        this.minimumMarks = minimumMarks;
    }

    public int getMinimumMarks() {

        return minimumMarks;
    }
}
```

Usage:

```java
System.out.println(StudentGrade.A.getMinimumMarks());
```

Output:

```text
90
```

---

# Enum Can Implement Interfaces

Interface:

```java
interface Printable {

    void print();
}
```

Enum:

```java
enum Color implements Printable {

    RED,
    GREEN,
    BLUE;

    @Override
    public void print() {

        System.out.println("Printing");
    }
}
```

---

# Enum Cannot Extend Classes

Invalid:

```java
enum Day extends Student {

}
```

Compile-time error.

Because enums already extend:

```java
java.lang.Enum
```

---

# values() Method

Returns all constants.

```java
enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY
}
```

```java
Day[] days = Day.values();
```

Loop:

```java
for (Day day : Day.values()) {

    System.out.println(day);
}
```

Output:

```text
MONDAY
TUESDAY
WEDNESDAY
```

---

# ordinal() Method

Returns position.

```java
System.out.println(Day.MONDAY.ordinal());
```

Output:

```text
0
```

```java
System.out.println(Day.TUESDAY.ordinal());
```

Output:

```text
1
```

---

# valueOf() Method

Converts String to Enum.

```java
Day day = Day.valueOf("MONDAY");
```

Output:

```text
MONDAY
```

---

# switch with Enum

```java
enum BrowserType {

    CHROME,
    FIREFOX,
    EDGE
}
```

```java
BrowserType browser = BrowserType.CHROME;

switch (browser) {

case CHROME:
    System.out.println("Launching Chrome");
    break;

case FIREFOX:
    System.out.println("Launching Firefox");
    break;

case EDGE:
    System.out.println("Launching Edge");
    break;
}
```

---

# Enum in Selenium Framework

Instead of:

```java
String browser = "chrome";
```

Use:

```java
enum BrowserType {

    CHROME,
    FIREFOX,
    EDGE
}
```

Driver Factory:

```java
public WebDriver getDriver(BrowserType browser) {

    switch (browser) {

    case CHROME:
        return new ChromeDriver();

    case FIREFOX:
        return new FirefoxDriver();

    case EDGE:
        return new EdgeDriver();

    default:
        throw new IllegalArgumentException();
    }
}
```

Benefits:

- Type safety
- Avoid invalid browser names
- Compile-time checking

---

# Enum vs Constants Class

## Constants Class

```java
class Constants {

    public static final String CHROME = "chrome";
}
```

Problems:

```java
String browser = "chromee";
```

No compile-time checking.

---

## Enum

```java
enum BrowserType {

    CHROME,
    FIREFOX,
    EDGE
}
```

Provides:

- Type safety
- Better readability
- Memory efficiency

---

# Interview Questions

## Q1. When was Enum introduced?

Java 5.

---

## Q2. Can enum have constructors?

Yes.

But constructors cannot be public.

---

## Q3. Can enum have variables?

Yes.

```java
private int price;
```

---

## Q4. Can enum have methods?

Yes.

```java
public void display() {

}
```

---

## Q5. Can enum implement interfaces?

Yes.

```java
enum Color implements Printable {

}
```

---

## Q6. Can enum extend another class?

No.

Because every enum already extends:

```java
java.lang.Enum
```

---

## Q7. Can we create enum objects?

No.

```java
new Day();
```

Not allowed.

---

## Q8. Why are enums memory efficient?

Each enum constant behaves like a Singleton object.

Only one object exists for:

- RED
- GREEN
- BLUE

throughout application execution.

---

# Key Takeaways

- Enum was introduced in Java 5.
- Enum is a special class for constant values.
- Provides compile-time type checking.
- Avoids invalid values.
- Every enum extends `java.lang.Enum`.
- Enum constants are objects.
- Constructors are allowed but cannot be public.
- Enum can have variables and methods.
- Enum can implement interfaces.
- Enum cannot extend other classes.
- Enum objects are created internally by JVM.
- `values()`, `ordinal()`, and `valueOf()` are commonly used methods.
- Enum is widely used in Selenium frameworks for browser types, environments, and execution modes.