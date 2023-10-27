package Creational.Singleton.A4;

import java.util.ArrayList;
import java.util.List;

public class Election {
  private static Election instance;
  int voteTrump = 0;
  int voteBiden = 0;
  List<String> usersVoted;

  private Election() {
    usersVoted = new ArrayList<String>();
  }
  public static Election getInstance() {
    if (instance == null) {
      instance = new Election();
    }
    return instance;
  }
  public void Output() {
    System.out.println("Vote Trump: " + voteTrump);
    System.out.println("Vote Biden: " + voteBiden);
  }
  public void vote(Candidate c, String name) {
    if (!usersVoted.contains(name)) {
      if (c == Candidate.TRUMP)
        voteTrump++;
      else if (c == Candidate.BIDEN)
        voteBiden++;
      usersVoted.add(name);
    } else {
      System.out.println("User has voted");
    }
  }
}


