package Behavioral.Strategy.CC1;

public class Context {
   Tinh tinh;
   public Context(Tinh tinh) {
      this.tinh = tinh;
   }
    public float tinh(float a, float b) {
        return tinh.KetQua(a, b);
    }
}
