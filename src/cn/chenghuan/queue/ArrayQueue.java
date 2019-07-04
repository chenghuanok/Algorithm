package cn.chenghuan.queue;

/**
 * @author 程欢
 * @Description 数组实现队列
 * @Date 2019/7/4 11:42
 */
public class ArrayQueue<T> {
    /**
     * 队列数组
     */
    private T[] data;
    /**
     * 队列头指针
     */
    private int front;
    /**
     * 队列尾指针
     */
    private int tail;
    /**
     * 队列中元素个数
     */
    private int count;

    /**
     * 无参构造函数
     */
    public ArrayQueue(){
        this.data = (T[]) new Object[10];
        this.front = 0;
        this.tail = 0;
        this.count = 0;
    }

    /**
     * 有参构造函数
     * @param size
     */
    public ArrayQueue(int size){
        this.data = (T[]) new Object[size];
        this.front = 0;
        this.tail = 0;
        this.count = 0;
    }

    /**
     * 添加元素
     * @param t
     */
    public void add(T t){
        if(count == data.length){
            System.out.println("队列已满");
            return;
        }
        data[tail++]=t;
        count++;
    }

    /**
     * 从队列头部取出元素
     * @return
     */
    public T remove(){
        if(count == 0){
            System.out.println("队列为空");
        }
        T t = data[front++];
        count--;
        return  t;
    }

    /**
     * 打印队列中的数据
     */
    public void queuePrint(){
        for (int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}
