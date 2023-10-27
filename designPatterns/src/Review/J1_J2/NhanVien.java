package Review.J1_J2;

public class NhanVien {
  public NhanVien() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Integer getWorkingTime() {
    return workingTime;
  }

  public void setWorkingTime(Integer workingTime) {
    this.workingTime = workingTime;
  }

  String name;
  Integer age;

  String address;
  Double salary;
  Integer workingTime;

  public NhanVien(String name, Integer age, String address, Double salary, Integer workingTime) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.salary = salary;
    this.workingTime = workingTime;
  }

  public double tinhThuong() {
    if (workingTime < 100)
      return 0;
    if (workingTime < 200)
      return salary*0.2;
    return salary*0.2;
  }

}
