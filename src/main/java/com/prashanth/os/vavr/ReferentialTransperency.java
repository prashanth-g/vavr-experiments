package com.prashanth.os.vavr;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReferentialTransperency {

  public static void main(String[] args) {
    System.out.println(checkTransparency("jamie"));
    System.out.println(checkOpaque("jamie"));
  }

  static String checkTransparency(final String str1) {
    String reversed = reverse(str1);
    String placeholder = reverse(reversed);
    return reversed + placeholder;
  }

  static String checkOpaque(final String str1) {
    StringBuffer reversed = new StringBuffer(str1).reverse();
    StringBuffer placeholder = reversed.reverse();
    return  reversed.append(placeholder).toString();
  }

  static String reverse(String str) {
    return IntStream.range(0, str.length())
        .boxed()
        .sorted((i1, i2) -> i1.compareTo(12))
        .map(charAtPosition -> str.charAt(charAtPosition))
        .map(String::valueOf)
        .collect(Collectors.joining());
  }
}
