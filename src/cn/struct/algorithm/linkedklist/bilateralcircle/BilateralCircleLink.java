package cn.struct.algorithm.linkedklist.bilateralcircle;

import java.util.Objects;

/**
 * 双向循环链表
 * @Author: chenghuan
 * @Date: 2019/9/25 21:09
 */
public class BilateralCircleLink<T> {

    /**
     * 头节点
     */
    private BilateralCircleNode<T> head;

    /**
     * 构造函数
     */
    public BilateralCircleLink(){
        head = new BilateralCircleNode<>();
        head.setData(null);
        head.setPreNode(head);
        head.setNextNode(head);
    }

    /**
     * 添加元素
     * @param t
     */
    public void add(T t){
        if(head.getNextNode() == head){
            head.setNextNode(new BilateralCircleNode<T>(t, head, head));
        }else{
            BilateralCircleNode<T> tempNode = head;
            while(tempNode.getNextNode()!=head){
                tempNode = tempNode.getNextNode();
            }
            tempNode.setNextNode(new BilateralCircleNode<T>(t, tempNode, head));
        }
    }

    /**
     * 删除元素
     * @param t
     */
    public boolean delete(T t){
        if(head.getNextNode() == head){
            System.out.println("链表为空，没有可删除的值");
            return false;
        }else{
            BilateralCircleNode<T> tempNode = head;
            while(tempNode.getNextNode()!=head){
                if(Objects.equals(tempNode.getNextNode().getData(), t)){
                    BilateralCircleNode<T> newNode = tempNode.getNextNode().getNextNode();
                    tempNode.setNextNode(newNode);
                    if(newNode!=head){
                        newNode.setPreNode(tempNode);
                    }
                    return true;
                }
                tempNode = tempNode.getNextNode();
            }
        }
        return false;
    }

    /**
     * 打印链表
     */
    public void printBilateraCircleLink(){
        BilateralCircleNode<T> tempNode = head;
        System.out.println("开始打印！！！");
        while(tempNode.getNextNode()!=head){
            tempNode = tempNode.getNextNode();
            System.out.print(tempNode.getData()+"->");
        }
        System.out.println("\n"+"结束打印！！！");
    }
}
