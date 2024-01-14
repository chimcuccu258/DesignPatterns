package Creational.Factory.Pizza.VietNamPizza;
/*
 * @created 03/11/2023 - 09:22
 * @project designPatterns
 * @author TaosDev
 */

import Creational.Factory.Pizza.Pizza;

public class PizzaHaiSanVN extends Pizza {
   @Override
   public void prepare() {
      description.append("Chuan bi 4 con ca com\n");
   }

   @Override
   public void bake() {
      description.append("Nuong lo\n");
   }

   @Override
   public void cut() {
      description.append("Ca banh\n");
   }

   @Override
   public void box() {
      description.append("Dong hop\n");
   }

}
