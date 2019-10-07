package cn.struct.algorithm.hashtable.link;

import cn.struct.algorithm.hash.KeyValueNode;
import java.util.Objects;

/**
 * 键值节点链表操作
 * @Author: chenghuan
 * @Date: 2019/10/7 19:52
 */
public class LinkKeyValue<K,V> {

    /**
     * 头结点
     */
    private KeyValueNode head;

    /**
     * 构造函数
     */
    public LinkKeyValue(){
        this.head = new KeyValueNode<>(null,null,null);
    }

    /**
     * 添加节点到头部
     * @param k
     * @param v
     * @author chenghuan
     * @date 2019/10/7 20:26
     */
    public KeyValueNode addFirst(K k, V v){
        head.setNext(new KeyValueNode(k,v,head.getNext()));
        return head;
    }

    /**
     * 添加节点到头部
     * @param k
     * @param v
     * @author chenghuan
     * @date 2019/10/7 20:26
     */
    public KeyValueNode addFirst(K k, V v,KeyValueNode head){
        head.setNext(new KeyValueNode(k,v,head.getNext()));
        return head;
    }

    /**
     * 链表中是否存在对应的k
     * @param k
     * @return boolean
     * @author chenghuan
     * @date 2019/10/7 20:26
     */
    public boolean isExist(K k){
      KeyValueNode tempNode = head.getNext();
      while(tempNode!=null){
         if(Objects.equals(tempNode.getKey(),k)){
             return true;
         }
         tempNode = tempNode.getNext();
      }
      return false;
    }

    /**
     * 链表中的head是否存在对应的k
     * @param k
     * @param head
     * @return boolean
     * @author chenghuan
     * @date 2019/10/7 20:26
     */
    public boolean isExist(K k,KeyValueNode head){
        KeyValueNode tempNode = head.getNext();
        while(tempNode!=null){
            if(Objects.equals(tempNode.getKey(),k)){
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }

    /**
     * 删除链表中对应的k节点
     * @param k
     * @author chenghuan
     * @date 2019/10/7 20:26
     */
    public void delete(K k){
        KeyValueNode tempNode = head;
        while(tempNode.getNext()!=null){
            if(Objects.equals(tempNode.getNext().getKey(),k)){
                tempNode.setNext(tempNode.getNext().getNext());
                return;
            }
            tempNode = tempNode.getNext();
        }
        throw new RuntimeException("指定的数据不存在");
    }

    /**
     * 删除链表中对应的k节点
     * @param k
     * @author chenghuan
     * @date 2019/10/7 20:26
     */
    public void delete(K k,KeyValueNode keyValueNode){
        KeyValueNode currentNode = keyValueNode;
        while(currentNode.getNext()!=null){
            if(Objects.equals(currentNode.getNext().getKey(),k)){
                currentNode.setNext(currentNode.getNext().getNext());
                return;
            }
            currentNode = currentNode.getNext();
        }
        throw new RuntimeException("指定的数据不存在");
    }

    /**
     * 获取对应k的节点value
     * @param k
     * @author chenghuan
     * @date 2019/10/7 20:26
     */
    public V get(K k){
       KeyValueNode tempNode = head;
       while(tempNode.getNext()!=null){
           if(Objects.equals(tempNode.getNext().getKey(),k)){
               return (V) tempNode.getNext().getValue();
           }
           tempNode = tempNode.getNext();
       }
       return null;
    }

    /**
     * 根据Node和k获取节点value
     * @param k
     * @author chenghuan
     * @date 2019/10/7 20:26
     */
    public V get(KeyValueNode keyValueNode,K k){
        KeyValueNode tempNode = keyValueNode;
        while(tempNode.getNext()!=null){
            if(Objects.equals(tempNode.getNext().getKey(),k)){
                return (V) tempNode.getNext().getValue();
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    /**
     * 打印链表
     */
    public void printLinkedList(KeyValueNode keyValueNode) {
        final StringBuilder stringBuilder = new StringBuilder();
        KeyValueNode  currentNode = null;
        if(keyValueNode==null){
            currentNode= head.getNext();
        }else{
            currentNode = keyValueNode.getNext();
        }
        while (currentNode != null) {
            stringBuilder.append(currentNode.getValue());
            currentNode = currentNode.getNext();
            stringBuilder.append("->");
        }
        //打印
        System.out.println(stringBuilder.toString());
    }
}
