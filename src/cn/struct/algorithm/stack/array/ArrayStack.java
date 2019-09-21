package cn.struct.algorithm.stack.array;

import javafx.css.Size;

import java.util.Arrays;

/**
 * 数组实现栈
 * @Author: chenghuan
 * @Date: 2019/9/21 20:46
 */
public class ArrayStack<T> {

    /**
     * 栈的大小
     */
    private int capacity;

    /**
     * 栈中元素个数
     */
    private int count;

    /**
     * 数组
     */
    private T[] items;

    /**
     * 栈默认大小
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 扩容数量
     */
    private static final int GROW_CAPACITY = 3;

    /**
     * 无参构造函数
     */
    public ArrayStack(){
       this.items = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayStack(int capacity){
        this.items = (T[]) new Object[capacity];
        this.capacity = capacity;
        this.count = 0;
    }

    /**
     * 元素入栈
     * @param  t
     */
    public void push(T t){
        if(count == capacity){
           //throw new RuntimeException("栈溢出!!!");
            growCapacity();
        }
        items[count++] = t;
    }

    /**
     * 元素出栈
     * @return T
     */
    public T pop(){
        if(isEmpty()){
            throw new RuntimeException("栈为空!!!");
        }
        T t = items[--count];
        //栈顶元素置空
        items[count] = null;
        return t;
    }

    /**
     * 获取栈顶元素
     * @return T
     */
    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("栈为空!!!");
        }
        T t = items[count-1];
        return t;
    }

    /**
     * 栈是否为空
     * @return boolean
     */
    public boolean isEmpty(){
        return count == 0;
    }

    /**
     * 数组扩容
     */
    private void growCapacity(){
        items = Arrays.copyOf(items, capacity+GROW_CAPACITY);
        capacity = capacity+GROW_CAPACITY;
    }

    /**
     * 打印栈
     */
    public void printArrayStack(){
        System.out.println("开始打印栈");
        while(count>0){
            System.out.print(pop()+"->");
        }
        System.out.println("\n"+"结束打印栈");
    }

}
