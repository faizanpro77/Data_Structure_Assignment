package com.bridgelabz;

public class LinkedList<E> {

    public INode<E> head;
    public INode<E> tail;
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<E> node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            INode<E> tempNode = head;
            head = node;
            head.setNext(tempNode);
        }
    }

    public void append(INode<E> myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail != null) {
            this.tail.setNext(myNode);
        }
        this.tail = myNode;
    }

    public void insert(INode<E> myNode, INode<E> newNode) {
        INode<E> tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public void popFirstElement() {
       INode<E> tempNode  = head.getNext();
        head = tempNode;
    }

    public void popLastElement() {
        INode<E> currentNode = head;
        INode<E> previousNode = null;
        while (currentNode.getNext() != null) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        previousNode.setNext(null);
        tail = previousNode;
    }

    public boolean searchByElement(E key) {
        INode<E> tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if(tempNode.getNext().getKey().equals(key)){
                return true;
            }
        }
        return false;
    }


    public void printNodes() {
        INode<E> tempNode = head;
        while(tempNode.getNext() != null) {
            System.out.print(tempNode.getKey() + "->");
            tempNode = tempNode.getNext();
        }
        System.out.print(tempNode.getKey());
        System.out.println();
    }
}