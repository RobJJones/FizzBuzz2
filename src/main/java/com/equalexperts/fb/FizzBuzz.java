package com.equalexperts.fb;

public class FizzBuzz {
 
  public static final int FIZZ_VALUE = 3;
  public static final int BUZZ_VALUE = 5;
  public static final int FIZZBUZZ_VALUE = 15;

  /** Convert fizzBuzzNumber to a given word when divisible by a certain number
   * or return the original number as a String.
   *
   * @param fizzBuzzNumber - Number to be converted to a word or returned as a String
   * @return Converted word or original number as a String.
   */
  static String convert(int fizzBuzzNumber){

    if (fizzBuzzNumber%FIZZBUZZ_VALUE==0) {
      return "fizzbuzz";
    } else if (fizzBuzzNumber%BUZZ_VALUE==0){
      return "buzz";
    } else if (fizzBuzzNumber%FIZZ_VALUE==0){
      return "fizz";
    }

    return String.valueOf(fizzBuzzNumber);
  }

  /** Convert a contiguous range of integers to a given word or
   * the original number, separated by spaces.
   *
   * @param start - Start of the range of integers
   * @param finish - End of the range of integers
   * @return Converted range as a String
   * @throws IllegalArgumentException when start is expected to be less or equal to finish
   */
   static String convertRange(int start, int finish) {

    if (start>finish) {
      throw new IllegalArgumentException("start is expected to be less or equal to finish.");
    }

    StringBuilder fizzBuzzBuilder = new StringBuilder();
    for (int count = start;count <= finish; count++) {
      fizzBuzzBuilder.append(convert(count));
      if (count<finish) fizzBuzzBuilder.append(' ');
    }

    return fizzBuzzBuilder.toString();
  }

  public static void runFizzBuzz(int start, int finish) {

    String fizzBuzzString = convertRange(start, finish);
    System.out.println(fizzBuzzString);
  }
}
