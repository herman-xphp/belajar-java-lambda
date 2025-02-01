package muslim.dev.lambda.app;

import java.util.Optional;

public class OptionalApp {

  public static void main(String[] args) {
    sayHallo("Herman");

    String name = null;

    sayHallo(name);
  }

  public static void sayHallo(String name) {

    // Optional lebih ringkas
    // Optional.ofNullable(name)
    // .map(String::toUpperCase)
    // // .ifPresent(value -> System.out.println("HELLO " + value));
    // .ifPresentOrElse(
    // value -> System.out.println("HELLO " + value),
    // () -> System.out.println("HELLO"));

    // Mengganti nilai nullnya menjadi string "TEMAN"
    String upperName = Optional.ofNullable(name)
        .map(String::toUpperCase)
        .orElse("TEMAN");

    System.out.println("HELLO " + upperName);

    // Optional manual
    Optional<String> optionalName = Optional.ofNullable(name);

    // anonymous class
    // optionalName.map(new Function<String, String>() {
    // @Override
    // public String apply(String value) {
    // return value.toUpperCase();
    // }
    // });

    // lambda
    Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());

    // anonymous class
    // optionalNameUpper.ifPresent(new Consumer<String>() {
    // @Override
    // public void accept(String value) {
    // System.out.println("HELLO " + value);
    // }
    // });

    // lambda
    optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + value));

    // if check null
    // if (name != null) {
    // String upperName = name.toUpperCase();
    // System.out.println("HELLO " + upperName);
    // }
  }

  // tidak menggunakan optional bisa error NullPointerException
  // public static void sayHallo(String name) {
  // String nameUpper = name.toUpperCase();
  // System.out.println("HELLO " + nameUpper);
  // }
}
