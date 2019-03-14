package com.github.wojtechm;


/**
 * Bounded Parameters!
 *
 * Let's say we have 3 classes: Person, Singer and ElvisPresley
 * Some people say, that Elvis is still alive, because he was cloned. Fair enough.
 * Our Elvis also will be cloneable.
 *
 * Below you will find method 'cloneSinger'
 * Implement it ;)
 *
 * @author Wojciech Makiela
 */
public class Task4 {

    private interface Cloneable<T> {T clone();}
    private static class Person {private String name;}
    private static class Singer extends Person {private String genre;}
    private static class ElvisPresley extends Singer implements Cloneable<ElvisPresley> {

        private boolean isBestSinger = true;

        @Override
        public ElvisPresley clone() {
            return new ElvisPresley();
        }
    }

    public static void main(String[] args) {
        // Use main method for tests
        cloneSinger(new ElvisPresley());
    }

    private static Cloneable cloneSinger(Cloneable cloneable) {
        return (Cloneable) cloneable.clone();
        // Look at that ugly cast! Why is it here?
        // Delete '(Cloneable)' and read error description.
    }
}
