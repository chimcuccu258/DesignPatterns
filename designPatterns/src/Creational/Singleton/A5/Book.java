package Creational.Singleton.A5;

import java.util.ArrayList;
import java.util.List;

public class Book {
   String title;
   String author;
   int pages;
   List<String> chapters;

   public Book(Builder builder) {
      this.title = builder.title;
      this.author = builder.author;
      this.pages = builder.pages;
      this.chapters = builder.chapters;
   }

   public static class Builder {
      private String title;
      private String author;
      private int pages;
      private List<String> chapters = new ArrayList<>();

      Builder setTitle(String title) {
         this.title = title;
         return this;
      }

      Builder setAuthor(String author) {
         this.author = author;
         return this;
      }

      Builder setPages(int pages) {
         this.pages = pages;
         return this;
      }

      Builder addChapter(String c) {
         chapters.add(c);
         return this;
      }

      public Book build() {
         return new Book(this);
      }
   }

   @Override
   public String toString() {
      return "Book: \n" +
              "Title= " + title +
              ", \nAuthor= " + author +
              ", \nPages= " + pages +
              ", \nChapters= " + chapters;
   }
}
