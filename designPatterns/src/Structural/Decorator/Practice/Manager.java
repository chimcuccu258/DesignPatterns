package Structural.Decorator.Practice;
/*
 * @created 05/01/2024 - 19:14
 * @project designPatterns
 * @author TaosDev
 */

public class Manager extends EmployeeDecorator{
   protected Manager(EmployeeComponent employee) {
      super(employee);
   }

   public void createRequirement() {
      System.out.println(this.employee.getName() + " is create requirements.");
   }

   public void assignTask() {
      System.out.println(this.employee.getName() + " is assigning tasks.");
   }

   public void manageProgress() {
      System.out.println(this.employee.getName() + " is managing the progress.");
   }

   @Override
   public void doTask() {
      employee.doTask();
      createRequirement();
      assignTask();
      manageProgress();
   }
}
