package cn.struct.algorithm.heap;

import java.util.stream.IntStream;

/**
 * 堆
 * @Author: chenghuan
 * @Date: 2019/12/17 22:04
 */
public class Heap {

    /**
     * 数组从下标为1开始存储数据
     */
    private int[] data;

    /**
     * 堆中存储的最大数据个数
     */
    private int capicity;

    /**
     * 堆中已经存储的数据个数
     */
    private int count;

    /**
     * 默认构造函数
     */
    public Heap(int capicity){
        data = new int[capicity+1];
        this.capicity = capicity;
        count = 0;
    }

    /**
     * 往堆中插入一个数据
     * @param value
     * @author chenghuan
     * @date 2019/12/17 22:11
     */
    public void insert(int value){
       if(count>=capicity){
           return;
       }
       ++count;
       data[count] = value;
       int i = count;
       while (i/2>0&&data[i]>data[i/2]){
           int temp = data[i/2];
           data[i/2] = data[i];
           data[i] = temp;
           i = i/2;
       }
    }

    /**
     * 打印
     *@author chenghuan
     *@date 2019/12/17 22:18
     */
    public void print(){
        IntStream.range(1,capicity+1).forEach(i->{
            if(data[i]!=0){
                System.out.print(data[i]+"...");
            }
        });
    }
}
