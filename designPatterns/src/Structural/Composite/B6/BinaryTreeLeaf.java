package Structural.Composite.B6;
/*
 * @created 28/10/2023 - 08:13
 * @project designPatterns
 * @author TaosDev
 */

public class BinaryTreeLeaf implements BinaryTreeNode{
    private int value;

   public BinaryTreeLeaf(int value) {
      this.value = value;
   }

   @Override
   public void printTree(String prefix, boolean isTail) {
      System.out.println(prefix + (isTail ? "└── " : "├── ") + "Leaf Node: " + value);
   }

   @Override
   public void addChild(BinaryTreeNode child) {

   }

   @Override
   public void removeChild(BinaryTreeNode child) {

   }
}
