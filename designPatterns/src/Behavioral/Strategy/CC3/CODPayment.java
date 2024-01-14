package Behavioral.Strategy.CC3;
/*
 * @created 05/01/2024 - 18:58
 * @project designPatterns
 * @author TaosDev
 */

public class CODPayment implements IThanhToan{
   @Override
   public double thanhToan(double amount) {
      return amount >= 2000.000 ? 0.02 * amount : 0;
   }
}
