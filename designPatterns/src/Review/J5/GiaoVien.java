package Review.J5;

public class GiaoVien {
  @Override
  public String toString() {
    return super.toString() +"Mon day: " + monDay + ", to bo mon: " + toBoMon;
  }

  public String getMonDay() {
    return monDay;
  }

  public void setMonDay(String monDay) {
    this.monDay = monDay;
  }

  public String getToBoMon() {
    return toBoMon;
  }

  public void setToBoMon(String toBoMon) {
    this.toBoMon = toBoMon;
  }

  String monDay;
  String toBoMon;

}
