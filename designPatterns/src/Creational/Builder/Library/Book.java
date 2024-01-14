package Creational.Builder.Library;
/*
 * @created 05/01/2024 - 19:08
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.List;

public class Book {
   private BookTitle bookTitle;
   List<String> ct ;

   public Book(Builder builder) {
      this.bookTitle = builder.bookTitle;
      this.ct = builder.ct;
   }

   @Override
   public String toString() {
      return bookTitle +
              "\n" + ct ;
   }

   public static class Builder{
      private BookTitle bookTitle;
      List<String> ct = new ArrayList<>();
      Builder setTitle(String tuaDe, String tacGia, int soTrang){
         bookTitle = new BookTitle(tuaDe,tacGia,soTrang);
         return this;
      }
      Builder addCT(String name){
         ct.add(name);
         return this;
      }
      public Book build(){
         return new Book(this);
      }
   }
}
