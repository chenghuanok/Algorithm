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

    /**
     * 插入
     * @param bsTree
     * @param insertNode
     * @author chenghuan
     * @date 2019/10/25 21:07
     */
    private void insert(BSTree<T> bsTree,BSTNode<T> insertNode){
        BSTNode<T> insertNodeParent = null;
        int compareResult;
        BSTNode<T> insertPositionNode = bsTree.mRoot;
        //寻找插入的节点位置
        while(insertPositionNode!=null){
            insertNodeParent = insertPositionNode;
            compareResult = insertNode.data.compareTo(insertPositionNode.data);
            if(compareResult<0){
               insertPositionNode = insertPositionNode.left;
            }else{
               insertPositionNode = insertPositionNode.right;
            }
        }
        insertNode.parent = insertNodeParent;
        if(insertNodeParent == null){
            bsTree.mRoot = insertNode;
        }else{
            compareResult = insertNode.data.compareTo(insertNodeParent.data);
            if(compareResult<0){
                insertNodeParent.left = insertNode;
            }else{
                insertNodeParent.right = insertNode;
            }
        }
    }

    /**
     * 插入
     * @param data
     * @author chenghuan
     * @date 2019/10/25 22:25
     */
    public void insert(T data){
        BSTNode<T> insertNode = new BSTNode<>(data,null,null,null);
        insert(this,insertNode);
    }

    /**
     * 查找最小结点：返回rootNodeTree为根结点的二叉树的最小结点。
     * @param rootNodeTree
     * @return BSTNode
     * @author chenghuan
     * @date 2019/10/26 21:32
     */
    private BSTNode<T> minNode(BSTNode<T> rootNodeTree){
        if(rootNodeTree==null){
            return null;
        }
        BSTNode<T> minNode = rootNodeTree;
        while(minNode.left!=null){
            minNode = minNode.left;
        }
        return minNode;
    }

    /**
     * 找结点node的后继结点。即，查找"二叉树中数据值大于该结点"的"最小结点"。
     * @param node
     * @return BSTNode
     * @author chenghuan
     *  2019/10/26 22:06
     */
    private BSTNode<T> successor(BSTNode<T> node){
        if(node.right!=null){
            return minNode(node.right);
        }
        BSTNode<T> targetNode = node.parent;
        //1.node是一个左节点，则node的后继节点为他的父节点
        //2.node是一个右节点，则node的后继节点为他的父节点的父节点
        if(targetNode!=null&&node == targetNode.right){
            targetNode = targetNode.parent;
        }
        return targetNode;
    }

    /**
     * 删除指定的节点
     * @param node
     * @author chenghuan
     * @date 2019/10/26 22:17
     */
    private void delete(BSTNode<T> node){
        if(node.right!=null&&node.left!=null){
            //找到该节点的后继节点
            BSTNode<T> successorNode = successor(node);
            //讲后继节点的值设置到当前节点
            node.data = successorNode.data;
            //讲删除的当前节点设置为后继节点
            node = successorNode;
        }
        BSTNode<T> child ;
        if(node.left!=null){
            child = node.left;
        }else{
            child = node.right;
        }
        //如果child不为null,则node有一个节点
        if(child!=null){
           child.parent = node.parent;
        }
        //当前节点没有父节点，要删除的是根节点
        if(node.parent==null){
            mRoot = child;
        }else if(node == node.parent.left){
            node.parent.left = child;
        }else if(node == node.parent.right){
            node.parent.right = child;
        }
    }

    /**
     * 删除
     * @param data
     * @author chenghuan
     * @date 2019/10/26 23:06
     */
    public void delete(T data){
         //查找要删除的节点
        BSTNode<T> node = search(data);
        if(node!=null){
            delete(node);
        }
    }

    /**
     * 中序遍历
     *@author chenghuan
     *@date 2019/10/26 22:55
     */
    public void middle(BSTNode<T> tree){
      if(tree!=null){
          middle(tree.left);
          System.out.print(tree.data+",");
          middle(tree.right);
      }
    }
}

