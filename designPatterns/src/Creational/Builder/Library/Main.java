package Creational.Builder.Library;
/*
 * @created 05/01/2024 - 19:08
 * @project designPatterns
 * @author TaosDev
 */

public class Main {
   public static void main(String[] args) {
      Book book= new Book.Builder()
              .setTitle("Cuộc sống của vũ ngu","Vũ ngu",42)
              .addCT("Chapter 1: Vũ ngu sống thế nào?")
              .addCT("Chapter 2: Vũ ngu ăn gì?")
              .build();
      System.out.println(book.toString());
   }
}
