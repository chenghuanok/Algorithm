package cn.struct.algorithm.stack.link;

import org.junit.jupiter.api.Test;

/**
 * 链表实现栈测试
 * @Author: chenghuan
 * @Date: 2019/9/21 21:37
 */
public class LinkStackTest {

    @Test
    public void push(){
      final LinkStack<String> linkStack = new LinkStack<>();
      linkStack.push("xiaocheng");
      linkStack.push("xiaoxu");
      linkStack.push("xiaobai");
      linkStack.printLinkStack();
    }

    @Test
    public void pop(){
        final LinkStack<String> linkStack = new LinkStack<>();
        linkStack.push("xiaocheng");
        linkStack.push("xiaoxu");
        linkStack.push("xiaobai");
        linkStack.pop();
        linkStack.printLinkStack();
    }
}
