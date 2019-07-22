package cn.struct.algorithm.hash;

import cn.struct.algorithm.linkedklist.LinkedList;
import cn.struct.algorithm.linkedklist.Node;

/**
 * @author chenghuan
 * @Description 手工实现哈希
 * @Date 2019/7/21 21:55
 */
public class HashKeyValue<K,V> {

    /**
     * 默认初始容器
     */
    private final static int INIT_CAPACITY = 10;

    /**
     * 容器大小
     */
    private Object[] values;

    /**
     * 默认构造函数
     */
    public HashKeyValue(){
        this.values = new Object[INIT_CAPACITY];
    }

    /**
     * 指定容量大小构造函数
     * @param size
     */
    public HashKeyValue(int size){
        this.values = new Object[size];
    }

    /**
     * hash函数
     * @param k
     * @return int
     */
    public int hash(K k){
       return (Integer) k%10;
    }

    /**
     * 设置值
     */
    public void put(K k,V v){
        final int arr = hash(k);
        final Node<V> node = new Node<V>(v);
        //判断该地址在数组中是否有值
        if(values[arr]!=null){
           final LinkedList linkedList = new LinkedList();
           final Node<V> arrNode = (Node<V>)values[arr];
           Node<V> pointer = new Node<V>(v);
           pointer = arrNode.getNext();
           while (pointer!= null){
               pointer = pointer.getNext();
           }
           pointer.setNext(arrNode);
        }else{
            values[arr] = node;
        }
    }

    /**
     * 根据指定的键获取值k
     * @param k
     * @return V
     */
    public V get(K k){
        final int arr = hash(k);
        final Node<V> value = (Node<V>) values[arr];
        return value.getData();
    }
}
