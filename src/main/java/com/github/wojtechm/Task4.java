package com.github.wojtechm;


/**
 * Bounded Parameters!
 * <p>
 * Let's say we have 3 classes: Person, Singer and ElvisPresley
 * Some people say, that Elvis is still alive, because he was cloned. Fair enough.
 * Our Elvis also will be cloneable.
 * <p>
 * Below you will find method 'cloneSinger'
 * Implement it ;)
 *
 * @author Wojciech Makiela
 */
public class Task4 {

    interface Cloneable<T> {
        T clone();
    }
    static class Person {
        private String name;
    }
    static class Singer extends Person {
        private String genre;
    }
    static class ElvisPresley extends Singer implements Cloneable<ElvisPresley> {

        private boolean isBestSinger = true;

        @Override
        public ElvisPresley clone() {
            return new ElvisPresley();
        }
    }

    public static void main(String[] args) {
        // Use main method for tests
//        cloneSinger(new Person());
//        cloneSinger(new Singer());
//        cloneSinger(new ElvisPresley());
    }

    private static Cloneable cloneSinger(Cloneable cloneable) {
        return (Cloneable) cloneable.clone();
        /*
        Look at that ugly cast! Why is it here?
        Delete '(Cloneable)' and read error description.

        'clone' method returns Object, not Cloneable. And it makes sense.
        If you take a look at our Cloneable interface declaration, you can see that 'T' might be anything.
        And since (almost) everything in Java is an Object, T is considered one as well.
        You can fix that by using 'extends' keyword!

        If you define Cloneable as 'Cloneable<T extends Cloneable>, You will be sure that clone method
        won't return anything that is not Cloneable.
        It makes sense to think, that if You clone something, then clone itself should be cloneable, doesn't it?

        Once You update Cloneable, this ugly cast won't be necessary... but we are not done here yet!
        Below you can see an example of parametrized method. You do that by defining new type (T) before return type.
        Now. Once you know how to define type in method, and how to use extends keyword with generics
        fix 'cloneSinger' method.
        'cloneSinger' should accept only parameters that are subtype of 'Singer',
        and that implement 'Cloneable' interface (with generics, we use 'extends' keyword
        for both classes and interfaces).

        
        HINT: Your generic type can extend more that one class. To do that, use '&' ;)


        // Bonus: check if you can call 'clone' method multiple times:
            return cloneable.clone().clone().clone().clone();
           if (youCan) {
                System.out.println("Great!");
           } else {
                System.out.println("Try to fix that");
           }
        */
    }

    private static <T> T returnT(T t) {
        return t;
    }
}
