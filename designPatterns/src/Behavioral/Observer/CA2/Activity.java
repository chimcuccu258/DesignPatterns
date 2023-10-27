package Behavioral.Observer.CA2;

public class Activity implements Button.OnClickListener {
   int count = 0;

   @Override
   public void onClick() {
      count++;
      System.out.println("Bạn click lần thứ: " + count);
   }
}
