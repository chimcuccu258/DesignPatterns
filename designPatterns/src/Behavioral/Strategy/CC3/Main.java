package Behavioral.Strategy.CC3;
/*
 * @created 05/01/2024 - 18:59
 * @project designPatterns
 * @author TaosDev
 */

public class Main {
   public static void main(String[] args) {
      GioHang cart = new GioHang();
      cart.addMH(new MatHang("Item1", 2, 500.000));
      cart.addMH(new MatHang("Item2", 3, 100.000));
      cart.addMH(new MatHang("Item3", 1, 200.000));
      cart.addMH(new MatHang("Item4", 1, 1000.000));

      cart.setKhuyenMai(new KhuyenMai10Max100());
      cart.setThanhToan(new CODPayment());
      cart.setVanChuyen(new NinjaVan());
      cart.thanhToan();
   }
}
