package cn.struct.algorithm.stack;

import cn.struct.algorithm.linkedklist.LinkedList;

/**
 * @author 程欢
 * @Description 测试
 * @Date 2019/6/14 21:06
 */
public class StackMain {

   public static void main(String[] args){

         // testArrayStack();
         //testLinkedListStack();
        final boolean flag = ArrayUtils.isValid("({[}})");
        if(flag){
            System.out.println("字符串匹配！！！");
        }else{
            System.out.println("字符串不匹配！！！");
        }
    }

    /**
     * 测试数组实现的栈
     */
    private static void testArrayStack(){
        final ArrayStack<String> arrayStack = new ArrayStack<>(5);
        //入栈
        arrayStack.push("chenghuan");
        arrayStack.push("huzhuqing");
        arrayStack.push("xiaoxu");
        arrayStack.push("xiaoxu2");
        arrayStack.push("xiaoxu3");
        arrayStack.push("xiaoxu4");
        arrayStack.pop();
        arrayStack.print();
    }

    /**
     * 测试链表实现的栈
     */
    private static void testLinkedListStack(){
        final LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.pop();
        LinkedList.printLinkedList(linkedListStack.getTop());
    }
}
