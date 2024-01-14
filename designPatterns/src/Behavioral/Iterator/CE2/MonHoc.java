package Behavioral.Iterator.CE2;
/*
 * @created 05/01/2024 - 19:18
 * @project designPatterns
 * @author TaosDev
 */

public class MonHoc {
   String tenMonHoc;
   int soTC;
   int hocPhi;

   public MonHoc(String name, int soTC, int hocPhi) {
      this.tenMonHoc = name;
      this.soTC = soTC;
      this.hocPhi = hocPhi;
   }

   public String getTenMonHoc() {
      return tenMonHoc;
   }

   public void setTenMonHoc(String tenMonHoc) {
      this.tenMonHoc = tenMonHoc;
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
