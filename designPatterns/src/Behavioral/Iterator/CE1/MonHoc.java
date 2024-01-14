package Behavioral.Iterator.CE1;
/*
 * @created 05/01/2024 - 18:10
 * @project designPatterns
 * @author TaosDev
 */

public class MonHoc {
   String name;
   int soTC;
   int hocPhi;

   public MonHoc(String name, int soTC, int hocPhi) {
      this.name = name;
      this.soTC = soTC;
      this.hocPhi = hocPhi;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getSoTC() {
      return soTC;
   }

   public void setSoTC(int soTC) {
      this.soTC = soTC;
   }

   public int getHocPhi() {
      return hocPhi;
   }

   public void setHocPhi(int hocPhi) {
      this.hocPhi = hocPhi;
   }
}
