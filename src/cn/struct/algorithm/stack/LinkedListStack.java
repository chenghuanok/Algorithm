package cn.struct.algorithm.stack;

import cn.struct.algorithm.linkedklist.Node;

/**
 * @author 程欢
 * @Description 链表实现栈
 * @Date 2019/6/15 21:48
 */
public class LinkedListStack {
    /**
     * 栈顶元素
     */
    private Node top = null;

    public Node getTop() {
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
      final Node newNode = new Node(object);
      newNode.setNext(top);
      top=newNode;
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
