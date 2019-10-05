package cn.struct.algorithm.hashtable.simple;

import cn.struct.algorithm.hashtable.HashUtil;

/**
 * 散列表（不考虑hash冲突）
 * @Author: chenghuan
 * @Date: 2019/10/5 21:53
 */
public class SimpleHashTable<K,V> {

    /**
     * 数组存放值
     */
    private V[] items;

    /**
     * 散列表大小
     */
    private int capacity;

    /**
     * 散列表默认大小
     */
    private static final int DEFAULT_CAPACITY = 20;

    /**
     * 无参构造函数
     */
    public SimpleHashTable(){
      items = (V[]) new Object[DEFAULT_CAPACITY];
      this.capacity = DEFAULT_CAPACITY;
    }

    /**
     * 有参构造函数
     * @param capacity
     */
    public SimpleHashTable(int capacity){
       items = (V[]) new Object[capacity];
       this.capacity = capacity;
    }

    /**
     * 往散列表中存值
     * @param
     * @return
     * @author chenghuan
     * @date 2019/10/5 21:54
     */
    public void put(K k,V v){
        final int hashValue = HashUtil.observeHash(k.toString());
        items[hashValue] = v;
    }

    /**
     * 从散列表中取值
     * @param
     * @return
     * @author chenghuan
     * @date 2019/10/5 21:54
     */
    public V get(K k){
        final int hashValue = HashUtil.observeHash(k.toString());
        final V v = items[hashValue];
        return v;
    }

    /**
     * 打印
     */
    public void printSimpleHashTable(){
       for(int i = 0;i<items.length;i++){
           if(items[i] != null){
               System.out.print(items[i]+"\n");
           }
       }
    }
}
