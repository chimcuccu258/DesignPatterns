package Behavioral.Strategy.CC2;

import java.util.Date;

public class Main {
   public static void main(String[] args) {
      QLSV qlsv = new QLSV();
      qlsv.ds.add(new SinhVien("SinhVien3", new Date(), 8.5f));
      qlsv.ds.add(new SinhVien("SinhVien2", new Date(), 7.8f));
      qlsv.ds.add(new SinhVien("SinhVien6", new Date(), 9.2f));
      qlsv.sapXep(new SoSanhTheoDiem());
      qlsv.inDS();
      System.out.println("DS");
      qlsv.sapXep(new SoSanhTheoTen());
      qlsv.inDS();
   }
}
