package Aufgabe_3;

import java.util.List;

public interface StackMethods<T> extends List {

    public void push(T element);
    public T pop();
}
