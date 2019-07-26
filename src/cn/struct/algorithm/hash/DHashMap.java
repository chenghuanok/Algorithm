package cn.struct.algorithm.hash;

/**
 * @author chenghuan
 * @Description 手工实现哈希map
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
     * 存值
     * @param k
     * @param v
     */
    public void put(K k,V v){
        final int arr = hash(k);
        final KeyValueNode<K,V> keyValueNode = new KeyValueNode<>(k,v);
        //判断该地址对应的数组中是否有节点（没有直接存放节点，有进行键是否存在判断）
        if(isExistNode(arr)){
            //键在链表存在则覆盖值，不存在则存放在链表的尾部
            //取出头节点
            final KeyValueNode<K,V> arrKeyValueNode = (KeyValueNode<K,V>)values[arr];
            KeyValueNode<K,V> pointer = arrKeyValueNode;
            if(isExistKey(k,pointer)){
                pointer.setValue(v);
            }else{
                pointer.setNext(keyValueNode);
            }
        }else{
            values[arr] = keyValueNode;
        }
    }

    /**
     * 对应的下标位置是否存在节点
     * @param arr
     * @return boolean
     */
    private boolean isExistNode(final int arr){
        if(values[arr]!=null){
            return true;
        }
        return false;
    }

    /**
     * 判断链表中是否存在给定的键
     * @param k
     * @param pointer
     * @return boolean
     */
    private boolean isExistKey(final K k, KeyValueNode<K,V> pointer){
        while(pointer!=null){
           if(pointer.getKey().equals(k)){
               return true;
           }
           pointer = pointer.getNext();
        }
        return false;
    }

    /**
     * 根据指定的键获取值k
     * @param k
     * @return V
     */
    public V get(K k){
        final int arr = hash(k);
        if(isExistNode(arr)){
            //取出头节点
            final KeyValueNode<K,V> value = (KeyValueNode<K,V>)values[arr];
            KeyValueNode<K,V> pointer = value;
            while(pointer!=null){
                if(pointer.getKey().equals(k)){
                    return pointer.getValue();
                }
                pointer = pointer.getNext();
            }
            return null;
        }
        return null;
    }
}
