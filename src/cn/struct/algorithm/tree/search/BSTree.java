package cn.struct.algorithm.tree.search;

/**
 * 二插查找树
 * @Author: chenghuan
 * @Date: 2019/10/24 22:41
 */
public class BSTree <T extends Comparable<T>>{
    /**
     *根结点
     */
    BSTNode<T> mRoot;

    class BSTNode<T extends Comparable<T>>{

        /**
         *数据
         */
        T data;

        /**
         *左孩子
         */
        BSTNode<T> left;

        /**
         *右孩子
         */
        BSTNode<T> right;

        /**
         *父结点
         */
        BSTNode<T> parent;

        /**
         *构造函数
         */
        public BSTNode(T data, BSTNode<T> parent, BSTNode<T> left, BSTNode<T> right) {
            this.data = data;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public T getData() {
            return data;
        }
    }

    /**
     *构造函数
     */
    public BSTree() {
        mRoot=null;
    }

    /**
     * 查找二叉树以x为根节点中键值为data的节点
     * @param x
     * @return data
     * @author chenghuan
     * @date 2019/10/24 22:50
    */
    private BSTNode<T> search(BSTNode<T> x , T data){
        if(x == null){
            return x;
        }
        int result = data.compareTo(x.data);
        if(result<0){
             return search(x.left,data);
        }else if(result>0){
             return  search(x.right,data);
        }else{
            return x;
        }
    }

    /**
     * 查找二叉树键值为data的节点
     * @param data
     * @return BSTNode
     * @author chenghuan
     * @date 2019/10/24 22:56
    */
    public BSTNode<T> search(T data){
        return search(mRoot,data);
    }
}

