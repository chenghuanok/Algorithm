package cn.struct.algorithm.linkedklist.singly;

/**
 * 单向链表测试类
 * @Author: chenghuan
 * @Date: 2019/9/11 23:17
 */
public class SinglyMain {
    public static void main(String[] args){
       final SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
       singlyLinkedList.addLast("chenghuan");
       singlyLinkedList.addLast("xuwenzhu");
       singlyLinkedList.addLast("xiaohu");
        singlyLinkedList.addLast("xiaobai");
       //final SinglyNode headNode = singlyLinkedList.addLast("hudie");
       //删除
       final SinglyNode headNode = singlyLinkedList.delete("xuwenzhu");
       SinglyLinkedList.printLinkedList(headNode);
    }
}
