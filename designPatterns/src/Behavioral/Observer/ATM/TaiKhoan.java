package Behavioral.Observer.ATM;
/*
 * @created 05/01/2024 - 18:48
 * @project designPatterns
 * @author TaosDev
 */

public class TaiKhoan implements ITaiKhoan {
   String ten;
   int soDu;
   ATM atm;

   public TaiKhoan(String ten, int soDu, ATM atm) {
      this.ten = ten;
      this.soDu = soDu;
      this.atm = atm;
   }

   public void duaTheVaoATM() {
      atm.attach(this);
      System.out.println("\tTên: " + ten);
      kiemTraSoDu();
   }

   public void rutThe() {
      atm.detach();
   }

   @Override
   public void kiemTraSoDu() {
      System.out.println("\tSố dư của thẻ: " + soDu);
   }

   @Override
   public void rutTien(int soTienRut) {
      if (soDu >= soTienRut) {
         System.out.println("\tĐang rút số tiền " + soTienRut + "...");
         soDu -= soTienRut;
         nhanThongBao("Rút tiền thành công. \n\tSố dư còn lại: " + soDu);
      } else {
         nhanThongBao("Không đủ tiền trong tài khoản.");
      }
   }

   @Override
   public void nhanThongBao(String thongBao) {
      System.out.println("\tThông báo từ tài khoản: " + thongBao);
   }
}
