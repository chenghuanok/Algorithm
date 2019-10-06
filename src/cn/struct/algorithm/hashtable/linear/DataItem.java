package cn.struct.algorithm.hashtable.linear;

/**
 * 存储数据
 * @Author: chenghuan
 * @Date: 2019/10/6 21:54
 */
public class DataItem<T> {

    /**
     *数据
     */
    private T data;

    /**
     *键
     */
    private T key;

    /**
     * 构造函数
     */
    public DataItem(T key,T data){
        this.key = key;
        this.data = data;
    }

    /**
     * 构造函数
     */
    public DataItem(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public T getKey() {
        return key;
    }
}
