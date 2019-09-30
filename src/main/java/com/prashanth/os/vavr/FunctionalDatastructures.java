package com.prashanth.os.vavr;
import io.vavr.collection.List;

public class FunctionalDatastructures {

  public static void main(String[] args) {

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
