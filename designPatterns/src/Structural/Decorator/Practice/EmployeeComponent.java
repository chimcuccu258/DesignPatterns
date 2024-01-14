package Structural.Decorator.Practice;
/*
 * @created 05/01/2024 - 19:13
 * @project designPatterns
 * @author TaosDev
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public interface EmployeeComponent {
   String getName();

   void doTask();

   void join(Date joinDate);

   void terminate(Date terminateDate);

   default String formatDate(Date theDate) {
      DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      return sdf.format(theDate);
   }

   default void showBasicInformation() {
      System.out.println("-------");
      System.out.println("The basic information of " + getName());

      join(Calendar.getInstance().getTime());

      Calendar terminateDate = Calendar.getInstance();
      terminateDate.add(Calendar.MONTH, 6);
      terminate(terminateDate.getTime());
   }
}
