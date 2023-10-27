package Creational.Builder.A2;

public class Main {
   public static void main(String[] args) {
      MyStringBuilder myStringBuilder = new MyStringBuilder()
              .addString("Hello, ")
              .addString("world!")
              .addFloat(3.14f)
              .addBool(true);

      System.out.println(myStringBuilder.toString());
   }
}
