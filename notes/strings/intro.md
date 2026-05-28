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

/*
========================================
Topic: String Intern Pool in Java
========================================

1. String literals are stored in String Intern Pool.

2. JVM reuses existing String objects to save memory.

3. Strings are immutable in Java.

4. String literal example:
       String s = "Raj";

5. new String() creates separate objects:
       String s = new String("Raj");

6. == compares references.
   equals() compares content.

7. StringBuilder and StringBuffer are mutable alternatives.

8. Benefits of String Pool:
   - Memory optimization
   - Better performance
   - Reduced object creation

9. Benefits of String immutability:
   - Security
   - Thread safety
   - Safe pooling
   - Hashcode caching

10. In automation frameworks, StringBuilder is preferred
    for dynamic string manipulations and report generation.
*/