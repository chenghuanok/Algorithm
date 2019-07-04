package cn.chenghuan.queue;

/**
 * @author 程欢
 * @Description 队列测试
 * @Date 2019/7/4 16:43
 */
public class QueueMain {

    public static void main(String[] args){
      final ArrayQueue<String> arrayQueue = new ArrayQueue<>();
      arrayQueue.add("承欢");
      arrayQueue.add("小徐");
      arrayQueue.add("小许");
      arrayQueue.remove();
      arrayQueue.queuePrint();
    }
}
