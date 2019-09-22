package cn.struct.algorithm.queue.array;

/**
 * @Author: chenghuan
 * @Date: 2019/9/22 22:08
 */
public class DArrayQueue<T> {

    /**
     * 数组
     */
    private T[] items;

    /**
     * 队列大小
     */
    private int capacity;

    /**
     * 队列头下标
     */
    private int head;

    /**
     * 队列尾下标
     */
    private int tail;

    /**
     * 默认容量
     */
    private static final int DEFAULT_CAPACITY = 3;

    /**
     * 无参构造函数
     */
    public DArrayQueue(){
        items = (T[]) new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
    }

    /**
     * 有参构造函数
     * @param capacity
     */
    public DArrayQueue(int capacity){
        items = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    /**
     * 元素入队
     * @param t
     */
    public void enqueue(T t){
       if(tail == capacity){
           throw new RuntimeException("队列溢出！！！");
       }
       items[tail++] = t;
    }

    /**
     * 出队
     * @return T
     */
    public T dequeue(){
       if(tail == head){
            throw new RuntimeException("队列为空！！！");
        }
        T t = items[head++];
        return t;
    }

    /**
     * 打印队列
     */
    public void printDArrayQueue(){
        System.out.println("开始打印队列");
        for(int i = head;i<tail;i++){
            System.out.print(items[i]+"->");
        }
        System.out.println("\n"+"结束打印队列");
    }
}
