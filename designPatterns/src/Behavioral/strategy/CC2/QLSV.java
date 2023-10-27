package Behavioral.strategy.CC2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QLSV {
   private ISoSanh<SinhVien> iSoSanh;

   public ISoSanh<SinhVien> getiSoSanh() {
      return iSoSanh;
   }

   public void setiSoSanh(ISoSanh<SinhVien> iSoSanh) {
      this.iSoSanh = iSoSanh;
   }

   List<SinhVien> dsSV = new ArrayList<>();
   public QLSV() {
      dsSV.add(new SinhVien("Tuyen", new Date(2003,5-1,2),(float) 7.0));
      dsSV.add(new SinhVien("Hue", new Date(2003,5-1,25),(float) 7.5));
      dsSV.add(new SinhVien("Dien", new Date(2003,8-1,8),(float) 7.0));
      dsSV.add(new SinhVien("Tan", new Date(2003,8-1,8),(float) 9.0));
      dsSV.add(new SinhVien("Hoa", new Date(2003,8-1,8),(float) 6.0));
   }
   public void inDS() {
      for (int i = 0; i < dsSV.size(); i++) {
         System.out.println(dsSV.get(i).hoTen + " " + dsSV.get(i).diemTB);
      }
   }
   public void sapXep(ISoSanh<SinhVien> soSanh) {
      for (int i = 0; i < dsSV.size() - 1; i++) {
         for (int j = i + 1; j < dsSV.size(); j++) {
            if (soSanh.soSanh(dsSV.get(i), dsSV.get(j)) > 0) {
               SinhVien temp = dsSV.get(i);
               dsSV.set(i, dsSV.get(j));
               dsSV.set(j, temp);
            }
         }
      }
   }
}
