package Behavioral.Observer.Stream;
/*
 * @created 01/12/2023 - 07:41
 * @project designPatterns
 * @author TaosDev
 */

public class MonHoc {
   private String tenMonHoc;
   private int soTinChi;
   private String giangVien;

   public MonHoc( String tenMonHoc, int soTinChi, String giangVien) {
      this.tenMonHoc = tenMonHoc;
      this.soTinChi = soTinChi;
      this.giangVien = giangVien;
   }

   @Override
   public String toString() {
      return "\ttenMonHoc = " + tenMonHoc +
              "\n\tsoTinChi = " + soTinChi +
              "\n\tgiangVien = " + giangVien;
   }
}
