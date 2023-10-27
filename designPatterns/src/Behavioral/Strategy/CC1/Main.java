package Behavioral.Strategy.CC1;

public class Main {
   public static void main(String[] args) {
      Context phepCong = new Context(new Cong());
      System.out.println(phepCong.tinh(75, 12));
      Context phepTru = new Context(new Tru());
      System.out.println(phepTru.tinh(54, 78));
      Context phepNhan = new Context(new Nhan());
      System.out.println(phepNhan.tinh(45, 67));
      Context phepChia = new Context(new Chia());
      System.out.println(phepChia.tinh(45, 67));
   }
}
