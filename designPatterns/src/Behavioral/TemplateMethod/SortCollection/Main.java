package Behavioral.TemplateMethod.SortCollection;
/*
 * @created 22/12/2023 - 07:53
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      List<Product> list = new ArrayList<>();
      list.add(new Product("Thuoc",1000,2));
      list.add(new Product("But",2000,2));
      list.add(new Product("Vu ngu",3000,2));
      list.add(new Product("Keo",1500,2));
      SortCollection<Product> sortCollection = new SortProductByPrice();
      sortCollection.sort(list);
      for(Product i: list){
         System.out.println(i.toString());
      }


   }
}
