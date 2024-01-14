package Structural.Decorator.Practice;
/*
 * @created 05/01/2024 - 19:13
 * @project designPatterns
 * @author TaosDev
 */

import java.util.Date;

public abstract class EmployeeDecorator implements EmployeeComponent{

   protected EmployeeComponent employee;

   protected EmployeeDecorator(EmployeeComponent employee) {
      this.employee = employee;
   }

   @Override
   public String getName() {
      return employee.getName();
   }

   @Override
   public void join(Date joinDate) {
      employee.join(joinDate);
   }

   @Override
   public void terminate(Date terminateDate) {
      employee.terminate(terminateDate);
   }
}
