package com.bridgelabz;

public class MyNode<E> {
    private E key;
    private MyNode<E> next;

    public MyNode(E key) {
        this.key = key;
        this.next = null;
    }

    public MyNode<E> getNext() {
        return next;
    }

    public  void  setNext(MyNode<E> next) {
        this.next = next;
    }
}
