package cn.struct.algorithm.stack;

import cn.struct.algorithm.linkedklist.singly.SinglyNode;

/**
 * @author 程欢
 * @Description 链表实现栈
 * @Date 2019/6/15 21:48
 */
public class LinkedListStack {
    /**
     * 栈顶元素
     */
    private SinglyNode top = null;

    public SinglyNode getTop() {
        return top;
    }

    /**
     * 判断栈顶是否为空
     * @return
     */
    public boolean isEmpty(){
        return top==null;
    }

    /**
     * 入栈
     * @param object
     */
    public void push(Object object){
//      final SinglyNode newSinglyNode = new SinglyNode(object);
//      newSinglyNode.setNext(top);
//      top= newSinglyNode;
    }

    /**
     * 出栈
     */
    public Object pop(){
       if(this.isEmpty()){
           System.out.println("栈时空栈");
           return null;
       }
       Object object = top.getData();
       top = top.getNext();
       return object;
    }
}
