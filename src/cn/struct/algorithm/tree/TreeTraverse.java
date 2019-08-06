package cn.struct.algorithm.tree;

/**
 * @author chenghuan
 * @Description 树遍历
 * @Date 2019/8/5 21:08
 */
public class TreeTraverse {

    /**
     * 前序遍历
      * @param binaryTreeNode
     */
   public static void before(final BinaryTreeNode binaryTreeNode){
        if(binaryTreeNode!=null){
            System.out.println(binaryTreeNode.getData());
            before(binaryTreeNode.getLeftTreeNode());
            before(binaryTreeNode.getRightTreeNode());
        }
   }

    /**
     * 中序遍历
     * @param binaryTreeNode
     */
   public static void middle(final BinaryTreeNode binaryTreeNode){
         if(binaryTreeNode!=null){
             middle(binaryTreeNode.getLeftTreeNode());
             System.out.println(binaryTreeNode.getData());
             middle(binaryTreeNode.getRightTreeNode());
         }
   }
}
