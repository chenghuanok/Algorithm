package cn.struct.algorithm.heap;

import org.junit.jupiter.api.Test;

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
        //heap.print();
        heap.sort();
        heap.print();
    }
}
