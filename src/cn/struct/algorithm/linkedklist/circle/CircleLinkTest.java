package cn.struct.algorithm.linkedklist.circle;

import org.junit.Test;

/**
 * 循环测试链表
 * @Author: chenghuan
 * @Date: 2019/9/20 21:36
 */
public class CircleLinkTest {

    @Test
    public void add(){
      final CircleLink<String> circleLink = new CircleLink<>();
      circleLink.add("xiaocheng");
      circleLink.add("xiaoxu");
      circleLink.add("xiaobai");
      circleLink.printCircleLink();
      System.out.println("链表的长度为："+circleLink.sizeCircleLink());
    }

    @Test
    public void delete(){
        final CircleLink<String> circleLink = new CircleLink<>();
        circleLink.add("xiaocheng");
        circleLink.add("xiaoxu");
        circleLink.add("xiaobai");
        circleLink.delete("xiaobai");
        circleLink.printCircleLink();
        System.out.println("链表的长度为："+circleLink.sizeCircleLink());
    }
}
