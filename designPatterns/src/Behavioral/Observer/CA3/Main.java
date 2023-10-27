package Behavioral.Observer.CA3;

public class Main {
  public static void main(String[] args) {
    TiGia tiGia = new TiGia();
    NhaDauTuA nhaDauTuA = new NhaDauTuA(tiGia);
    NhaDauTuB nhaDauTuB = new NhaDauTuB(tiGia);
    tiGia.notifyTiGia((float) 2.0);
    nhaDauTuA.huyDangKy();
    System.out.println("Lan 2");
    tiGia.notifyTiGia(-2);
  }
}
