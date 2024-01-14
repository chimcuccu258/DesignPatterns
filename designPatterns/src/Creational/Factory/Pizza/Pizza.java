package Creational.Factory.Pizza;
/*
 * @created 03/11/2023 - 09:10
 * @project designPatterns
 * @author TaosDev
 */

public abstract class Pizza {
   protected StringBuilder description = new StringBuilder();
   public abstract void prepare();
   public abstract void bake();
   public abstract void cut();
   public abstract void box();

   @Override
   public String toString() {
      return  description.toString();
   }
}
