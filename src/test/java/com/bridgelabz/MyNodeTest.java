package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void givenNumber_whenLinked_returnTrue() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);

        boolean status = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
        Assert.assertTrue(status);

    }
}
