package cn.struct.algorithm.linkedklist;

/**
 * 链表节点模型
 * @author  chenghuan
 */
public class Node<T> {
    /**
     * 数据
     */
    private T data;

    /**
     * 指针
     */
    private Node next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
