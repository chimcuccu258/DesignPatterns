package Behavioral.TemplateMethod.CD1;
/*
 * @created 05/01/2024 - 18:08
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      List<MatHang> dsHangHoa = new ArrayList<>();
      dsHangHoa.add(new MatHang("Banh", 10, 50000));
      dsHangHoa.add(new MatHang("Nuoc", 5, 20000));

      KhachHang hoaDon = new KhachHangVang(dsHangHoa);
      hoaDon.hienThiGioHang();
   }
}
