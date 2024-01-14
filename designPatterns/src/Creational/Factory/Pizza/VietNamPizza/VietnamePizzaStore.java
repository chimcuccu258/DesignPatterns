package Creational.Factory.Pizza.VietNamPizza;
/*
 * @created 03/11/2023 - 09:18
 * @project designPatterns
 * @author TaosDev
 */

import Creational.Factory.Pizza.Pizza;
import Creational.Factory.Pizza.PizzaStore;
import Creational.Factory.Pizza.PizzaType;

public class VietnamePizzaStore extends PizzaStore {
   @Override
   protected Pizza createPizza(PizzaType type) {
      switch (type) {
         case HAI_SAN ->  {
            return new PizzaHaiSanVN();
         }
      }
      return null;
   }
}
