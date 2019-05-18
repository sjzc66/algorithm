package com.sjzc.javaTest.arrayTest;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 11:01 2019/5/8
 */
final public class ArrayImpl<T> implements Array<T> {
    private static final Array EMPTY_ARRAY = new ArrayImpl(Collections.emptyList());
    private final List<T> elements;

    ArrayImpl(List<T> elements) {
        this.elements = Collections.unmodifiableList(elements);
    }

    final public T head(){
        if (elements.isEmpty()) {
            throw new NoSuchElementException();
        }
        return elements.get(0);
    }

    final public Array<T> rest(){
        if (elements.isEmpty()) {
            return EMPTY_ARRAY;
        }
        return new ArrayImpl<T>(elements.subList(1, elements.size()));
    }

    final public boolean isEmpty() {
        return elements.isEmpty();
    }
}
