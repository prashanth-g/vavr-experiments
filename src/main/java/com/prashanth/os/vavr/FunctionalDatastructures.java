package com.prashanth.os.vavr;

import io.vavr.Tuple2;
import io.vavr.collection.List;
import io.vavr.collection.Queue;
import io.vavr.control.Option;

public class FunctionalDatastructures {

  public static void main(String[] args) {

    // functionalLinkedList();

    functionalQueue();
  }

  private static void functionalQueue() {
    /**
     * From Documentation
     *      Functional Queue can be implemented based on two linked Lists. The front
     *      List holds the elements that are dequeued, the rear List holds the elements that are enqueued.
     */
    Queue<Integer> queueA = Queue.of(1, 2, 3, 4, 5);
    // Deque it
    Tuple2<Integer, Queue<Integer>> tuple2A = queueA.dequeue();

    System.out.println(queueA);
    System.out.println(tuple2A._2());

    // Deque when Queue is empty
    Tuple2<Integer, Queue<Integer>> tuple2B = Queue.of(1).dequeue();
    Option<Tuple2<Integer, Queue<Integer>>> dequeEmpty =  tuple2B._2.dequeueOption();
    System.out.println(dequeEmpty.isDefined());

  }

  private static void functionalLinkedList() {
    /* Creates a immutable list of 5 elements */
    List<Integer> listA = List.of(1, 2, 3, 4, 5);

    List<Integer> listB = listA.tail().tail().append(6);
    /**
     *  1(listA head) -> 2 -> 3(listB head) -> 4 -> 5
     *                                                \
     *                                                  6
     */

    System.out.println("List A: " + listA);
    System.out.println("List A head: " + listA.head());
    System.out.println("List B head: " + listB.head());
    System.out.println("List B: " + listB);
  }
}
