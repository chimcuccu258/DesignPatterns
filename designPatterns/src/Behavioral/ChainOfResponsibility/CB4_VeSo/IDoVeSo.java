package Behavioral.ChainOfResponsibility.CB4_VeSo;

public interface IDoVeSo {
  IDoVeSo giaiKeTiep(IDoVeSo keTiep);
  String doVeSo(String veSo);
}
