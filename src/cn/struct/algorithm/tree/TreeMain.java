package cn.struct.algorithm.tree;

/**
 * @author chenghuan
 * @Description 树测试
 * @Date 2019/8/5 21:04
 */
public class TreeMain {

    public static void main(String[] args){
//        final BinaryTreeNode<Integer> binaryTreeNodeOne = new BinaryTreeNode<>(1);
//        final BinaryTreeNode<Integer> binaryTreeNodeTwo = new BinaryTreeNode<>(2);
//        final BinaryTreeNode<Integer> binaryTreeNodeThree = new BinaryTreeNode<>(3);
//        final BinaryTreeNode<Integer> binaryTreeNodeFour = new BinaryTreeNode<>(4);
//        final BinaryTreeNode<Integer> binaryTreeNodeFive = new BinaryTreeNode<>(5);
//        binaryTreeNodeOne.setLeftTreeNode(binaryTreeNodeTwo);
//        binaryTreeNodeOne.setRightTreeNode(binaryTreeNodeThree);
//        binaryTreeNodeTwo.setLeftTreeNode(binaryTreeNodeFour);
//        binaryTreeNodeTwo.setRightTreeNode(binaryTreeNodeFive);
//        //TreeTraverse.before(binaryTreeNodeOne);
//        //TreeTraverse.middle(binaryTreeNodeOne);
//        TreeTraverse.after(binaryTreeNodeOne);
          final BinaryTreeNode binaryTreeRootNode = binarySearchTree();
          //final BinaryTreeNode searceBinaryTree = BinarySearchTree.find(binaryTreeRootNode,10);
          BinarySearchTree.insert(binaryTreeRootNode,4);
          BinarySearchTree.delete(binaryTreeRootNode,8);
          TreeTraverse.middle(binaryTreeRootNode);
    }


    public static BinaryTreeNode<Integer> binarySearchTree(){
        final BinaryTreeNode<Integer> binaryTreeRootNode = new BinaryTreeNode<>(6);
        final BinaryTreeNode<Integer> binaryTreeNodeTwo = new BinaryTreeNode<>(5);
        final BinaryTreeNode<Integer> binaryTreeNodeThree = new BinaryTreeNode<>(10);
        final BinaryTreeNode<Integer> binaryTreeNodeFour = new BinaryTreeNode<>(1);
        final BinaryTreeNode<Integer> binaryTreeNodeFive = new BinaryTreeNode<>(8);
        binaryTreeRootNode.setLeftTreeNode(binaryTreeNodeFour);
        binaryTreeRootNode.setRightTreeNode(binaryTreeNodeThree);
        binaryTreeNodeFour.setRightTreeNode(binaryTreeNodeTwo);
        binaryTreeNodeThree.setLeftTreeNode(binaryTreeNodeFive);
        return binaryTreeRootNode;
    }
}
