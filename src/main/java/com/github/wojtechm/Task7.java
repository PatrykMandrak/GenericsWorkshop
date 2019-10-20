package com.github.wojtechm;

/**
 * Time for a Test!
 *
 */
public class Task7 {
    /*
        1. What Are Some Advantages of Using Generic Types?
        : less code duplicates, there is no need to create same logic class for different types,
        code is cleaner and it's easier to read (f.e no need for casts), there is less chance for runtime errors like
        ClassCastException.

        2. What is Type Erasure?
        : Type Erasure occurs because of Java Backward compatibility, JVM at runtime doesn't know anything about
        generics because during compilation remove any information about generics type.
        Compilation process is changing generics types to Objects.

        3. If a Generic Type is Omitted When Instantiating an Object, will the Code Still Compile?
        Yes, backward compatibility.

        4. What is a Bounded Type Parameter? How can be Type Parameter Bounded?
        Bounded Type Parameter is parameter that needs to extends some other class that we provide using "extends"
        or "super" keyword.

        5. Is it Possible to Declared a Multiple Bounded Type Parameter?
        Yes.

        6. Will the following class compile? If not, why?

            public final class Algorithm {
                public static <T> T max(T x, T y) {
                    return x > y ? x : y;
                }
            }

            No, we compare same Object with for example ">"

        7. Will the following class compile? If not, why?
            public class Singleton<T> {

                public static T getInstance() {
                    if (instance == null)
                        instance = new Singleton<T>();

                    return instance;
                }

                private static T instance = null;
            }

            No, u can get T type from static context

        8. Can You Pass List<String> To A Method Which Accepts List<Object>?

        No, compile error
     */
}
