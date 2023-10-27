package Creational.Builder.A1;

import java.util.ArrayList;

public class HoaDon {
  private HoaDonHeader hoaDonHeader;
  private ArrayList<CTHD> cthds;

  private HoaDon(Builder builder) {
    this.hoaDonHeader = builder.hoaDonHeader;
    this.cthds = builder.cthds;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Ma Hoa Don: ").append(hoaDonHeader.getMaHoaDon()).append("\n");
    stringBuilder.append("Ngay Ban: ").append(hoaDonHeader.getNgayBan()).append("\n");
    stringBuilder.append("Ten Khach Hang: ").append(hoaDonHeader.getTenKhachHang()).append("\n");

    stringBuilder.append("Chi Tiet Hoa Don:\n");
    for (CTHD cthd : cthds) {
      stringBuilder.append("San Pham: ").append(cthd.getSanPham()).append("\n");
      stringBuilder.append("So Luong: ").append(cthd.getSoLuong()).append("\n");
      stringBuilder.append("Don Gia: ").append(cthd.getDonGia()).append("\n");
      stringBuilder.append("Chiet Khau: ").append(cthd.getChietKhau()).append("\n");
      stringBuilder.append("----------------------\n");
    }

    return stringBuilder.toString();
  }

  public static class Builder {
    private HoaDonHeader hoaDonHeader;
    private ArrayList<CTHD> cthds = new ArrayList<>();

    public Builder setHoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
      hoaDonHeader = new HoaDonHeader(maHoaDon, ngayBan, tenKhachHang);
      return this;
    }

    public Builder addCTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
      cthds.add(new CTHD(sanPham,soLuong,donGia,chietKhau));
      return this;
    }
    public HoaDon build() {
      return new HoaDon(this);
    }
  }
}
