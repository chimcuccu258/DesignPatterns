package Behavioral.TemplateMethod.Entity;
/*
 * @created 05/01/2024 - 19:03
 * @project designPatterns
 * @author TaosDev
 */

public class MyObject {
   private int id;

   public MyObject() {
      // Constructor không tham số để khởi tạo giá trị cho id
   }

   public int getId() {
      return id;
   }

   public MyObject(int id) {
      this.id = id;
   }
}
