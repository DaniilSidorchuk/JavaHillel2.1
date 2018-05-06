package org.JavaHillel2.task33;


@FunctionalInterface
public interface DoOnlyAction<T> {
    T todo(String s);
}
