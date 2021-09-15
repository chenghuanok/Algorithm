package cn.struct.algorithm.queue.array;

import org.junit.Test;

/**
 * 数组实现队列测试
 * @Author: chenghuan
 * @Date: 2019/9/22 22:33
 */
public class DArrayQueueTest {

    @Test
    public void enqueue(){
       final DArrayQueue<String> dArrayQueue = new DArrayQueue<>(5);
       dArrayQueue.enqueue("xiaocheng");
       dArrayQueue.enqueue("xiaoxu");
       dArrayQueue.enqueue("xiaobai");
       dArrayQueue.enqueue("xiaohong");
       dArrayQueue.printDArrayQueue();
    }

    @Test
    public void dequeue(){
        final DArrayQueue<String> dArrayQueue = new DArrayQueue<>();
        dArrayQueue.enqueue("xiaocheng");
        dArrayQueue.enqueue("xiaoxu");
        dArrayQueue.enqueue("xiaobai");
        dArrayQueue.dequeue();
        dArrayQueue.printDArrayQueue();
    }
}
