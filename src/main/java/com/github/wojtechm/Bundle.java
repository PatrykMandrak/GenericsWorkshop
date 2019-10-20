package com.github.wojtechm;

import java.util.List;

class Bundle<E, T> {
    private E fieldOfTypeE;
    private T fieldOfTypeT;
    private List<String> strings;

    Bundle(E parameterOfTypeE, T parameterOfTypeT, List<String> strings) {
        this.fieldOfTypeE = parameterOfTypeE;
        this.fieldOfTypeT = parameterOfTypeT;
        this.strings = strings;
    }

    public E getFirst() {
        return fieldOfTypeE;
    }

    public T getSecond() {
        return fieldOfTypeT;
    }

    public void fuck() {
        System.out.println("dupa");
    }

    public List<String> getStrings() {
        return strings;
    }
}
