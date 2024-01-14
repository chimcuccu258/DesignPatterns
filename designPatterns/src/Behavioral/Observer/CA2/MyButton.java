package Behavioral.Observer.CA2;

public class MyButton {
   OnClickListener listener;


   public void attach(OnClickListener listener) {
      this.listener = listener;
   }

   public void detach() {
      this.listener = null;
   }

   public void click() {
      if (listener != null)
         listener.onClick();
   }
}
