package cn.chenghuan.linkedklist;

/**
 * 链表类
 * @author chenghuan
 */
public class LinkedList {

    /**
     * 创建一个单链表
     * @return Node
     */
    public static Node produceLinkedList(){
        final Node head = new Node(0);
        final Node nodeOne=new Node(1);
        final Node nodeTwo=new Node(2);
        final Node nodeThree=new Node(3);
        head.setNext(nodeOne);
        nodeOne.setNext(nodeTwo);
        nodeTwo.setNext(nodeThree);
        return head;
    }

    /**
     * 打印链表
     * @param head
     */
    public static void printLinkedList(final Node head){
       final StringBuilder stringBuilder = new StringBuilder();
       Node currentNode = head;
       stringBuilder.append(currentNode.getData());
       while(currentNode.getNext()!= null){
           currentNode=currentNode.getNext();
           stringBuilder.append("->");
           stringBuilder.append(currentNode.getData());
       }
       //打印
       System.out.println(stringBuilder.toString());
    }

    /**
     * 反转链表
     * @param head
     * @return Node
     */
    public static Node reverseLinkedList(final Node head){
        if(head==null){
            return head;
        }
        Node previousNode = head;
        Node currentNode = head.getNext();
        Node temp;
        while(currentNode!=null){
            temp=currentNode.getNext();
            currentNode.setNext(previousNode);
            //前移指针
            previousNode=currentNode;
            currentNode=temp;
        }
        head.setNext(null);
        return previousNode;
    }

}
