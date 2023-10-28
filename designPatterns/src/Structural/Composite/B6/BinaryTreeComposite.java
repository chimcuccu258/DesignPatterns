package Structural.Composite.B6;
/*
 * @created 28/10/2023 - 08:15
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeComposite implements BinaryTreeNode{
   private int value;
   private List<BinaryTreeNode> children;

   public BinaryTreeComposite(int value) {
      this.value = value;
      this.children = new ArrayList<>();
   }

   @Override
   public void printTree(String prefix, boolean isEnd) {
      System.out.println(prefix + (isEnd ? "└── " : "├── ") + "Composite Node: " + value);
      // nếu mà có hơn 2 nút thì sẽ in "    " : "│   "
      for (int i = 0; i < children.size() - 1; i++) {
         children.get(i).printTree(prefix + (isEnd ? "    " : "│   "), false);
      }
      if (!children.isEmpty()) {
         children.get(children.size() - 1).printTree(prefix + (isEnd ?"    " : "│   "), true);
      }
   }

   @Override
   public void addChild(BinaryTreeNode child) {
      children.add(child);
   }

   @Override
   public void removeChild(BinaryTreeNode child) {
      children.remove(child);
   }
   public int getList(){
      return children.size();
   }
}
