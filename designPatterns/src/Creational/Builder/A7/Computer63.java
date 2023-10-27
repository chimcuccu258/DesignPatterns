package Creational.Builder.A7;

public class Computer63 {
   String CPU, RAM, HardDisk, Screen;

   public Computer63(Builder builder) {
      this.CPU = builder.CPU;
      this.RAM = builder.RAM;
      this.HardDisk = builder.HardDisk;
      this.Screen = builder.Screen;
   }

   @Override
   public String toString() {
      return "CPU: " + this.CPU + "\nRAM: " + this.RAM + "\nStorage: " + this.HardDisk + "\nScreen: " + this.Screen;
   }

   public static class Builder {
      String CPU, RAM, HardDisk, Screen;

      Builder addCPU(String CPU) {
         this.CPU = CPU;
         return this;
      }

      Builder addRAM(String RAM) {
         this.RAM = RAM;
         return this;
      }

      Builder addScreen(String Screen) {
         this.Screen = Screen;
         return this;
      }

      Builder addHardDisk(String HardDisk) {
         this.HardDisk = HardDisk;
         return this;
      }

      public Computer63 build() {
         return new Computer63(this);
      }
   }
}
