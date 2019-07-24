package cn.struct.algorithm.hash;

import cn.struct.algorithm.linkedklist.LinkedList;
import cn.struct.algorithm.linkedklist.Node;

/**
 * @author chenghuan
 * @Description 手工实现哈希
 * @Date 2019/7/21 21:55
 */
public class DHashMap<K,V> {

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
    public DHashMap(){
        this.values = new Object[INIT_CAPACITY];
    }

    /**
     * 指定容量大小构造函数
     * @param size
     */
    public DHashMap(int size){
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
        final KeyValueNode<K,V> keyValueNode = new KeyValueNode<>(k,v);
        //判断该地址在数组中是否有值
        if(values[arr]!=null){
           //取出头节点
           final KeyValueNode<K,V> arrKeyValueNode = (KeyValueNode<K,V>)values[arr];
           //键在链表中是否存在(遍历链表)
           KeyValueNode<K,V> pointer = new KeyValueNode<>();
           pointer = arrKeyValueNode;
           while(pointer!=null){
               if(pointer.getKey().equals(k)){
                   pointer.setValue(v);
                   return;
               }
               pointer = pointer.getNext();
           }
           pointer.setNext(keyValueNode);
        }else{
            values[arr] = keyValueNode;
        }
    }

    /**
     * 根据指定的键获取值k
     * @param k
     * @return V
     */
    public V get(K k){
        final int arr = hash(k);
        final KeyValueNode<K,V> value = (KeyValueNode<K,V>)values[arr];
        return value.getValue();
    }
}
