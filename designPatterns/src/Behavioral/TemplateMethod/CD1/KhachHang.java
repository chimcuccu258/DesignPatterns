package Behavioral.TemplateMethod.CD1;
/*
 * @created 22/12/2023 - 09:07
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.List;

public abstract class KhachHang {
   List<MatHang> dsHangHoa = new ArrayList<>();

   public KhachHang(List<MatHang> dsHangHoa) {
      this.dsHangHoa = dsHangHoa;
   }
   public float tinhTien() {
      float tongTien = 0;
      for (MatHang mh : dsHangHoa) {
         tongTien += mh.getSoLuong() * mh.getDonGia();
      }
      return (float) tongTien;
   }
   abstract protected float tinhChietKhau(float tong);
   public void hienThiGioHang() {
      System.out.println("Danh sách mặt hàng:");
      for (MatHang mh : dsHangHoa) {
         System.out.println(mh);
      }
      float tongTien = tinhTien();
      System.out.println("Tổng tiền: " + tongTien);
      float chietKhau = tinhChietKhau(tongTien);
      System.out.println("Chiết khấu: " + chietKhau);
      System.out.println("Thành tiền: " + (tongTien - chietKhau));
   }


}
