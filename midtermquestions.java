/* Problem 5 of 5 (8 pts.)
Assume you have ClassN - see partial definition of class below.
﻿﻿﻿Add code to the class that will allow you to write objects of that class into a file in binary mode. Hint: interface.
﻿﻿﻿Write a segment of code that creates an array of 10 objects of type ClassN in main. Fill the array with objects, calling constructor with all arguments set to 5. Then open file named "data.dat" for writing binary data and write the array of objects into the file.
Make sure to handle all the exceptions by printing out error messages for the user to see.
There is no need to write the header of main method. Do not forget to close the file. public class ClassN */
/* some code */
public ClassN() (/*some code*/}
public ClassN(int one, int two, double three) i/*some code* /} / the rest of the public methods are not shown

// Ensure ClassN implements Serializable
public class ClassN implements Serializable {
    private static final long serialVersionUID = 1L; // Add a serialVersionUID for serialization
    
    private int one;
    private int two;
    private double three;
    
    // Constructors
    public ClassN() {
        // some code
    }

    public ClassN(int one, int two, double three) {
        this.one = one;
        this.two = two;
        this.three = three;
        // some code
    }

    // The rest of the public methods are not shown
}

public class Main {
    public static void main(String[] args) {
        // Create an array of 10 objects of type ClassN
        ClassN[] array = new ClassN[10];
        
        // Fill the array with objects, calling constructor with all arguments set to 5
        for (int i = 0; i < array.length; i++) {
            array[i] = new ClassN(5, 5, 5.0);
        }
        
        // Open file named "data.dat" for writing binary data and write the array of objects into the file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"))) {
            oos.writeObject(array);
        } catch (IOException e) {
            // Handle all exceptions by printing out error messages for the user to see
            System.err.println("Error writing to file: " + e.getMessage());
        }
        
        // Close the file is automatically handled by try-with-resources
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/* Problem 4 of 5 (12 pts.)
( pts.) Implement method
public static void replace (BaseClass(] array, BaseClass k, BaseClass n).
The method takes an array of objects and two objects of BaseClass type. The method finds all occurrences of object k in the array and replaces them with copies of object n. The method throws custom BaseClass/Null Exception if any object in array or objects k or n happened to be a null.
2 (5 pts.) Implement a custom unchecked exception BaseClass/Null Exception class. It must have two constructors: a no-argument constructor and a constructor that takes a message as parameter.


1. Implement BaseClassNullException */
public class BaseClassNullException extends RuntimeException {
    // No-argument constructor
    public BaseClassNullException() {
        super();
    }

    // Constructor that takes a message as a parameter
    public BaseClassNullException(String message) {
        super(message);
    }
}


/* 2. Implement the replace Method */
public class BaseClass {
    // Assume necessary fields, constructors, and methods are defined here
    // Example of a copy constructor
    public BaseClass(BaseClass other) {
        // Copy the fields from the other object
    }
}

public class Utility {
    public static void replace(BaseClass[] array, BaseClass k, BaseClass n) {
        // Check if array, k, or n are null
        if (array == null || k == null || n == null) {
            throw new BaseClassNullException("Array or one of the objects (k, n) is null.");
        }

        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                throw new BaseClassNullException("Array contains null element at index " + i);
            }

            // Replace occurrences of k with copies of n
            if (array[i].equals(k)) {
                array[i] = new BaseClass(n); // Assuming BaseClass has a copy constructor
            }
        }
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
Question 14: If two methods have the same name but different signatures, they are:

Answer: D) Overloaded

Question 15: If a class contains an abstract method:

Answer: C) you can't create an instance of the class

Question 16: Given the following code, which of the following is TRUE:

Answer: D) ClassB must override each method in ClassA

Question 17: All fields declared in an interface:

Answer: B) are final and static

Question 7: To compare two objects in a class:

Answer: A) write an equals method that will make a field by field comparison of the two objects

Question 8: A deep copy of an object:

Answer: A) will have its own copy of all the fields of the original object

Question 9: The term for the relationship between a class and an aggregate object, or the objects a superclass and a subclass:

Answer: D) sub-class object

Question 10: If you attempt to perform an operation with a null reference variable:

Answer: D) the program will terminate and an exception will be thrown

Question 11: When an "is-a" relationship exists between objects, it means that the specialized object has:

Answer: B) all the characteristics of the general object, plus additional characteristics

Question 12: Which of the following statements declares Salaried as a subclass of PayType:

Answer: A) public class Salaried extends PayType

Question 13: What key word can you use to call a superclass constructor explicitly?

Answer: B) super   */
