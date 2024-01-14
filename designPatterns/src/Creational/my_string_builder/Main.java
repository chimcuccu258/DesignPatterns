package Creational.my_string_builder;
/*
 * @created 03/11/2023 - 08:36
 * @project designPatterns
 * @author TaosDev
 */

public class Main {
   public static void main(String[] args) {
      MyStringBuilder myStringBuilder = new MyStringBuilder()
              .addString("\nHello")
              .addFloat(1.2f)
              .addBool(true);
      System.out.println(myStringBuilder);
   }
}
