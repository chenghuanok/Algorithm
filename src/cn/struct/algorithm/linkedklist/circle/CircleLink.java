package cn.struct.algorithm.linkedklist.circle;

import java.util.Objects;

/**
 * 循环列表
 * @Author: chenghuan
 * @Date: 2019/9/20 21:36
 */
public class CircleLink<T> {

    /**
     * 头节点
     */
    private CircleNode<T> head;


    /**
     * 初始化
     */
    public CircleLink() {
        head = new CircleNode<>();
        head.setData(null);
        head.setNext(head);
    }

    /**
     * 添加元素
     * @param t
     */
    public void add(T t) {
        if (head.getNext() == head) {
            head.setNext(new CircleNode<T>(t, head));
        } else {
            CircleNode<T> tempNode = head;
            while (tempNode.getNext() != head) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(new CircleNode<T>(t, head));
        }
    }
    
    /**
     * 删除指定的元素
     * @param t
     * @return boolean
     * @author chenghuan
     * @date 2019/9/20 21:40
     */
    public boolean delete(T t){
        if(head.getNext() == head){
            System.out.println("链表中没有指定的元素");
            return false;
        }else{
            CircleNode<T> tempNode = head;
            while (tempNode.getNext()!=head){
                if(Objects.equals(tempNode.getNext().getData(),t)){
                    tempNode.setNext(tempNode.getNext().getNext());
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        return false;
    }

    /**
     * 计算链表长度
     * @return  int
     * @author chenghuan
     * @date 2019/9/20 21:50
    */
    public int sizeCircleLink(){
        int size = 0;
        CircleNode<T> tempNode = head;
        while (tempNode.getNext()!= head){
            size++;
            tempNode = tempNode.getNext();
        }
        return size;
    }
    
    /**
     * 打印循环链表
     */
    public void printCircleLink(){
        CircleNode<T> tempNode = head;
        System.out.println("开始打印！！！");
        while(tempNode.getNext()!=head){
            tempNode = tempNode.getNext();
            System.out.print(tempNode.getData()+"->");
        }
        System.out.println("\n"+"结束打印！！！");
    }
}
