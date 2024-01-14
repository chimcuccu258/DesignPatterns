package Structural.Decorator.Tokenize;
/*
 * @created 17/11/2023 - 08:28
 * @project designPatterns
 * @author TaosDev
 */

import java.util.Arrays;

public class MainTokennize {
   static void inKQ(String[] kq){
      Arrays.stream(kq).forEach(s -> System.out.print(s + "\n"));
   }


   public static void main(String[] args) {
      ITokennize tachTu = new TachTu("Hôm này là một ngày đẹp. Và mà là, thì, thì, một.");
      inKQ(tachTu.tokenize());
      ITokennize boDau = new LoaiBoDauCau(tachTu);
      System.out.println("Bỏ dấu câu");
      inKQ(boDau.tokenize());
      ITokennize boTu = new LoaiBoTuDung(boDau);
      System.out.println("Bỏ từ dừng");
      inKQ(boTu.tokenize());
   }
}
