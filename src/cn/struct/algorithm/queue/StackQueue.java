package cn.struct.algorithm.queue;

import java.util.Stack;

/**
 * @author 程欢
 * @Description 栈实现队列
 * @Date 2019/7/6 17:25
 */
public class StackQueue<T> {

    /**
     * 作为入队栈
     */
    private Stack<T> pushStack = new Stack<>();

    /**
     * 作为出队栈
     */
    private Stack<T> popStack = new Stack<>();

    /**
     * 入队
     * @param t
     */
    public void push(T t){
        pushStack.push(t);
    }

    /**
     * 出队
     * @return T
     */
    public T pop(){
         if(!popStack.empty()){
             return popStack.pop();
         }
         while(!pushStack.empty()){
             popStack.push(pushStack.pop());
         }
         if(popStack.empty()){
             throw new RuntimeException("队列为空");
         }
         return popStack.pop();
    }
}
