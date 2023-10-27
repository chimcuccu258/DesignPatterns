package Creational.Singleton.A5;

public class Main {
   public static void main(String[] args) {
      Book book = new Book.Builder()
              .setTitle("Design Patterns")
              .setAuthor("abc")
              .setPages(100)
              .addChapter("abcd")
              .build();
      System.out.println(book.toString());
   }
}
