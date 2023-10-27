package Behavioral.observer.CA2;

public class Button {
  OnClickListener listener;
  public void attach(OnClickListener listener) {
    this.listener = listener;
  }
  public void click() {
    if (listener != null) {
      listener.onClick();
    }
  }
  public static interface OnClickListener {
    void onClick();
  }
}
