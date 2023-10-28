package Structural.Composite.B6;
/*
 * @created 28/10/2023 - 08:21
 * @project designPatterns
 * @author TaosDev
 */

public class Main {
   public static void main(String[] args) {
      BinaryTreeLeaf leaf1 = new BinaryTreeLeaf(1);
      BinaryTreeLeaf leaf2 = new BinaryTreeLeaf(2);
      BinaryTreeLeaf leaf3 = new BinaryTreeLeaf(3);

      BinaryTreeComposite root = new BinaryTreeComposite(10);
      BinaryTreeComposite composite1 = new BinaryTreeComposite(5);
      BinaryTreeComposite composite2 = new BinaryTreeComposite(15);

      composite1.addChild(leaf1);
      composite1.addChild(leaf2);
      composite2.addChild(leaf3);

      root.addChild(composite1);
      root.addChild(composite2);

      System.out.println(root.getList()); // Contain 10 and 15
      root.printTree("", true);
   }
}
