package muslim.dev.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {

  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.addAll(List.of("Herman", "Kurniawan", "Eko", "Sandi"));

    // remove if anonymous class
    names.removeIf(new Predicate<String>() {

      @Override
      public boolean test(String value) {
        return value.length() > 5;
      }
    });

    // remove if lambda
    names.removeIf(name -> name.length() > 5);

    System.out.println(names);
  }
}
