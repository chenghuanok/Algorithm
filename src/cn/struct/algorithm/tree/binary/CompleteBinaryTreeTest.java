package cn.struct.algorithm.tree.binary;

import org.junit.jupiter.api.Test;

/**
 * 完全二叉树测试
 * @Author: chenghuan
 * @Date: 2019/10/20 22:59
 */
public class CompleteBinaryTreeTest {

    @Test
    public void add(){
      CompleteBinaryTree<String> completeBinaryTree = new CompleteBinaryTree<>(10);
      completeBinaryTree.add("a");
      completeBinaryTree.add("b");
      completeBinaryTree.add("c");
      completeBinaryTree.print();
    }
    @Test
    public void getRoot(){
        CompleteBinaryTree<String> completeBinaryTree = new CompleteBinaryTree<>(10);
        completeBinaryTree.add("a");
        completeBinaryTree.add("b");
        completeBinaryTree.add("c");
        completeBinaryTree.add("d");
        completeBinaryTree.add("e");
        completeBinaryTree.add("f");
        final String root = completeBinaryTree.getRoot("f");
        System.out.println(root);
    }

    @Test
    public void getLeft(){
        final CompleteBinaryTree<String> completeBinaryTree = new CompleteBinaryTree<>(10);
        completeBinaryTree.add("a");
        completeBinaryTree.add("b");
        completeBinaryTree.add("c");
        completeBinaryTree.add("d");
        completeBinaryTree.add("e");
        completeBinaryTree.add("f");
        final String root = completeBinaryTree.getLeft("b");
        System.out.println(root);
    }

    @Test
    public void getRight(){
        final CompleteBinaryTree<String> completeBinaryTree = new CompleteBinaryTree<>(10);
        completeBinaryTree.add("a");
        completeBinaryTree.add("b");
        completeBinaryTree.add("c");
        completeBinaryTree.add("d");
        completeBinaryTree.add("e");
        completeBinaryTree.add("f");
        final String root = completeBinaryTree.getRight("b");
        System.out.println(root);
    }
}
