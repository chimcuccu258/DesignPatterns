package Creational.Singleton.A4;

public class Main {
   public static void main(String[] args) {
      Election election = Election.getInstance();
      User user = new User("Hillary");
      User user1 = new User("Pete");
      User user2 = new User("Taos");
      user.vote(Candidate.BIDEN);
      user1.vote(Candidate.BIDEN);
      user2.vote(Candidate.TRUMP);
      election.Output();
   }
}
