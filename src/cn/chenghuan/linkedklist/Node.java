package cn.chenghuan.linkedklist;

/**
 * 链表节点模型
 * @author  chenghuan
 */
public class Node {
    /**
     * 数据
     */
    private int data;

    /**
     * 指针
     */
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
