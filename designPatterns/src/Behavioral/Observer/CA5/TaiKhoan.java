package Behavioral.Observer.CA5;

public class TaiKhoan implements ATM.I_RutTien{
  String name;
  int soDu;
  ATM atm;


  public TaiKhoan(String name, int soDu, ATM atm) {
    this.name = name;
    this.soDu = soDu;
    this.atm = atm;
  }

  public void duaTheVaoATM() {
    atm.attach(this);
  }

  public void rutTheKhoiATM() {
    atm.detach(this);
  }

  @Override
  public boolean kiemTraSoDu(int tienRut) {
    return soDu >= tienRut;
  }

  @Override
  public void nhanThongBao(int tienRut, boolean thanhCong) {
    if (thanhCong) {
      System.out.println("Tai khoan: " + name + "\nRut tien thanh cong" + "\nSo du ban dau: " + soDu + "\nSo tien " +
              "rut:" + tienRut + "\nSo du con lai: " + (soDu-tienRut));
    }
    else
      System.out.println(name + " rut tien khong thanh cong");
  }
}
