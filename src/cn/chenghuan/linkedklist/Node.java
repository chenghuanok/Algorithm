package cn.chenghuan.linkedklist;

/**
 * 链表节点模型
 * @author  chenghuan
 */
public class Node {
    /**
     * 数据
     */
    private Object data;

    /**
     * 指针
     */
    private Node next;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
