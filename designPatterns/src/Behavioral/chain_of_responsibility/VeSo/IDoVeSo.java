package Behavioral.chain_of_responsibility.VeSo;

public interface IDoVeSo {
  IDoVeSo giaiKeTiep(IDoVeSo keTiep);
  String doVeSo(String veSo);
}
