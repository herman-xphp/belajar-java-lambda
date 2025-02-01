package muslim.dev.lambda.app;

import muslim.dev.lambda.SimpleAction;

public class SimpleActionApp {

  public static void main(String[] args) {

    // // Anonymous Function
    // SimpleAction simpleAction1 = new SimpleAction() {

    // @Override
    // public String action(String name) {
    // return "Anonymous";
    // }
    // };

    // System.out.println(simpleAction1.action("Herman"));

    // // Lambda
    // SimpleAction simpleAction2 = (String name) -> {
    // return "Lambda";
    // };

    // System.out.println(simpleAction2.action("Herman"));

    SimpleAction simpleAction1 = (String name) -> {
      return "Hello " + name;
    };

    SimpleAction simpleAction2 = (name) -> {
      return "Hello " + name;
    };

    SimpleAction simpleAction3 = (String name) -> "Hello " + name;

    SimpleAction simpleAction4 = (name) -> "Hello " + name;

    SimpleAction simpleAction5 = name -> "Hello " + name;
  }

}
