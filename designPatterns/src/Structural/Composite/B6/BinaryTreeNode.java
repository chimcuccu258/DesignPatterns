package Structural.Composite.B6;
/*
 * @created 28/10/2023 - 08:11
 * @project designPatterns
 * @author TaosDev
 */

public interface BinaryTreeNode {
   void printTree(String prefix, boolean isTail);
   void addChild(BinaryTreeNode child);
   void removeChild(BinaryTreeNode child);
}
