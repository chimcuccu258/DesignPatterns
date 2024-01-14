package Structural.Decorator.Practice;
/*
 * @created 05/01/2024 - 19:14
 * @project designPatterns
 * @author TaosDev
 */

import java.util.Date;

public class Main {
   public static void main(String[] args) {
      // Tạo một nhân viên cơ bản
      System.out.println("NORMAL EMPLOYEE: ");
      EmployeeComponent employee = new EmployConcreteComponent("GPCoder");
      employee = new TeamLeader(employee);
      employee = new Manager(employee);
      employee = new TeamLeader(employee);
      //employee.showBasicInformation();
      employee.doTask();

        /*System.out.println("\nTEAM LEADER: ");
        EmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nMANAGER: ");
        EmployeeComponent manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();*/
   }
}
