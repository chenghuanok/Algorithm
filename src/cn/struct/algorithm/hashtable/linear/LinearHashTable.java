package cn.struct.algorithm.hashtable.linear;

import cn.struct.algorithm.hashtable.HashUtil;

/**
 * 散列表(线性探测解决散列冲突)
 * @Author: chenghuan
 * @Date: 2019/10/6 21:46
 */
public class LinearHashTable<K,V> {

    /**
     * 数组存放值
     */
    private DataItem[] items;

    /**
     * 散列表大小
     */
    private int capacity;

    /**
     * 删除的值
     */
    private DataItem deleteDataItem = new DataItem("-1") ;

    /**
     * 散列表默认大小
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 无参构造函数
     */
    public  LinearHashTable(){
        items =  new DataItem[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
    }

    /**
     * 有参构造函数
     */
    public LinearHashTable(int capacity){
        items = new DataItem[capacity];
        this.capacity = capacity;
    }

    /**
     * 存值
     * @param k
     * @param v
     * @author chenghuan
     * @date 2019/10/6 22:17
     */
    public void put(K k,V v){
       int hashValue = HashUtil.linearHash(k.toString(),capacity);
       while(items[hashValue]!=null&&!items[hashValue].getData().
               equals(deleteDataItem.getData())){
           hashValue++;
           //是否是最后一个位置
           hashValue %= capacity;
       }
       items[hashValue] = new DataItem(k,v);
    }

    /**
     * 根据键取值
     * @param k
     * @return v
     * @author chenghuan
     * @date 2019/10/6 22:37
     */
    public V get(K k){
        int hashValue = HashUtil.linearHash(k.toString(),capacity);
        while(items[hashValue]!=null){
            if(items[hashValue].getKey().equals(k)){
                return (V) items[hashValue].getData();
            }
            hashValue++;
            hashValue %=capacity;
        }
        return null;
    }

    /**
     * 删除k对应的值
     * @param k
     * @author chenghuan
     * @date 2019/10/6 22:48
     */
    public void delete(K k){
        int hashValue = HashUtil.linearHash(k.toString(),capacity);
        while(items[hashValue]!=null){
           if(items[hashValue].getKey().equals(k)){
              items[hashValue] = new DataItem("-1");
           }
           hashValue++;
           hashValue %= capacity;
        }
    }

    /**
     * 打印
     */
    public void printLinearHashTable(){
      for (int i = 0;i<items.length;i++){
          if(items[i]!=null&&!items[i].getData().equals(deleteDataItem.getData())){
              System.out.print(items[i].getData()+"\n");
          }
      }
    }
}
