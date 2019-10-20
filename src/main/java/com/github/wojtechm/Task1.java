package com.github.wojtechm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Times before generics
 * <p>
 * 1. Create NEW project and run Java 4 (this repo has code written in Java8, so you
 *    can't simply change version of this project)
 * 2. Copy and implement method workWithList()
 * 3. See that its bad
 * 4. Copy paste it back here - Java 8
 * 5. Make sure it still compiles
 * 6. Implement method workWithGenericList()
 * 7. Compare implementations
 * 8. Read summary below
 *
 * @author Wojciech Makiela
 */
public class Task1 {

    public static void main(String[] args) {
        //workWithList();
        workWithGenericList();
        testBundleClassForTask2();
    }

    private static void testBundleClassForTask2() {
        List<String> strings = Arrays.asList("a", "b", "c");
        Bundle<String, Integer> b = new Bundle<>("first", 2, strings);
        assert b.getFirst().equals("first");
        assert b.getSecond() == 2;
        assert strings == b.getStrings();
    }

    static void workWithList() {
        // Create new list, and call it 'strings'
        List strings = new ArrayList();

        // Add strings 'first' and 'second' to your list
        strings.add("first");
        strings.add("second");

        // Be a naughty boy/girl, and add an Integer '3'
        strings.add(new Integer(3));

        // I know it looks bad, but keep going
        // Get first element from your list, and assign it
        // to a variable of type String
        String s = (String) strings.get(0);

        // Do the same for last element
        String s2 = (String) strings.get(2);
        // Run the method
    }

    static void workWithGenericList() {
        // Create new list of type <String>, and call it 'strings'
        List<String> strings = new ArrayList<>();

        // Add strings 'first' and 'second' to your list
        strings.add("first");
        strings.add("second");

        // Be a naughty boy/girl, and add an Integer '3'
        //strings.add(3);

        // Hah! Compile error!
        // Comment that line so it compiles again

        // Get first element from your list, and assign it
        // to a variable of type String
        String first = strings.get(0);

        // Run the method
    }

    /** SUMMARY:
     * Before you start reading, make sure you have finished first 7 steps listed above class declaration
     *
     * Now you should have 2 similar implementations. One that uses Generics, and one that does not.
     * If you couldn't implement first method in plain Java4 style (because of reasons i guess),
     * then feel free to copy-paste it from 'java4Code.txt' file available in resources folder.
     *
     * Quick info: I'll keep talking about lists only, but same rules apply to all collections in java.
     *
     * As you already know - before Java 1.5 (in which generics were introduced)
     * all lists were lists of objects.
     * There was no type check at compile time, so you could add anything to any list.
     * When retrieving data from list you had to use casts that might fail.
     *
     * Generics allow us to define type of elements stored in list. Information about type allows compiler
     * to do checks for us in compile, effectively reducing number of class cast exceptions.
     *
     * How it works?
     */
    private static void howItWorks() {
        // <String> tells compiler that we want to store only Strings in given list
        List<String> strings = new ArrayList<>();

        // Having information about type, it checks variables that are being added to a list
        // and prevents adding anything of different type.
        strings.add("first");
//        strings.add(3); // Compiler error

        // Retrieving data before generics required manual casting
        // Now compiler knows type of variables in list, so it 'adds' casts in compile time
        // After all, cast still exists in bytecode, but it's not in source code
        // This makes code cleaner and easier to understand
        String first = strings.get(0);
    }
}
