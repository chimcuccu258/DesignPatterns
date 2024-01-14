package Behavioral.Strategy.CC3;
/*
 * @created 05/01/2024 - 18:59
 * @project designPatterns
 * @author TaosDev
 */

public class KhuyenMai10Max100 implements IKhuyenMai{
   @Override //500.000
   public double tinhToanKM(double amount) {
      return amount*0.1<100?amount*0.1:100;
   }
}
