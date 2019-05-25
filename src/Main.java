import cn.chenghuan.linkedklist.LinkedList;
import cn.chenghuan.linkedklist.Node;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //创建链表
        final Node head=LinkedList.produceLinkedList();
        //打印原始链表
        LinkedList.printLinkedList(head);
        //反转链表
        final Node newHead = LinkedList.reverseLinkedList(head);
        //打印反转链表
        LinkedList.printLinkedList(newHead);
    }
}
