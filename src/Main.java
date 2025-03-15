public class Main {
  public static void main(String[] args) {
    // Vi skriver KUN denne linje i main.
    // Derved laves en INSTANS af klassen, så vi kan kalde ikke-static metoder på instansen.
    // SÅ slipper vi for at lave alting static, hvilket nemlig er noget rod.

    new Main().run();
  }

  private void run() {
    // Vi skriver al vores kode HER i stedet for i main(), som jo er static
    tilføjMøbel();
  }

  public void tilføjMøbel() {
    //
  }
}
