package cn.struct.algorithm.queue.link;

import cn.struct.algorithm.linkedklist.bilateral.BilateralCircleNode;

/**
 * 链表实现队列
 * @Author: chenghuan
 * @Date: 2019/9/22 22:41
 */
public class LinkQueue<T> {

    /**
     * 头结点
     */
    private BilateralCircleNode<T> head;

    /**
     * 无参构造函数
     */
    public LinkQueue(){
        head = new BilateralCircleNode<>();
        head.setData(null);
        head.setPreNode(head);
        head.setNextNode(head);
    }

    /**
     * 元素入队
     * @param t
     */
    public void enqueue(T t){
        BilateralCircleNode<T> preNode = head.getPreNode();
        BilateralCircleNode<T> newNode = new BilateralCircleNode<>(t,preNode,head);
        preNode.setNextNode(newNode);
        head.setPreNode(newNode);
    }

    /**
     * 元素出队
     * @return
     */
    public T dequeue(){
        if(head.getNextNode()==head){
            throw new RuntimeException("队列为空！！！");
        }
        T t = head.getNextNode().getData();
        head.setNextNode(head.getNextNode().getNextNode());
        head.getNextNode().getNextNode().setNextNode(head);
        return t;
    }

    /**
     * 打印队列
     */
    public void printLinkQueue(){
        System.out.println("开始打印队列");
        BilateralCircleNode<T> tempNode = head;
        while (tempNode.getNextNode()!=head){
            System.out.print(tempNode.getNextNode().getData()+"->");
            tempNode = tempNode.getNextNode();
        }
        System.out.println("\n"+"结束打印队列");
    }
}
