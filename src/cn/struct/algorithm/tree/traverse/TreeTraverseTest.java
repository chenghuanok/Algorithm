package cn.struct.algorithm.tree.traverse;

import cn.struct.algorithm.tree.BinaryTreeNode;
import org.junit.jupiter.api.Test;

/**
 * 测试
 * @Author: chenghuan
 * @Date: 2019/10/21 21:17
 */
public class TreeTraverseTest {

    @Test
    public void before(){
        TreeTraverse.before(buildTree());
    }

    @Test
    public void middle(){
        TreeTraverse.middle(buildTree());
    }

    @Test
    public void after(){
        TreeTraverse.after(buildTree());
    }

    /**
     * 构造树
     * @return BinaryTreeNode
     * @author chenghuan
     * @date 2019/10/21 21:19
     */
    private BinaryTreeNode buildTree(){
        final BinaryTreeNode<Integer> binaryTreeNodeOne = new BinaryTreeNode<>(1);
        final BinaryTreeNode<Integer> binaryTreeNodeTwo = new BinaryTreeNode<>(2);
        final BinaryTreeNode<Integer> binaryTreeNodeThree = new BinaryTreeNode<>(3);
        final BinaryTreeNode<Integer> binaryTreeNodeFour = new BinaryTreeNode<>(4);
        final BinaryTreeNode<Integer> binaryTreeNodeFive = new BinaryTreeNode<>(5);
        binaryTreeNodeOne.setLeftTreeNode(binaryTreeNodeTwo);
        binaryTreeNodeOne.setRightTreeNode(binaryTreeNodeThree);
        binaryTreeNodeTwo.setLeftTreeNode(binaryTreeNodeFour);
        binaryTreeNodeTwo.setRightTreeNode(binaryTreeNodeFive);
        return binaryTreeNodeOne;
    }
}
