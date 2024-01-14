package Creational.Factory.Pizza;
/*
 * @created 03/11/2023 - 09:28
 * @project designPatterns
 * @author TaosDev
 */

import Creational.Factory.Pizza.VietNamPizza.VietnamePizzaStore;

public class Main {
   public static void main(String[] args) {
      PizzaStore pizzaStore = new VietnamePizzaStore();
      Pizza haiSan = pizzaStore.orderPizza(PizzaType.HAI_SAN);
      System.out.println(haiSan.toString());
   }
}
