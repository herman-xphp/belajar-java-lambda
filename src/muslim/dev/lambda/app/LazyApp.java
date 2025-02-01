package muslim.dev.lambda.app;

import java.util.function.Supplier;

public class LazyApp {

  public static void main(String[] args) {
    testScore(70, () -> getName());
  }

  // lazy
  public static void testScore(int score, Supplier<String> name) {
    if (score > 80) {
      System.out.println("Selamat " + name.get() + ", Anda Lulus");
    } else {
      System.out.println("Coba Lagi Tahun Depan");
    }
  }

  // egger
  // public static void testScore(int score, String name) {
  // if (score > 80) {
  // System.out.println("Selamat " + name + ", Anda Lulus");
  // } else {
  // System.out.println("Coba Lagi Tahun Depan");
  // }
  // }

  public static String getName() {
    System.out.println("Method getName() dipanggil");
    return "Herman";
  }
}
