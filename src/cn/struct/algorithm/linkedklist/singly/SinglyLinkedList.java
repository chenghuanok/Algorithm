package cn.struct.algorithm.linkedklist.singly;

/**
 * 链表类
 * @author chenghuan
 */
public class SinglyLinkedList<T> {

    /**
     * 哨兵节点
     */
    private final SinglyNode<T> SENTINEL_NODE = new SinglyNode<>();

    /**
     * 头结点
     */
    private final SinglyNode<T> headNode = SENTINEL_NODE;

    /**
     * 添加节点数据
     * @param  t 泛型
     * @return SinglyNode 头结点
     * @author chenghuan
     * @date 2019/9/11 23:32
     */
    public  SinglyNode<T> addLast(final T t) {
         SinglyNode<T> currentNode = headNode;
         while(currentNode.getNext()!= null){
             currentNode = currentNode.getNext();
         }
         currentNode.setNext(new SinglyNode(t,null));
         return headNode;
    }

    /**
     * 打印链表
     *
     * @param head
     */
    public static void printLinkedList(final SinglyNode head) {
        final StringBuilder stringBuilder = new StringBuilder();
        SinglyNode currentSinglyNode = head.getNext();
        while (currentSinglyNode != null) {
            stringBuilder.append(currentSinglyNode.getData());
            currentSinglyNode = currentSinglyNode.getNext();
            stringBuilder.append("->");
        }
        //打印
        System.out.println(stringBuilder.toString());
    }

    /**
     * 反转链表
     *
     * @param head
     * @return Node
     */
    public static SinglyNode reverseLinkedList(final SinglyNode head) {
        if (head == null) {
            return head;
        }
        SinglyNode previousSinglyNode = head;
        SinglyNode currentSinglyNode = head.getNext();
        SinglyNode temp;
        while (currentSinglyNode != null) {
            temp = currentSinglyNode.getNext();
            currentSinglyNode.setNext(previousSinglyNode);
            //前移指针
            previousSinglyNode = currentSinglyNode;
            currentSinglyNode = temp;
        }
        head.setNext(null);
        return previousSinglyNode;
    }

    /**
     * 判断链表是否有环
     *
     * @param head
     * @return
     */
    public static boolean isLoop(final SinglyNode head) {
        SinglyNode slowPointer = head;
        SinglyNode fastPointer = head;
        if (head == null) {
            return false;
        }
        while (fastPointer != null && fastPointer.getNext() != null) {
            //慢指针走一步
            slowPointer = slowPointer.getNext();
            //快指针走两步
            fastPointer = fastPointer.getNext().getNext();
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }
}
