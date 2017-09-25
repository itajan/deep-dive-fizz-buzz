package edu.cnm.deepdive.intro;

import javax.xml.bind.annotation.XmlType.DEFAULT;

/**
 * This class implements the FizzBuzz game, using an upper limit specified on the command line.
 *
 * @author itajan
 */
public class FizzBuzz {

  /** Default value for upper limit of count. */
  private static final int DEFAULT_LIMIT = 100;

  /**
   * Counts from 1 to the value specified on the command line (or 100
   * if not specified), printing out fizz/buzz/fizzbuzz number for each.
   *
   * @param args upper limit (default = 100)
   */
  public static void main(String[] args) {
    int limit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_LIMIT;
    for (int i = 1; i <= limit; i++) {
      System.out.println(computeResponse(i));
    }
  }


  /**
   * Computes and returns the appropriate fizz/buzz/fizzbuzz number value
   * for a given input value.
   * @param value input value
   * @return      fizz/buzz/fizzbuzz numeric response.
   */
  private static String computeResponse(int value) {
    String result = "";
    if (value % 3 == 0) {
      result += "fizz";
    }
    if (value % 5 == 0) {
      result +=  "buzz";
    }
    if(result.isEmpty()) {
      //result = Integer.toString(value);
      //result = ""+ value;
      //result = String.format("%d", value);
      result += value;
    }
    return result;
  }

}
