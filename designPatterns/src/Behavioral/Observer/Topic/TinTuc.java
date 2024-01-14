package Behavioral.Observer.Topic;
/*
 * @created 05/01/2024 - 18:54
 * @project designPatterns
 * @author TaosDev
 */

public class TinTuc {
   int id;
   String noiDung;

   public TinTuc(int id, String noiDung) {
      this.id = id;
      this.noiDung = noiDung;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNoiDung() {
      return noiDung;
   }

   public void setNoiDung(String noiDung) {
      this.noiDung = noiDung;
   }
}
