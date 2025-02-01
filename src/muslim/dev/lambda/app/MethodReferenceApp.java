package muslim.dev.lambda.app;

import java.util.function.Function;
import java.util.function.Predicate;

import muslim.dev.lambda.util.StringUtil;

public class MethodReferenceApp {

  public static void main(String[] args) {

    // Predicate<String> predicateIsLowerCase = new Predicate<String>() {

    // @Override
    // public boolean test(String value) {
    // return StringUtil.isLowerCase(value);
    // }
    // };

    // Predicate<String> predicateIsLowerCase = value ->
    // StringUtil.isLowerCase(value);
    Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase; // Method Reference

    System.out.println(predicateIsLowerCase.test("herman"));
    System.out.println(predicateIsLowerCase.test("Herman"));

    // Method Reference di Parameter

    // Function<String, String> functionUpper = new Function<String, String>() {

    // @Override
    // public String apply(String value) {
    // return value.toUpperCase();
    // }
    // };

    // Function<String, String> functionUpper = (String value) ->
    // value.toUpperCase();
    Function<String, String> functionUpper = String::toUpperCase;

    System.out.println(functionUpper.apply("herman"));
  }

  public void run() {
    // Predicate<String> predicateIsLowerCase = new Predicate<String>() {

    // @Override
    // public boolean test(String value) {
    // return MethodReferenceApp.this.isLowerCase(value);
    // }
    // };

    Predicate<String> predicateIsLowerCase = this::isLowerCase;

    System.out.println(predicateIsLowerCase.test("Ahmad"));
    System.out.println(predicateIsLowerCase.test("ahmad"));
  }

  public void run2() {
    MethodReferenceApp methodReferenceApp = new MethodReferenceApp();

    Predicate<String> predicateIsLowerCase = methodReferenceApp::isLowerCase;

    System.out.println(predicateIsLowerCase.test("Ahmad"));
    System.out.println(predicateIsLowerCase.test("ahmad"));
  }

  public boolean isLowerCase(String value) {
    for (var c : value.toCharArray()) {
      if (!Character.isLowerCase(c)) {
        return false;
      }
    }
    return true;
  }
}
