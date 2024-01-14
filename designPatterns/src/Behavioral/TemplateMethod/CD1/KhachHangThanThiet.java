package Behavioral.TemplateMethod.CD1;
/*
 * @created 22/12/2023 - 09:24
 * @project designPatterns
 * @author TaosDev
 */

import java.util.List;

public class KhachHangThanThiet extends KhachHang{
   public KhachHangThanThiet(List<MatHang> dsHangHoa) {
      super(dsHangHoa);
   }

   @Override
   protected float tinhChietKhau(float tong) {
      return tong >= 500000 ? (float) (tong * 0.02) : 0;
   }
}
