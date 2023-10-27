package Creational.Builder.A1;

public class CTHD {
  public String getSanPham() {
    return sanPham;
  }

  public int getSoLuong() {
    return soLuong;
  }

  public double getDonGia() {
    return donGia;
  }

  public double getChietKhau() {
    return chietKhau;
  }

  private String sanPham;

  public CTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
    this.sanPham = sanPham;
    this.soLuong = soLuong;
    this.donGia = donGia;
    this.chietKhau = chietKhau;
  }

  private int soLuong;
  private double donGia;
  private double chietKhau;
}
