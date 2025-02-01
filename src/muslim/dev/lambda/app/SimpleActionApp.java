package muslim.dev.lambda.app;

import muslim.dev.lambda.SimpleAction;

public class SimpleActionApp {

  public static void main(String[] args) {

    // Anonymous Function
    SimpleAction simpleAction1 = new SimpleAction() {

      @Override
      public String action() {
        return "Anonymous";
      }
    };

    System.out.println(simpleAction1.action());

    // Lambda
    SimpleAction simpleAction2 = () -> {
      return "Lambda";
    };

    System.out.println(simpleAction2.action());
  }
}
