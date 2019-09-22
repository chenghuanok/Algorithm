package cn.struct.algorithm.linkedklist.bilateral;

/**
 * @Author: chenghuan
 * @Date: 2019/9/22 22:46
 */
public class BilateralCircleNode<T> {

    /**
     * 数据
     */
    private T data;

    /**
     * 指向前一个节点的指针
     */
    private BilateralCircleNode<T> preNode;

    /**
     * 指向后一个节点的指针
     */
    private BilateralCircleNode<T> nextNode;

    /**
     * 无参构造函数
     */
    public BilateralCircleNode(){

    }

    /**
     * 有参构造函数
     */
    public BilateralCircleNode(T t,BilateralCircleNode<T> preNode,BilateralCircleNode<T> nextNode){
         this.data = t;
         this.preNode = preNode;
         this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BilateralCircleNode<T> getPreNode() {
        return preNode;
    }

    public void setPreNode(BilateralCircleNode<T> preNode) {
        this.preNode = preNode;
    }

    public BilateralCircleNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(BilateralCircleNode<T> nextNode) {
        this.nextNode = nextNode;
    }
}
