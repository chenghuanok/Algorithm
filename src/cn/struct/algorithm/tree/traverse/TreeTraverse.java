package cn.struct.algorithm.tree.traverse;

import cn.struct.algorithm.tree.BinaryTreeNode;

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
            System.out.print(binaryTreeNode.getData()+"...");
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
             System.out.print(binaryTreeNode.getData()+"...");
             middle(binaryTreeNode.getRightTreeNode());
         }
   }

    /**
     * 后续遍历
     * @param binaryTreeNode
     */
   public static void after(final BinaryTreeNode binaryTreeNode){
       if(binaryTreeNode!=null){
           after(binaryTreeNode.getLeftTreeNode());
           after(binaryTreeNode.getRightTreeNode());
           System.out.print(binaryTreeNode.getData()+"...");
       }
   }
}
