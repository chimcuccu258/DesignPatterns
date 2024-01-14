package Behavioral.Strategy.CC3;
/*
 * @created 05/01/2024 - 18:58
 * @project designPatterns
 * @author TaosDev
 */

public class AirpayPayment implements IThanhToan{
   @Override
   public double thanhToan(double amount) {
      return amount >= 1000000 ? 0.03 * amount : 0;
   }
}
