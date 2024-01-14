package Behavioral.Strategy.CC3;
/*
 * @created 05/01/2024 - 18:59
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.List;

public class GioHang {
   private List<MatHang> items;
   private IThanhToan thanhToan;
   private IVanChuyen vanChuyen;
   private IKhuyenMai khuyenMai;

   public GioHang() {
      items = new ArrayList<>();
   }
   public void setThanhToan(IThanhToan thanhToan) {
      this.thanhToan = thanhToan;
   }

   public void setVanChuyen(IVanChuyen vanChuyen) {
      this.vanChuyen = vanChuyen;
   }

   public void setKhuyenMai(IKhuyenMai khuyenMai) {
      this.khuyenMai = khuyenMai;
   }

   public void addMH(MatHang item) {
      items.add(item);
   }

   public void thanhToan() {
      double total = 0;
      for (MatHang item : items) {
         total += item.tongGia();
      }
      double tienKhuyenMai = khuyenMai.tinhToanKM(total);
      int thoiGianVC = vanChuyen.soNgay();
      double tienGiamTT = thanhToan.thanhToan(total-tienKhuyenMai);

      System.out.println("Tổng tiền HD: " + total);
      System.out.println("Khuyến mãi: " + tienKhuyenMai);
      System.out.println("Tiền giảm thanh toán " + tienGiamTT);
      System.out.println("Thành tiền: " + (total - tienKhuyenMai - tienGiamTT));
      System.out.println("Thời gian vận chuyển: " + thoiGianVC + " ngày");

   }
}
