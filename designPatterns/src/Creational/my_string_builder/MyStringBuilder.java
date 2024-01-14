package Creational.my_string_builder;
/*
 * @created 03/11/2023 - 08:24
 * @project designPatterns
 * @author TaosDev
 */

public class MyStringBuilder {
   private String s = "";
   public MyStringBuilder addString(String sub){
      s += sub;
      return this;
   }

   public MyStringBuilder addFloat(float f){
      s += f;
      return this;
   }

   public MyStringBuilder addBool(boolean b){
      s += b;
      return this;
   }

   @Override
   public String toString() {
      return "MyStringBuilder" + s;
   }
}
