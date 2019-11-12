package cn.struct.algorithm.sort;

import java.util.stream.IntStream;

/**
 * @Author: chenghuan
 * @Date: 2019/11/11 22:20
 */
public class Sort {

    /**
     * 数组容器
     */
    private int[] a;
    
    /**
     * 数组大小
     */
    private int n;

    /**
     * 构造函数
     */
    public Sort(int[] a, int n){
        this.a = a;
        this.n = n;
    }

    /**
     * 排序
     *@author chenghuan
     *@date 2019/11/11 22:26
     */
    public void bubble(){
       for (int i = 0;i<n;i++){
           boolean flag = false;
           for(int j = 0;j<n-i-1;j++){
               if(a[j]>a[j+1]){
                   int temp = a[j+1];
                   a[j+1] = a[j];
                   a[j] = temp;
                   flag = true;
               }
           }
           if(!flag){
               break;
           }
       }
    }

    /**
     * 插入排序
     * @author chenghuan
     * @date 2019/11/12 20:54
     */
    public void insert(){
        for(int i =1;i<n;i++){
            int value = a[i];
            int j = i-1;
            for(;j>=0;j--){
               if(a[j]>value){
                   //后移
                   a[j+1] = a[j];
               }else{
                   break;
               }
            }
            //插入位置值
            a[j+1] = value;
        }
    }

    /**
     * 选择排序
     *@author chenghuan
     *@date 2019/11/12 21:25
     */
    public void select(){
       for(int i = 0;i<n-1;i++){
          int j = i+1;
          //找到最小元素下标
          int min = i;
          for(;j<n;j++){
              if(a[j]<a[min]){
                  min = j;
              }
          }
          //交换
           if(min!=i){
               int temp = a[i];
               a[i] = a[min];
               a[min] = temp;
           }
       }
    }

    /**
     * 打印
     *@author chenghuan
     *@date 2019/11/11 22:35
     */
    public void print(){
        IntStream.range(0,n).forEach(i->{
            System.out.print(a[i]+",");
        });
    }
}
