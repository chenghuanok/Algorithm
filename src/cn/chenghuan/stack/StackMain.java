package cn.chenghuan.stack;

import cn.chenghuan.linkedklist.LinkedList;

/**
 * @author 程欢
 * @Description 测试
 * @Date 2019/6/14 21:06
 */
public class StackMain {

   public static void main(String[] args){
//        final ArrayStack<String> arrayStack = new ArrayStack<>(5);
//        //入栈
//        arrayStack.push("chenghuan");
//        arrayStack.push("huzhuqing");
//        arrayStack.push("xiaoxu");
//        arrayStack.push("xiaoxu2");
//        arrayStack.push("xiaoxu3");
//        arrayStack.push("xiaoxu4");
//        arrayStack.pop();
//        arrayStack.print();
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.pop();
        LinkedList.printLinkedList(linkedListStack.getTop());
    }
}
