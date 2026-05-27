/*
========================================
TOPIC: STRINGS IN JAVA
========================================

1. Definition:
String is a sequence of characters.

Example:
String name = "Raj";

----------------------------------------

2. String Characteristics:

• String is a non-primitive data type.
• String is a predefined class in Java.
• String belongs to java.lang package.
• String variables store reference values.

Example:

String name = "Raj";

name  → reference variable
"Raj" → String Literal

----------------------------------------

3. String Literal:

A value enclosed inside double quotes is called String Literal.

Example:

String city = "Chennai";

Here:
city      → variable name
"Chennai" → String Literal

----------------------------------------

4. Memory Storage:

String literals are stored in:

String Constant Pool (SCP)

Example:

String s1 = "Raj";
String s2 = "Raj";

Both references point to same object in SCP.

Reason:
Java avoids duplicate objects to save memory.

----------------------------------------

5. Primitive vs Non Primitive

Primitive:

int a = 10;

10 → Integer Literal

Non Primitive:

String name = "Raj";

"Raj" → String Literal

----------------------------------------

6. Important Notes:

• String objects are immutable.
• String uses reference variables.
• String belongs to Heap Memory.
• String literals are stored inside String Pool.

========================================
*/