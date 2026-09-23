# Non-programming Assignment
## Bit and Byte
- Bit is a memory size of one binary memory cell that can take values of either 0 or 1.
- 1 Byte euqals 8 bits, and can take binary values in the range of 2^8 from 0 to 255.
- eg. bit: 0 or 1.
Byte:The decimal number 65 is represented in a one-byte binary code as 01000001 02^7 + 12^6 + 02^5 + 02^4 + 02^3 + 02^2 + 02^1 + 12^0 = 65。
## Types and Variables
- Types: A type acts as instructions telling the computer how much memory to allocate and how to interpret that binary code. It does not allocate any memory itself.
- Variables: A variable is an instance of a type that actually allocates the required memory space to hold a value.
- Relationship: A variable is an instance created from a specific data type.
- Difference: A type is a declaration and template (no memory allocation), while a variable is a concrete entity (allocates memory).
- eg. Type: int tells the system to allocate 4 bytes for integer operations. Variable: int x = 10; allowcates 4 bytes of memory named x and stores 10.
## Local and Instance Variables
- Local Variables:Created inside a method or block(between {} brackets)and are automatically destroyed when exiting that block. They are only accessible within that specific block.
- eg.
```java
public static void main(String[] args) {
    String firstName = "Scott"; // Local variable
  }
```
- Instance Variables: Also known as non-static variables, they are declared inside a class but outside any methods. They require creating an object to exist, and every object gets its own copy.
- eg.
```java
public class MyClass {
public String firstName; // Instance variable
}
  ```
- Key Differences: Local variables exist only during method execution, whereas instance variables are tied to a class object's lifespan.
## Class (Static) Variables and properties
- Variables declared with the static keyword inside a class but outside methods.
- Properties:They are created at the beginning of the program and eliminated only when the program ends. They are shared across all instances of that class, meaning they remain the same and are not duplicated per object. Their default value is zero, though it is best practice to explicitly set an initial value.
- eg. public static String treatment = "Mr./Mrs.";
## Mutable and immutable variables
- Mutable Variables: are variables or fields whose values can be modified after the object has been created often using update methods like setName.
- Immutable Variables: These are variables whose values cannot be changed or modified after the object is created often restricted using keywords like final in Java.
- Mutable variables can be updated freely over time, whereas immutable variables are permanent once initialized.
## Classes and objects
- Class: A class is a blueprint or template that describes the data structures (attributes) and behaviors (methods) of an entity.
- Object: An object is an actual implementation or instance of a class that holds specific states and behaviors.
- Relationship and difference: A class is just an abstract design (like a blueprint), while an object is the physical or virtual reality built from that design. You can create multiple objects from a single class.
- eg. A human class defines what a human is, while your friend Tom is an actual object created from that class.
