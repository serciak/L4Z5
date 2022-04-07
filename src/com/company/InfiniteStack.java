package com.company;

public class InfiniteStack<T> implements StackInterface<T> {

    private int tempSize;
    private OneWayLinkedList<T> list;

    public InfiniteStack() {
        list = new OneWayLinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public T pop() throws EmptyStackException {
        if(tempSize == 0) throw new EmptyStackException();
        tempSize--;
        return list.remove(0);
    }

    @Override
    public void push(T elem) throws FullStackException {
        list.add(0, elem);
        tempSize++;
    }

    @Override
    public T top() throws EmptyStackException {
        if(tempSize == 0) throw new EmptyStackException();
        return list.get(0);
    }

    @Override
    public int size() {
        return tempSize;
    }
}
