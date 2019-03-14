package com.github.wojtechm;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

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

        ElvisPresley() {
            super("Rock n' Roll");
        }

        @Override
        public ElvisPresley clone() {
            return new ElvisPresley();
        }
    }

    public static void main(String[] args) {

        /*
        We already had method that accepts any type of Singer
        Now, lets update the way it behaves.
         */

        Consumer<Singer> convertToKPopSinger = singer -> singer.genre = "KPop";
        List<Singer> singers = Arrays.asList(new ElvisPresley());
        workWithSingers(singers, convertToKPopSinger);
        System.out.println(singers.get(0).genre); // Elvis is now KPop king! Oh no!

        /*
        Quick info about Consumer
        It accepts parameter of given type (Singer in this case), and processes it in one way or another
        You do not need to know anything else at this moment
         */

        // But here's the problem
        Consumer<Object> print = System.out::println;
        singers = Arrays.asList(new ElvisPresley()); // Back to old, Rock n roll Elvis
//        workWithSingers(singers, print); // Compile error! Uncomment to check it out!

        /*
            I know that Singer can be printed.
            You know that too.
            But the compiler does not.
            It expects Consumer of Singers, not a Consumer of Objects.
            What to do now? <T extends Singer>? Maybe <?>?.
            Damn it. It's not working! What to do, what to do...
            If we use 'extends', it's expecting a subclass of a Singer. But we don't need a subclass.
            We need a super class!


            For now, you were using 'extends' only - defining an "Upper Bound" of type.
            Or in other words, You were defining the 'highest' class in inheritance/family tree

                Object
                   |
                Person
                   |
                Singer
                   |
                Presley

            But now we need something above Singer, not below. In order to define "Lower Bound"
            You must use 'super' keyword!
            I'll let you figure out how to do that
         */
    }

    private static void workWithSingers(List<? extends Singer> singers, Consumer<Singer> consumer) {
        for (Singer singer : singers) {
            consumer.accept(singer);
        }
    }
}
