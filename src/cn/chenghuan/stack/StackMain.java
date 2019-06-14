package cn.chenghuan.stack;

/**
 * @author 程欢
 * @Description 测试
 * @Date 2019/6/14 21:06
 */
public class StackMain {

   public static void main(String[] args){
        final ArrayStack<String> arrayStack = new ArrayStack<>(5);
        //入栈
        arrayStack.push("chenghuan");
        arrayStack.push("huzhuqing");
        arrayStack.push("xiaoxu");
        arrayStack.push("xiaoxu2");
        arrayStack.push("xiaoxu3");
        arrayStack.push("xiaoxu4");
        arrayStack.pop();
        arrayStack.print();
    }
}
