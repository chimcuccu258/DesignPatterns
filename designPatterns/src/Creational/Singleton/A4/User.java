package Creational.Singleton.A4;

public class User {
  private String username;

  public User(String name) {
    this.username = name;
  }
  public String getUsername() {
    return username;
  }
  public void vote(Candidate c) {
    Election.getInstance().vote(c,username);
  }
}
