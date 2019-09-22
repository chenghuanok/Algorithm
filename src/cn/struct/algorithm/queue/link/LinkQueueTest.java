package cn.struct.algorithm.queue.link;

import org.junit.jupiter.api.Test;

/**
 * 链表实现队列测试
 * @Author: chenghuan
 * @Date: 2019/9/22 22:41
 */
public class LinkQueueTest {

    @Test
    public void enqueue(){
       final LinkQueue<String> linkQueue = new LinkQueue<>();
       linkQueue.enqueue("xiaocheng");
       linkQueue.enqueue("xiaobai");
       linkQueue.enqueue("xiaoxu");
       linkQueue.printLinkQueue();
    }

    @Test
    public void dequeue(){
        final LinkQueue<String> linkQueue = new LinkQueue<>();
        linkQueue.enqueue("xiaocheng");
        linkQueue.enqueue("xiaobai");
        linkQueue.enqueue("xiaoxu");
        linkQueue.dequeue();
        linkQueue.printLinkQueue();
    }
}
