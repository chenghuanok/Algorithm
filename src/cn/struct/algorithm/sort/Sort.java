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
