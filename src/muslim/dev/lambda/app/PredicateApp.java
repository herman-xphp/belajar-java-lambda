package muslim.dev.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {

  public static void main(String[] args) {

    // Predicate<String> predicateCheckBlank = new Predicate<String>() {

    // @Override
    // public boolean test(String t) {
    // return t.isBlank();
    // }
    // };

    Predicate<String> predicateCheckBlank1 = String::isBlank;
    Predicate<String> predicateCheckBlank2 = value -> value.isBlank();

    System.out.println(predicateCheckBlank1.test(""));
    System.out.println(predicateCheckBlank1.test("Herman"));

    System.out.println(predicateCheckBlank2.test(""));
    System.out.println(predicateCheckBlank2.test("Herman"));
  }
}
