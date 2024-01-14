package Behavioral.Observer.Stream;
/*
 * @created 01/12/2023 - 07:41
 * @project designPatterns
 * @author TaosDev
 */

import java.util.List;

public class Client implements MyStream.Listener<List<MonHoc>> {
   int count=0;
   public Client(MyStream<List<MonHoc>> myStream) { myStream.addListener(this);}
   @Override
   public void listen(List<MonHoc> monHocs) {
      System.out.println(++count);
      monHocs.forEach(monHoc -> {
         System.out.println(monHoc.toString());
      });
   }
}
