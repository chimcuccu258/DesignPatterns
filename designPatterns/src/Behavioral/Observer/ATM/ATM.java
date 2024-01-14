package Behavioral.Observer.ATM;

public class ATM {
   ITaiKhoan taiKhoan;

   public ATM() {

   }

   public void attach(ITaiKhoan taiKhoan) {
      this.taiKhoan = taiKhoan;
   }

   public void detach() {
      this.taiKhoan = null;
   }

   public void kiemTraTienRut() {
      if (taiKhoan != null) {
         taiKhoan.kiemTraSoDu();
      }
   }

   public void rutTien(int soTienRut) {
      if (taiKhoan != null) {
         taiKhoan.rutTien(soTienRut);
      } else {
         System.out.println("\tKhông có tài khoản nào được kết nối với ATM.");
      }
   }
}
