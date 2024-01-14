package Creational.Factory.Pizza;
/*
 * @created 03/11/2023 - 09:10
 * @project designPatterns
 * @author TaosDev
 */

public abstract class PizzaStore {
   protected abstract Pizza createPizza(PizzaType type);
   public Pizza orderPizza(PizzaType type){
      Pizza pizza63 = createPizza(type);
      pizza63.prepare();
      pizza63.bake();
      pizza63.cut();
      pizza63.box();
      return pizza63;
   }
}
