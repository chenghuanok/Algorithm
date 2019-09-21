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

    @Test
    public void browserGoOrBack(){
        final ArrayStack<String> goStack = new ArrayStack<>(3);
        final ArrayStack<String> backStack = new ArrayStack<>(3);
        goStack.push("a");
        goStack.push("b");
        goStack.push("c");
        System.out.println("初始访问顺序a->b->c");
        //后退back
        backStack.push(goStack.pop());
        System.out.println("点击一次后退此时当前页面为"+goStack.peek());
        backStack.push(goStack.pop());
        System.out.println("点击一次后退此时当前页面为"+goStack.peek());
        goStack.push(backStack.pop());
        System.out.println("点击一次前进此时当前页面为"+goStack.peek());
    }

}
