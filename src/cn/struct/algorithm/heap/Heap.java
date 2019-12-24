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

    public Heap(int[] data){
        this.data = data;
    }

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
     * 删除堆顶元素
     * @author chenghuan
     * @date 2019/12/18 21:39
     */
    public boolean removeTop(){
       if(count==0){
           return false;
       }
       data[1] = data[count];
       --count;
       heapify(1,count);
       return true;
    }

    /**
     * 排序
     * @author chenghuan
     * @date 2019/12/21 15:27
     */
    public void sort(){
        buildHeap();
        int k = count;
        while (k>1){
            swap(1,k);
            k--;
            heapify(1,k);
        }
    }

    /**
     * 建堆
     * @author chenghuan
     * @date 2019/12/21 15:33
    */
    private void buildHeap(){
      for (int i = count/2;i>=1;i--){
          heapify(i,count);
      }
    }

    /**
     * 构建最小堆
     * @author chenghuan
     * @date 2019/12/24 21:48
     */
    private void buildMinHeap(){
        for(int i =count/2;i>=1;i--){
            minHeapify(i,count);
        }
    }

    /**
     * 最小堆堆化
     * @author chenghuan
     * @date 2019/12/24 21:51
     */
    private void minHeapify(int i ,int count){
       while (true){
           int minPos = i;
           if(2*i<=count&&data[2*i]<data[i]){
               minPos = 2*i;
           }
           if(2*i+1<=count&&data[minPos]>data[2*i+1]){
               minPos = 2*i+1;
           }
           if(minPos ==i){
               break;
           }
           swap(i,minPos);
           i = minPos;
       }
    }

    /**
     * 堆化
     * @param i
     * @param count
     * @author chenghuan
     * @date 2019/12/18 21:42
    */
    private void heapify(int i,int count){
       while (true){
         int maxPos = i;
         if(2*i<=count&&data[2*i]>data[i]){
             maxPos = 2*i;
         }
         if(2*i+1<=count&&data[maxPos]<data[2*i+1]){
            maxPos = 2*i+1;
         }
         if(maxPos ==i){
             break;
         }
         swap(i,maxPos);
         i = maxPos;
       }
    }

    /**
     *
     * @param i
     * @return maxPos
     * @author chenghuan
     * @date 2019/12/18 21:48
     */
    private void swap(int i,int maxPos){
        int temp = data[i];
        data[i] = data[maxPos];
        data[maxPos] = temp;
    }

    /**
     * top k数据
     * @param k
     * @author chenghuan
     * @date 2019/12/24 21:58
     */
    public int[] topK(int k){
        //取k个数据放入top k 中
        int[] topK = new int[k+1];
        for (int i =1;i<=k;i++){
            topK[i] = data[i];
        }
        count = k;
        buildMinHeap();
        for(int i = k+1;i<=data.length;i++){
            if(topK[1]<data[i]){
                topK[1] = data[i];
                buildHeap();
            }
        }
        return topK;
    }

    /**
     * 打印
     *@author chenghuan
     *@date 2019/12/17 22:18
     */
    public void print(){
        IntStream.range(1,count+1).forEach(i->{
            if(data[i]!=0){
                System.out.print(data[i]+"...");
            }
        });
    }
}
