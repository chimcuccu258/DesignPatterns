package Behavioral.Observer.Stream;
/*
 * @created 01/12/2023 - 07:38
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
   private static DataAccess instance; // Biến duy nhất

   List<MonHoc> monHocs = new ArrayList<>();
   MyStream<List<MonHoc>> myStream;

   public DataAccess(MyStream<List<MonHoc>> myStream)
   {
      this.myStream = myStream;
   }
   public static DataAccess getInstance(MyStream<List<MonHoc>> myStream) {
      if (instance == null) {
         instance = new DataAccess(myStream);
      }
      return instance;
   }

   public void add(MonHoc m)
   {
      monHocs.add(m);
      myStream.addEvent(monHocs);
   }
}
