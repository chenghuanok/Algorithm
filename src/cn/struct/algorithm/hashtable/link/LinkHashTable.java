package cn.struct.algorithm.hashtable.link;

import cn.struct.algorithm.hash.KeyValueNode;
import cn.struct.algorithm.hashtable.HashUtil;
import org.junit.platform.engine.support.descriptor.FileSystemSource;

import java.util.HashMap;

/**
 * 散列表(链表解决散列冲突)
 * @Author: chenghuan
 * @Date: 2019/10/7 19:02
 */
public class LinkHashTable<K,V> {

    /**
     * 数组
     */
    private V[] items;

    /**
     * 数组容量
     */
    private int capacity;

    /**
     * 旧数组容量
     */
    private int oldCapacity = 0;

    /**
     * 扩容之前的数组
     */
    private V[] oldItems = (V[]) new Object[oldCapacity];

    /**
     * 默认数组容量
     */
    private final static int DEFAULT_CAPACITY = 10;

    /**
     * 链表
     */
    private LinkKeyValue<K,V> linkKeyValue = null;

    /**
     * 装载因子
     */
    private final static float MAX_LOAD_FACTOR = 0.75f;

    /**
     * 散列表中元素个数
     */
    transient int size;

    /**
     * 扩容前散列表中元素个数
     */
    transient int oldSize;

    /**
     * 默认构造函数
     */
    public LinkHashTable(){
        items = (V[]) new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
    }

    public LinkHashTable(int capacity){
        items = (V[]) new Object[capacity];
        this.capacity = capacity;
    }

    /**
     * 存值
     * @param
     * @author chenghuan
     * @date 2019/10/7 19:48
     */
    public void put(K k,V v){
        if(isGrowCapacity()){
            growCapacity();
        }
        //从旧的数组中取一个元素放入数组中
        KeyValueNode keyValueNode = (KeyValueNode) getOldItem();
        if(keyValueNode!=null){
            putNodeItems((K)keyValueNode.getKey(),(V)keyValueNode.getValue());
        }
        putNodeItems(k,v);
//        final int hashValue = HashUtil.linearHash(k.toString(),capacity);
//        if(items[hashValue]==null){
//            linkKeyValue= new LinkKeyValue<>();
//            items[hashValue] = (V) linkKeyValue.addFirst(k,v);
//            size++;
//            return;
//        }
//        //判断对应的k是否存在，若存在则删除并插入链表，若不存在插入链表
//        final boolean flag = linkKeyValue.isExist(k, (KeyValueNode) items[hashValue]);
//        if(flag){
//            linkKeyValue.delete(k, (KeyValueNode) items[hashValue]);
//            size--;
//        }
//        linkKeyValue.addFirst(k,v, (KeyValueNode) items[hashValue]);
//        size++;
    }

    /**
     * 取值
     * @param k
     * @author chenghuan
     * @date 2019/10/7 19:48
     */
    public V get(K k){
          V v = getValue(items,k,capacity);
          if(v!=null){
              return v;
          }
          v = getValue(oldItems,k,oldCapacity);
          if(v!=null){
              return v;
          }
          HashMap<String,String> map = new HashMap<>();
          return null;
//        final int hashValue = HashUtil.linearHash(k.toString(),capacity);
//        if(items[hashValue] == null){
//            return null;
//        }
//        final KeyValueNode keyValueNode = (KeyValueNode) items[hashValue];
//        final LinkKeyValue linkKeyValue = new LinkKeyValue();
//        final V v = (V) linkKeyValue.get(keyValueNode,k);
//        return v;
    }

    /**
     * 取值
     * @param k
     * @param items
     * @param capacity
     * @author chenghuan
     * @date 2019/10/7 19:48
     */
    private V getValue(V[] items,K k,int capacity){
        final int hashValue = HashUtil.linearHash(k.toString(),capacity);
        if(items[hashValue] == null){
            return null;
        }
        final KeyValueNode keyValueNode = (KeyValueNode) items[hashValue];
        final LinkKeyValue linkKeyValue = new LinkKeyValue();
        final V v = (V) linkKeyValue.get(keyValueNode,k);
        return v;
    }

    /**
     * 散列表中元素个数
     * @author chenghuan
     * @date 2019/10/7 19:48
     */
    public int getSize(){
        return this.size;
    }

    /**
     * 旧散列表中元素个数
     * @author chenghuan
     * @date 2019/10/7 19:48
     */
    public int getOldSize(){
        return this.oldSize;
    }

    /**
     * 打印
     */
    public void printLinkHashTable(){
       final LinkKeyValue linkKeyValue = new LinkKeyValue();
       for (int i =0;i<items.length;i++){
           if(items[i]!=null){
               linkKeyValue.printLinkedList((KeyValueNode) items[i]);
           }
       }
    }

    /**
     * 打印
     */
    public void printOldLinkHashTable(){
        final LinkKeyValue linkKeyValue = new LinkKeyValue();
        for (int i =0;i<oldItems.length;i++){
            if(oldItems[i]!=null){
                linkKeyValue.printLinkedList((KeyValueNode) oldItems[i]);
            }
        }
    }

    /**
     * 是否扩容
     * @return boolean
     *@author chenghuan
     *@date 2019/10/8 21:57
     */
    private boolean isGrowCapacity(){
       double loadFactor = (double) size/capacity;
       if(loadFactor>MAX_LOAD_FACTOR){
           return true;
       }
       return false;
    }

    /**
     * 扩容
     * @return boolean
     *@author chenghuan
     *@date 2019/10/8 21:57
     */
    private void growCapacity(){
        oldItems = items;
        items = (V[]) new Object[2*capacity];
        oldCapacity = capacity;
        capacity = 2*capacity;
        oldSize = size;
        size = 0;
    }


    private void putNodeItems(K k, V v){
        final int hashValue = HashUtil.linearHash(k.toString(),capacity);
        if(items[hashValue]==null){
            linkKeyValue= new LinkKeyValue<>();
            items[hashValue] = (V) linkKeyValue.addFirst(k,v);
            size++;
            return;
        }
        //判断对应的k是否存在，若存在则删除并插入链表，若不存在插入链表
        final boolean flag = linkKeyValue.isExist(k, (KeyValueNode) items[hashValue]);
        if(flag){
            linkKeyValue.delete(k, (KeyValueNode) items[hashValue]);
            size--;
        }
        linkKeyValue.addFirst(k,v, (KeyValueNode) items[hashValue]);
        size++;
    }

    /**
     * 从数组中取一个元素
     * @return boolean
     * @author chenghuan
     * @date 2019/10/8 21:57
     */
    private V getOldItem(){
        for (int i =0;i<oldItems.length;i++){
            KeyValueNode keyValueNode = (KeyValueNode) oldItems[i];
             if(keyValueNode!=null){
                 if(keyValueNode.getNext()!=null){
                       KeyValueNode tempNode = keyValueNode.getNext();
                       keyValueNode.setNext(keyValueNode.getNext().getNext());
                       oldSize--;
                       return (V) tempNode;
                 }
             }
        }
        return null;
    }
}
