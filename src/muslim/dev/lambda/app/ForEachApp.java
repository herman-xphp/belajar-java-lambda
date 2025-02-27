package muslim.dev.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {

  public static void main(String[] args) {

    List<String> list = List.of("Herman", "Rahmat", "Andito");

    // forEach
    for (var value : list) {
      System.out.println(value);
    }

    // anonymous class
    list.forEach(new Consumer<String>() {

      @Override
      public void accept(String value) {
        System.out.println(value);
      }
    });

    // lambda
    list.forEach(value -> System.out.println(value));

    // lambda method reference
    list.forEach(System.out::println);
  }
}
