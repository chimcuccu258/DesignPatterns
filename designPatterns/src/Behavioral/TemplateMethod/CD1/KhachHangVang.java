package Behavioral.TemplateMethod.CD1;
/*
 * @created 22/12/2023 - 09:12
 * @project designPatterns
 * @author TaosDev
 */

import java.util.List;

public class KhachHangVang extends KhachHang{
   public KhachHangVang(List<MatHang> dsHangHoa) {
      super(dsHangHoa);
   }

   @Override
   protected float tinhChietKhau(float tong) {
      return tong >= 1000000 ? (float) (tong * 0.05) : (float) (tong * 0.03);
   }
}
