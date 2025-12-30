/**
 * Java program to use Queue collection with Dequeue instance.
 */
package com.mycollections;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating new collection
        Queue<Long> myQueue = new PriorityBlockingQueue<>();

        // Printing the size of the myQueue to console
        System.out.println("Size is " + myQueue.size());

        // Adding elements to the myQueue
        myQueue.add(3L);
        myQueue.add(6L);
        myQueue.add(18L);
        myQueue.add(9L);
        myQueue.add(12L);
        myQueue.add(11L);
        myQueue.add(21L);
        myQueue.add(24L);
        myQueue.add(27L);

        // Printing the size of the myQueue to console
        System.out.println("Size is " + myQueue.size());

        // Printing elements of the myQueue to console
        System.out.println(myQueue);

        // Printing the first element to console
        System.out.println(myQueue.element());

        // Checking if myQueue has element 2L
        System.out.println("There is element 2L: " + myQueue.contains(2L));

        // Checking if myQueue has element 9L
        System.out.println("There is element 9L: " + myQueue.contains(9L));

        // Checking if myQueue has element 21L
        System.out.println("There is element 21L: " + myQueue.contains(21L));

    }
}