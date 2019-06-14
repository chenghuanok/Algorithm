package cn.chenghuan.stack;

/**
 * @author 程欢
 * @Description 数组实现栈
 * @Date 2019/6/14 20:52
 */
public class ArrayStack<T> {
    /**
     * 数组
     */
    private Object[] items;

    /**
     * 栈中元素个数
     */
    private int count;

    /**
     * 栈的大小
     */
    private int n;

    public ArrayStack(int n) {
        this.items = new Object[n];
        this.count=0;
        this.n = n;
    }

    /**
     * 入栈
     * @param t
     */
    public void push(T t){
       //判断栈中元素是否满了
        if(count==n){
            System.out.println("栈中元素已满");
            return;
        }
        items[count++]=t;
    }

    /**
     * 出栈
     */
    public void pop(){
        //判断栈中是否有元素
        if(count==0){
            System.out.println("栈中没有元素");
        }
        items[--count]=null;
    }

    /**
     * 打印
     */
    public void print(){
        for (int i=0;i<items.length;i++){
            System.out.println(items[i]+"\n");
        }
    }
}
