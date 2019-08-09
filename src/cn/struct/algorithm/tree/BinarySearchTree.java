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
       BinaryTreeNode<Integer> binaryTreeNode = binaryTreeRoot;
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

    /**
     * 二叉查找树插入
     * @param binaryTreeRoot
     * @param data
     * @return BinarySearchTree
     */
    public static void insert( BinaryTreeNode<Integer> binaryTreeRoot,final int data){
        //根节点为空
        if(binaryTreeRoot==null){
            binaryTreeRoot = new BinaryTreeNode(data);
            return;
        }
        while(binaryTreeRoot!=null){
             if(data>binaryTreeRoot.getData()){
                 if(binaryTreeRoot.getRightTreeNode()==null){
                     binaryTreeRoot.setRightTreeNode(new BinaryTreeNode(data));
                    return ;
                 }
                 binaryTreeRoot = binaryTreeRoot.getRightTreeNode();
             }else if(data<binaryTreeRoot.getData()){
                 if(binaryTreeRoot.getLeftTreeNode()==null){
                     binaryTreeRoot.setLeftTreeNode(new BinaryTreeNode(data));
                     return ;
                 }
                 binaryTreeRoot = binaryTreeRoot.getLeftTreeNode();
             }
        }
    }
}
