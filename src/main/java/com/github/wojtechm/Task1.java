package com.github.wojtechm;

/**
 * Times before generics
 * <p>
 * 1. Run java 4
 * 2. Implement method workWithList()
 * 3. See that its bad
 * 4. Jump back to java 8+
 * 5. Make sure it still compiles
 * 6. Implement method workWithGenericList()
 * 7. Compare implementations
 *
 * @author Wojciech Makiela
 */
public class Task1 {

    public static void main(String[] args) {
//        workWithList();
//        workWithGenericList();
    }

    static void workWithList() {
        // Create new list, and call it 'strings'

        // Add strings 'first' and 'second' to your list


        // Be a naughty boy/girl, and add an Integer '3'

        // I know it looks bad, but keep going
        // Get first element from your list, and assign it
        // to a variable of type String

        // Do the same for last element

        // Run the method
    }

    static void workWithGenericList() {
        // Create new list of type <String>, and call it 'strings'

        // Add strings 'first' and 'second' to your list


        // Be a naughty boy/girl, and add an Integer '3'

        // Hah! Compile error! Comment your 'addInt' line
        // Get first element from your list, and assign it
        // to a variable of type String

        // No casts!
        // Run the method
    }
}
