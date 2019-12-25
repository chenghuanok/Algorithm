package cn.struct.algorithm.heap;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

/**
 * 测试
 * @Author: chenghuan
 * @Date: 2019/12/17 22:20
 */
public class HeapTest {

    @Test
    public void insert(){
       final Heap heap = new Heap(10);
       heap.insert(33);
       heap.insert(56);
       heap.insert(28);
       heap.insert(39);
       heap.print();
    }

    @Test
    public void removeTop(){
        final Heap heap = new Heap(10);
        heap.insert(33);
        heap.insert(56);
        heap.insert(28);
        heap.insert(39);
        heap.insert(26);
        //heap.print();
        heap.removeTop();
        heap.print();
    }

    @Test
    public void sort(){
        final Heap heap = new Heap(10);
        heap.insert(33);
        heap.insert(56);
        heap.insert(28);
        heap.insert(39);
        heap.sort();
        heap.print();
    }

    @Test
    public void top(){
        int[] array = new int[]{12,3,6,8,9,4,6,14,10};
        final Heap heap = new Heap(array);
        final int[] topK = heap.topK(5);
        IntStream.range(1,topK.length).forEach(i->{
            if(topK[i]!=0){
                System.out.print(topK[i]+"...");
            }
        });
    }
}
