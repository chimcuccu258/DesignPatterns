package Structural.Decorator.Practice;
/*
 * @created 05/01/2024 - 19:13
 * @project designPatterns
 * @author TaosDev
 */

import java.util.Date;

public class EmployConcreteComponent implements EmployeeComponent{
   private String name;

   public EmployConcreteComponent(String name) {
      this.name = name;
   }

   @Override
   public String getName() {
      return name;
   }

   @Override
   public void join(Date joinDate) {
      System.out.println(this.getName() + " joined on " + formatDate(joinDate));
   }

   @Override
   public void terminate(Date terminateDate) {
      System.out.println(this.getName() + " terminated on " + formatDate(terminateDate));
   }

   @Override
   public void doTask() {
      System.out.println("Concac");
   }
}
