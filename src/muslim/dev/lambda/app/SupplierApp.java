package muslim.dev.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {

  public static void main(String[] args) {

    // Supplier<String> supplier = new Supplier<String>() {

    // @Override
    // public String get() {
    // return "Herman";
    // }
    // };

    Supplier<String> supplier = () -> "Herman";

    System.out.println(supplier.get());
  }
}
