package cn.struct.algorithm.hash;

/**
 * @author chenghuan
 * @Description 键值节点
 * @Date 2019/7/24 21:12
 */
public class KeyValueNode<K,V> {

    /**
     * 键
     */
    private K key;

    /**
     * 值
     */
    private V value;

    /**
     * 指针
     */
    private KeyValueNode next;

    /**
     * 空构造函数
     */
    public KeyValueNode(){

    }

    /**
     * 构造函数
     * @param key
     * @param value
     */
    public KeyValueNode(K key,V value){
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public KeyValueNode getNext() {
        return next;
    }

    public void setNext(KeyValueNode next) {
        this.next = next;
    }
}
