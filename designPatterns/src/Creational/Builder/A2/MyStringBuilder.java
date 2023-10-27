package Creational.Builder.A2;

public class MyStringBuilder {
   private String str;

   public MyStringBuilder() {
      this.str = "";
   }

   public MyStringBuilder addString(String s) {
      this.str += s;
      return this;
   }

   public MyStringBuilder addFloat(float f) {
      this.str += String.valueOf(f);
      return this;
   }

   public MyStringBuilder addBool(boolean b) {
      this.str += String.valueOf(b);
      return this;
   }

   @Override
   public String toString() {
      return this.str;
   }
}
