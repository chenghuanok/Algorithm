package cn.struct.algorithm.tree;

/**
 * @author chenghuan
 * @Description 树测试
 * @Date 2019/8/5 21:04
 */
public class TreeMain {

    public static void main(String[] args){
        final BinaryTreeNode<Integer> binaryTreeNodeOne = new BinaryTreeNode<>(1);
        final BinaryTreeNode<Integer> binaryTreeNodeTwo = new BinaryTreeNode<>(2);
        final BinaryTreeNode<Integer> binaryTreeNodeThree = new BinaryTreeNode<>(3);
        final BinaryTreeNode<Integer> binaryTreeNodeFour = new BinaryTreeNode<>(4);
        final BinaryTreeNode<Integer> binaryTreeNodeFive = new BinaryTreeNode<>(5);
        binaryTreeNodeOne.setLeftTreeNode(binaryTreeNodeTwo);
        binaryTreeNodeOne.setRightTreeNode(binaryTreeNodeThree);
        binaryTreeNodeTwo.setLeftTreeNode(binaryTreeNodeFour);
        binaryTreeNodeTwo.setRightTreeNode(binaryTreeNodeFive);
        TreeTraverse.before(binaryTreeNodeOne);
        TreeTraverse.middle(binaryTreeNodeOne);
    }
}
