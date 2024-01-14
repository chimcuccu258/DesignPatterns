package Behavioral.Observer.ATM;

public class Main {
   public static void main(String[] args) {
      ATM atm = new ATM();
      TaiKhoan taiKhoan1 = new TaiKhoan("Minh", 1000, atm);
      TaiKhoan taiKhoan2 = new TaiKhoan("Anh", 1230, atm);

      System.out.println("Lần giao dịch thứ 1");
      taiKhoan1.duaTheVaoATM();
      atm.rutTien(500);
      taiKhoan1.rutThe();
      System.out.println("Lần giao dịch thứ 2");
      taiKhoan2.duaTheVaoATM();
      atm.rutTien(100);
      System.out.println("Lần giao dịch thứ 3");
      atm.rutTien(200);
      taiKhoan2.rutThe();
      System.out.println("Lần giao dịch thứ 4");
      atm.rutTien(500);
   }
}
