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

    /**
     * 二叉查找树数据对应节点删除
     * @param binaryTreeRootNode
     * @param data
     */
    public static void delete(BinaryTreeNode<Integer> binaryTreeRootNode,final int data){
         //记录要删除节点的父节点
         BinaryTreeNode<Integer> binaryTreeParentNode = null;
         //找到是否有对应data的节点
         while(binaryTreeRootNode!=null&&binaryTreeRootNode.getData()!=data){
             binaryTreeParentNode = binaryTreeRootNode;
             if(data>binaryTreeRootNode.getData()){
                 binaryTreeRootNode = binaryTreeRootNode.getRightTreeNode();
             }else if(data<binaryTreeRootNode.getData()){
                 binaryTreeRootNode = binaryTreeRootNode.getLeftTreeNode();
             }
         }
         //没有对应的data
         if(binaryTreeRootNode==null){return;}
         //对应的data节点没有子节点
         if(binaryTreeRootNode.getRightTreeNode()==null&&binaryTreeRootNode.getLeftTreeNode()==null){
             if(binaryTreeParentNode==null){
                 binaryTreeParentNode=null;
             }else if(binaryTreeParentNode.getRightTreeNode() ==binaryTreeRootNode){
                  binaryTreeParentNode.setRightTreeNode(null);
             }else{
                 binaryTreeParentNode.setLeftTreeNode(null);
             }
         }
         //对应的data节点有一个子节点
    }
}
