package cn.struct.algorithm.linkedklist.circle;

/**
 * 循环链表节点
 * @Author: chenghuan
 * @Date: 2019/9/20 21:30
 */
public class CircleNode<T> {
    
    /**
     * 节点数据
     */
    private T data;
    
    /**
     * 指向下一个节点的指针
     */
    private CircleNode<T> next;

    /**
     * 无参构造函数
     */
    public CircleNode(){

    }

    /**
     * 有参构造函数
     */
    public CircleNode(T data,CircleNode<T> next){
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CircleNode<T> getNext() {
        return next;
    }

    public void setNext(CircleNode<T> next) {
        this.next = next;
    }
}
