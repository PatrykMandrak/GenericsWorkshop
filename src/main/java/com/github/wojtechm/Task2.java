package com.github.wojtechm;

/**
 * Generics!1!!
 * <p>
 * Below you have Task2 class. Make it Generic.
 * I want it to store 2 types. 'T' and 'S', that I
 * can declare however I want.
 *
 * @author Wojciech Makiela
 */
public class Task2 {

    // TODO - T and S fields


    // TODO - fix constructor - accept 2 variables - T and U

    public Task2() {
    }


    /*
    Do not read this part until you finish tasks above.


    Now something tricky. I want Task2 class to store an array of T's
    T[] ts = new T[10];
    Try changing Task2. Once you fail, continue reading ;)

    Each object in Java has a "class" which can be retrieved at runtime,
    using the .getClass() method. Arrays of different component types correspond
    to different array classes. So .getClass() called on an int array will
    return a different thing than .getClass() called on a String array.

    How does an object know its class? That's because it was provided
    when the object was created. The same applies for array objects.
    When you create an array, you must(!) specify the type of array, including
    an explicit component type. However, when you have a type variable like T,
    code that uses that type cannot know what type T is; and in fact,
    the point is that the code must work with any type in the place of T.
    That is why the class or method is said to be "generic".
    Thus you cannot create an array of T since you cannot provide the component
    type needed to create the array.

    Whoa. That's a lot of knowledge. You're doing great! (I hope)
    Last one thing before we leave generic arrays alone. Even though you cannot
    create array of generic type, you can create array of Objects, and cast it.
    T[] ts = (T[]) new Object[10];
    It's shady, but it works!... Still. Do not do that.


    Interesting fact:
    Generics have naming convention!
        E - Element (used extensively by the Java Collections Framework)
        K - Key
        N - Number
        T - Type
        V - Value
        S,U,V etc. - 2nd, 3rd, 4th types after T is used


     */
}
