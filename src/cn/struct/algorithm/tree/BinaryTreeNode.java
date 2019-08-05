package cn.struct.algorithm.tree;

/**
 * @author chenghuan
 * @Description 二叉树节点
 * @Date 2019/8/5 20:49
 */
public class BinaryTreeNode<T>{

    /**
     * 数据
     */
     private T data;

    /**
     * 左节点
     */
    private BinaryTreeNode leftTreeNode;

    /**
     * 右节点
     */
   private BinaryTreeNode rightTreeNode;

    /**
     * 构造函数
     * @param data
     */
   public BinaryTreeNode(T data){
       this.data = data;
   }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(BinaryTreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public BinaryTreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(BinaryTreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }
}
