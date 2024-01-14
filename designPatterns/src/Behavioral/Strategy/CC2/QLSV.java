package Behavioral.Strategy.CC2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
   ISoSanh<SinhVien> soSanh;
   List<SinhVien> ds=new ArrayList<>();
   public void inDS(){
      for(SinhVien sv:ds){
         System.out.println(sv.toString());
      }
   }
   public void sapXep(ISoSanh<SinhVien> s){ // tang dan
      for(int i=0;i< ds.size();i++){
         for (int j=i+1;j<ds.size();j++){
            if(s.soSanh(ds.get(i),ds.get(j))>0){
               SinhVien temp = ds.get(i);
               ds.set(i, ds.get(j));
               ds.set(j, temp);
            }
         }
      }
   }
}
