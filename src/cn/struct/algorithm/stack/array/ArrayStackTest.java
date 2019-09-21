package cn.struct.algorithm.stack.array;

import org.junit.jupiter.api.Test;

/**
 * 数组实现栈测试
 * @Author: chenghuan
 * @Date: 2019/9/21 21:23
 */
public class ArrayStackTest {

    @Test
    public void push(){
        final ArrayStack<String> arrayStack = new ArrayStack<>(1);
        arrayStack.push("xiaocheng");
        arrayStack.push("xiaobai");
        arrayStack.push("xiaohong");
        arrayStack.printArrayStack();
    }

    @Test
    public void pop(){
        final ArrayStack<String> arrayStack = new ArrayStack<>(3);
        arrayStack.push("xiaocheng");
        arrayStack.push("xiaobai");
        arrayStack.push("xiaohong");
        arrayStack.pop();
        arrayStack.printArrayStack();
    }
}
