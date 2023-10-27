package Behavioral.Observer.CA5;

public class Main {
  public static void main(String[] args) {
    ATM atm = new ATM();
    TaiKhoan taiKhoan = new TaiKhoan("Donald Trump", 1500000, atm);
    taiKhoan.duaTheVaoATM();
    atm.rutTien(50000);
    taiKhoan.rutTheKhoiATM();
    atm.rutTien(50000);
  }
}
