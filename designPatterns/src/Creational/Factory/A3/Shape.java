package Creational.Factory.A3;
/*
 * @created 17/11/2023 - 07:30
 * @project designPatterns
 * @author TaosDev
 */

public abstract class Shape {
   private String brush, paper, frame;

   public String getBrush() {
      return brush;
   }

   public void setBrush(String brush) {
      this.brush = brush;
   }

   public String getPaper() {
      return paper;
   }

   public void setPaper(String paper) {
      this.paper = paper;
   }

   public String getFrame() {
      return frame;
   }

   public void setFrame(String frame) {
      this.frame = frame;
   }
   public abstract String draw();
}
