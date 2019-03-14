package com.github.wojtechm;


import java.util.List;

/**
 * Bounded Parameters! Part 2!
 * <p>
 * Now.
 * We have army of Singers!
 * We know how to use them!
 * <p>
 * Time to do something ;)
 *
 * @author Wojciech Makiela
 */
public class Task6 {

    interface Cloneable<T> {
        T clone();
    }
    static class Person {
        private String name;
    }
    static class Singer extends Person {
        private String genre;

        Singer(String genre) {
            this.genre = genre;
        }

        @Override
        public String toString() {
            return "Singer{" +
                    "genre='" + genre + '\'' +
                    '}';
        }
    }
    static class ElvisPresley extends Singer implements Cloneable<ElvisPresley> {
        private boolean isBestSinger = true;

        ElvisPresley(String genre) {
            super(genre);
        }

        @Override
        public ElvisPresley clone() {
            return new ElvisPresley(super.genre);
        }
    }

    public static void main(String[] args) {

    }

    private static void workWithSingers(List<? extends Singer> singers) {
        for (Singer singer : singers) {
            System.out.println(singer);
        }
    }
}
