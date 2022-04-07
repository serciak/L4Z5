package com.company;

public interface StackInterface<T> {
    boolean isEmpty();
    boolean isFull();
    T pop() throws EmptyStackException;
    void push(T elem) throws FullStackException;
    T top() throws EmptyStackException;
    int size();
}
