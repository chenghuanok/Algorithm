package cn.struct.algorithm.hashtable.link;

import cn.struct.algorithm.hash.KeyValueNode;
import cn.struct.algorithm.hashtable.HashUtil;

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
     * 扩容之前的数组
     */
    private V[] oldItems;

    /**
     * 数组容量
     */
    private int capacity;

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
    private final static double MAX_LOAD_FACTOR = 0.75;

    /**
     * 散列表中元素个数
     */
    transient int size;

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
        capacity = 2*capacity;
        KeyValueNode keyValueNode = (KeyValueNode) getOldItem();
        putNodeItems((K)keyValueNode.getKey(),(V)keyValueNode.getValue());
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
     *@author chenghuan
     *@date 2019/10/8 21:57
     */
    private V getOldItem(){
        for (int i =0;i<oldItems.length;i++){
            KeyValueNode keyValueNode = (KeyValueNode) items[i];
             if(keyValueNode!=null){
                 if(keyValueNode.getNext()!=null){

                 }
             }
        }
        return null;
    }
}
