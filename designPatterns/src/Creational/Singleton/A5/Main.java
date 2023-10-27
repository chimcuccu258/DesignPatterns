package Creational.Singleton.A5;

public class Main {
   public static void main(String[] args) {
      Book book = new Book.Builder()
              .setTitle("Design Patterns")
              .setAuthor("Nguyen Van Patterns")
              .setPages(100)
              .addChapter("Chapter 1")
              .addChapter("Chapter 2")
              .build();
      System.out.println(book.toString());
   }
}
