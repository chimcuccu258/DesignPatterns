package Structural.Decorator.Practice;
/*
 * @created 05/01/2024 - 19:14
 * @project designPatterns
 * @author TaosDev
 */

public class TeamLeader extends EmployeeDecorator{
   protected TeamLeader(EmployeeComponent employee) {
      super(employee);
   }

   public void planing() {
      System.out.println(this.employee.getName() + " is planing.");
   }

   public void motivate() {
      System.out.println(this.employee.getName() + " is motivating his members.");
   }

   public void monitor() {
      System.out.println(this.employee.getName() + " is monitoring his members.");
   }

   @Override
   public void doTask() {
      employee.doTask();
      planing();
      motivate();
      monitor();
   }
}
