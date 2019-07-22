import cn.struct.algorithm.linkedklist.LinkedList;
import cn.struct.algorithm.linkedklist.Node;
public class Main {

    public static void main(String[] args) {
         isLoopLinkedList();
    }

    /**
     * 反转链表
     */
    public static void reverseLinkedList(){
        //创建链表
        final Node head=LinkedList.produceLinkedList();
        //打印原始链表
        LinkedList.printLinkedList(head);
        //反转链表
        final Node newHead = LinkedList.reverseLinkedList(head);
        //打印反转链表
        LinkedList.printLinkedList(newHead);
    }

    /**
     * 检测链表是否有环
     * @return boolean
     */
    public static void isLoopLinkedList(){
        //创建有环链表
        final Node head = LinkedList.produceLinkedList();
        //检测是否有环
        final boolean isLoopFlag = LinkedList.isLoop(head);
        if(isLoopFlag){
            System.out.println("链表有环！！！");
        }else {
            System.out.println("链表没有环！！！");
        }
    }
}
