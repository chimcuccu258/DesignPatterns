package Behavioral.Observer.Stream;
/*
 * @created 01/12/2023 - 07:41
 * @project designPatterns
 * @author TaosDev
 */

import java.util.List;

public class Main {
   public static void main(String[] args) {
      MyStream<List<MonHoc>> stream = new MyStream<>();

      DataAccess dataAccess = DataAccess.getInstance(stream);
      Client client = new Client(stream);

      dataAccess.add(new MonHoc("007", 3, "Design Patterns"));
      dataAccess.add(new MonHoc("008", 3, "ABC"));
   }
}
