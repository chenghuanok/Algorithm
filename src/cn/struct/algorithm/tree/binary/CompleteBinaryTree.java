package cn.struct.algorithm.tree.binary;

import java.util.Objects;
import java.util.stream.IntStream;

/**
 * 完全二叉树
 * @Author: chenghuan
 * @Date: 2019/10/20 22:07
 */
public class CompleteBinaryTree<T> {

    /**
     * 数组
     */
    private  T[] items;

    /**
     * 数组容量
     */
    private int capacity;

    /**
     * 默认容量
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 索引
     */
    private int index;

    /**
     * 带参构造函数
     */
    public CompleteBinaryTree(int capacity){
        items = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    /**
     * 默认构造函数
     */
    public CompleteBinaryTree(){
        items = (T[]) new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
    }

    /**
     * 添加节点
     * @param data
     * @return index
     * @author chenghuan
     * @date 2019/10/20 22:14
     */
    public void add(T data){
        items[++index] = data;
    }

    /**
     * 获取指定元素的根节点
     * @param data
     * @return T
     * @author chenghuan
     * @date 2019/10/20 22:50
     */
    public T getRoot(T data){
         final int index = getIndex(data);
         return items[index/2];
    }

    /**
     * 获取指定元素的左节点
     * @param data
     * @return T
     * @author chenghuan
     * @date 2019/10/21 21:03
     */
    public T getLeft(T data){
        final int index = getIndex(data);
        return items[2*index];
    }

    /**
     * 获取指定元素的右节点
     * @param data
     * @return T
     * @author chenghuan
     * @date 2019/10/21 21:05
     */
    public T getRight(T data){
        final int index = getIndex(data);
        return items[2*index+1];
    }

    /**
     * 获取指定数据的索引
     * @param data
     * @return int
     * @author chenghuan
     * @date 2019/10/20 22:50
     */
    private int getIndex(T data){
      for (int i =0;i<items.length;i++){
          if(Objects.equals(items[i],data)){
              return i;
          }
      }
        throw new RuntimeException("指定数据不存在。");
    }

    /**
     * 打印
     * @author chenghuan
     * @date 2019/10/20 22:52
     */
    public void print(){
        IntStream.range(0,items.length).forEach(i->{
            if(items[i]!= null){
                System.out.print(items[i]+"...");
            }
        });
    }
}
