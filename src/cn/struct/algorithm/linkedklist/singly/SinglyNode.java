package cn.struct.algorithm.linkedklist.singly;

/**
 * 链表节点模型
 * @author  chenghuan
 */
public class SinglyNode<T> {
    /**
     * 数据
     */
    private T data;

    /**
     * 指针
     */
    private SinglyNode next;


    /**
     * 无参构造函数
     * @author chenghuan
     * @date 2019/9/11 22:42
    */
    public SinglyNode(){

    }

    /**
     * 有参构造函数
     * @param data 数据
     * @param next 下一个节点的指针
     * @author chenghuan
     * @date 2019/9/11 22:41
    */
    public SinglyNode(T data,SinglyNode next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public SinglyNode getNext() {
        return next;
    }

    public void setNext(SinglyNode next) {
        this.next = next;
    }
}
