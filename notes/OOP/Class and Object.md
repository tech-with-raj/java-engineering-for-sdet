# OOP with Java - Class and Object Notes

## What is a Class?

A class is a **blueprint (template)** used to create objects.

It defines:
- Properties (Data)
- Behaviors (Methods)

### Definition
> A class is a blueprint for an object.

### Example

Consider a **Student**.

Student class may contain:

#### Properties
- name
- rollNo
- age
- department

#### Behaviors
- study()
- attendClass()
- writeExam()

The class only defines these details.
It does not represent a real student.

---

## What is an Object?

An object is a **real-world entity** created from a class.

### Definition
> An object is an instance of a class.

### Important Point

A class is just a blueprint.

An object is the actual thing that occupies memory.

---

## Real-World Example

### Blueprint vs House

Class → House Blueprint

Object → Actual House

You can create multiple houses using the same blueprint.

Similarly,

Student Class →
- Raj
- Ravi
- Priya

All are different objects created from the same class.

---

## Real-World Entity + Memory Space

An object is:

- A real-world entity
- Stored in memory
- Created from a class

Example:

```java
Student s1 = new Student();
```

Here:

- Student → Class
- s1 → Reference Variable
- new Student() → Object

Memory is allocated when the object is created.

---

## Example 1: Student

### Class

```java
class Student {

    String name;
    int age;

    void study() {
        System.out.println("Student is studying");
    }
}
```

### Object Creation

```java
Student raj = new Student();

raj.name = "Raj";
raj.age = 26;

raj.study();
```

---

## Example 2: Manager and Employee

### Manager Class

Properties:
- name
- salary
- department

Behaviors:
- assignWork()
- approveLeave()
- reviewPerformance()

### Employee Class

Properties:
- name
- employeeId
- salary

Behaviors:
- work()
- attendMeeting()
- submitTask()

Objects:

```java
Manager manager1 = new Manager();

Employee emp1 = new Employee();
Employee emp2 = new Employee();
Employee emp3 = new Employee();
```

One manager and multiple employees can be created from their respective classes.

---

# Interview Questions

## What is a Class?

A class is a blueprint or template used to create objects. It contains data members and methods that define the properties and behavior of an object.

---

## What is an Object?

An object is an instance of a class. It is a real-world entity that occupies memory and can access the properties and methods defined inside the class.

---

## Difference Between Class and Object

| Class | Object |
|---------|---------|
| Blueprint | Instance of class |
| Logical entity | Physical entity |
| Does not occupy memory | Occupies memory |
| Used to create objects | Created from class |
| Template | Real-world entity |

---

# Key Takeaway

Class → Blueprint

Object → Real-world Entity

Class defines:
- What an object should have

Object represents:
- The actual thing created in memory

Example:

```java
Student s1 = new Student();
```

- Student → Class
- s1 → Reference Variable
- new Student() → Object