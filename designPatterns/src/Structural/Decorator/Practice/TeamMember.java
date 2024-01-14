package Structural.Decorator.Practice;
/*
 * @created 05/01/2024 - 19:14
 * @project designPatterns
 * @author TaosDev
 */

public class TeamMember extends EmployeeDecorator{
   protected TeamMember(EmployeeComponent employee) {
      super(employee);
   }

   public void reportTask() {
      System.out.println(this.employee.getName() + " is reporting his assigned tasks.");
   }

   public void coordinateWithOthers() {
      System.out.println(this.employee.getName() + " is coordinating with other members of his team.");
   }

   @Override
   public void doTask() {
      employee.doTask();
      reportTask();
      coordinateWithOthers();
   }
}
