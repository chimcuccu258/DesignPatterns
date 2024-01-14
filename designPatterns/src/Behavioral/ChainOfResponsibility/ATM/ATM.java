package Behavioral.ChainOfResponsibility.ATM;
/*
 * @created 08/12/2023 - 08:37
 * @project designPatterns
 * @author TaosDev
 */

public interface ATM {
   void rutTien(int soTien);
   ATM thietLapMenhGiaKeTiep(ATM atm);
}
