package com.github.wojtechm;


import java.util.Arrays;
import java.util.List;

/**
 * Bounded Parameters part 2!
 *
 * Now. We have army of Singers!
 * Lets do something with that ;)
 *
 *
 * @author Wojciech Makiela
 */
public class Task5 {

    // Yeah. I know. Copy-paste development.
    // BUT! New methods are were introduced! Take a look
    interface Cloneable<T> {T clone();}
    static class Person {private String name;}
    static class Singer extends Person {private String genre;

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
        List<Singer> singers = Arrays.asList(new Singer("Rock"), new Singer("Blues"));
        workWithSingers(singers);
//        List<ElvisPresley> presleyList = Arrays.asList(new ElvisPresley("Rock'n'Roll"));
//        workWithSingers(presleyList);
        /*
        So... Even though Elvis is a Singer, you cannot pass List<ElvisPresley> to workWithSingers method
        It's because List<Elvis> is NOT a subtype of List<Singer>. Why? Consider following code

            List<Integer> ints = Arrays.asList(1, 2);
            List<Numeric> nums = ints;
            nums.add(3.14);
            ints.toString().equals("1, 2, 3.14");

        Assigning list of ints to List<Numeric> variable is illegal, because this might lead to
        breaking initial list - list of ints having double in it.

        Same goes with List<ElvisPresley>. We don't want Lady Gaga in that list.
         */
    }

    private static void workWithSingers(List<Singer> singers) {
        for(Singer singer : singers) {
            System.out.println(singer);
        }
    }
}
