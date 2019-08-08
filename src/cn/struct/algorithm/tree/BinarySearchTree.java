package cn.struct.algorithm.tree;

/**
 * @author chenghuan
 * @Description 二叉查找树
 * @Date 2019/8/8 20:48
 */
public class BinarySearchTree {

    /**
     * 查找对应的节点
     * @param binaryTreeRoot
     * @param data
     * @return BinaryTreeNode
     */
    public static BinaryTreeNode find(final BinaryTreeNode<Integer> binaryTreeRoot, final int data){
       BinaryTreeNode<Integer>  binaryTreeNode = binaryTreeRoot;
       while(binaryTreeNode!=null){
           if(data>binaryTreeNode.getData()){
                 binaryTreeNode = binaryTreeNode.getRightTreeNode();

           }else if(data<binaryTreeNode.getData()){
               binaryTreeNode = binaryTreeNode.getLeftTreeNode();
           }else{
               return binaryTreeNode;
           }
       }
       return null;
    }
}
