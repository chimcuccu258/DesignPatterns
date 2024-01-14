package Behavioral.Observer.CA2;

public class Activity implements OnClickListener{
   int count=0;
   MyButton myButton;

   public Activity(MyButton myButton) {
      this.myButton = myButton;
      myButton.attach(this);
   }
   public void huyDangKy(){
      this.myButton.detach();
   }
   @Override
   public void onClick() {
      System.out.println("Bạn click lần thứ " + ++count);

   }
}
