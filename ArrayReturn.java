package SAQE;
import java.io.*;

public class ArrayReturn {
    // Java Program to Illustrate Returning
// simple built-in arrays

// Importing input output classes
    // Main clas

        // Method 1
        // Main driver method
        public static int[] methodReturningArray()
        {
            int[] sample = { 1, 2, 3, 4 };

            // Return statement of the method.
            return sample;
        }
        public static void main(String[] args)
        {
            // An integer array storing the returned array
            // from the method
            int[] storage = methodReturningArray();

            // Printing the elements of the array
            for (int i = 0; i < storage.length; i++)
                System.out.print(storage[i] + " ");
        }

        // Method 2
        // Returning an integer array

}
