package cn.struct.algorithm.stack.link;

import cn.struct.algorithm.linkedklist.singly.SinglyNode;

/**
 * 链表实现栈
 * @Author: chenghuan
 * @Date: 2019/9/21 21:37
 */
public class LinkStack<T> {

    SinglyNode<T> head = null;

    /**
     * 无参构造函数
     */
    public LinkStack(){
        head = new SinglyNode<>();
    }

    /**
     * 数据入栈（链表头插法）
     */
    public void push(T t){
       final SinglyNode<T> newNode = new SinglyNode<>(t,null);
       if(head.getNext()==null){
          head.setNext(newNode);
       }else{
           newNode.setNext(head.getNext());
           head.setNext(newNode);
       }
    }

    /**
     * 数据出栈
     */
    public T pop(){
       if(isEmpty()){
           throw new RuntimeException("栈为空!!!");
       }
       T t = (T)head.getNext().getData();
       //移除栈顶数据
       head.setNext(head.getNext().getNext());
       return t ;
    }

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty(){
        return head.getNext() == null;
    }

    /**
     * 打印
     */
    public void printLinkStack(){
        System.out.println("开始打印栈");
        SinglyNode<T> tempNode = head;
        while (tempNode.getNext()!=null){
            System.out.print(tempNode.getNext().getData()+"->");
            tempNode = tempNode.getNext();
        }
        System.out.println("\n"+"结束打印栈");
    }
}
