package Behavioral.strategy.CC2;

public class Main {
   public static void main(String[] args) {
      QLSV qlsv = new QLSV();
      qlsv.inDS();
      System.out.println("Sau khi sap xep:");
      qlsv.sapXep(new SoSanhTheoDiem());
      qlsv.inDS();
   }
}
