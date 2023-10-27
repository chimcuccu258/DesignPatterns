package Behavioral.chain_of_responsibility.VeSo;

public class Main {
  public static void main(String[] args) {
    IDoVeSo giaiDB = new GiaiThuong("Giai Dac Biet", new  String[] {"413689"});
    IDoVeSo giaiNhat = new GiaiThuong("Giai Nhat", new  String[] {"93878"});
    IDoVeSo giaiNhi = new GiaiThuong("Giai Nhi", new  String[] {"94280"});
    IDoVeSo giaiBa = new GiaiThuong("Giai Ba", new  String[] {"55075","98996"});
    IDoVeSo giaiTu = new GiaiThuong("Giai Tu", new String[] {"42657","43178","46598","15429","86313","63495",
            "55031"});
    IDoVeSo giaiNam = new GiaiThuong("Giai Nam", new String[] {"1653"});
    IDoVeSo giaiSau = new GiaiThuong("Giai Sau", new String[] {"3524","0510","3190"});
    IDoVeSo giaiUt = new GiaiUt("Giai Tam", new String[] {"90"});

    giaiDB.giaiKeTiep(giaiNhat)
            .giaiKeTiep(giaiNhi)
            .giaiKeTiep(giaiBa)
            .giaiKeTiep(giaiTu)
            .giaiKeTiep(giaiNam)
            .giaiKeTiep(giaiSau)
            .giaiKeTiep(giaiUt);

    String veSo = "413190";
    System.out.println(giaiDB.doVeSo(veSo));
  }
}
