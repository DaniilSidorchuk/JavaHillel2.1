package org.JavaHillel2.task33;

public class StringWorker {

    public static<T> T act(DoOnlyAction action, String s) {
        return (T) action.todo(s);
    }

}
