package Behavioral.ChainOfResponsibility.TienDien;
/*
 * @created 08/12/2023 - 09:26
 * @project designPatterns
 * @author TaosDev
 */

public interface TinhTienDienBacThang {
   TinhTienDienBacThang bacKeTiep(TinhTienDienBacThang keTiep);

   int tinhTienDien(int soKw);
}
