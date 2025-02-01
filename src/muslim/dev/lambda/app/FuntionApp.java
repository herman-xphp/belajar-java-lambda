package muslim.dev.lambda.app;

import java.util.function.Function;

public class FuntionApp {

  public static void main(String[] args) {

    // Function<String, Integer> functionLenght = new Function<String, Integer>() {

    // @Override
    // public Integer apply(String value) {
    // return value.length();
    // }
    // };

    Function<String, Integer> functionLenght1 = String::length;
    Function<String, Integer> functionLenght2 = value -> value.length();

    System.out.println(functionLenght1.apply("Herman"));
    System.out.println(functionLenght2.apply("Herman"));
  }
}
