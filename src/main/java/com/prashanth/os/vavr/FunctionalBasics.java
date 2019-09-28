package com.prashanth.os.vavr;

import io.vavr.control.Try;

public class FunctionalBasics {

  public static void main(String[] args) {
    System.out.println(divide(1,0));
  }

  static Try<Integer> divide(Integer dividend, Integer divisor) {
    return Try.of(() -> dividend / divisor);
  }
}
