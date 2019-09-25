package cn.struct.algorithm.linkedklist.bilateralcircle;

import org.junit.jupiter.api.Test;

/**
 * 双向循环链表测试
 * @Author: chenghuan
 * @Date: 2019/9/25 21:11
 */
public class BilateralCircleLinkTest {


    @Test
    public void add(){
        BilateralCircleLink<String> bilateraCircleLink = new BilateralCircleLink<>();
        bilateraCircleLink.add("xiaocheng");
        bilateraCircleLink.add("xiaoxu");
        bilateraCircleLink.add("xiaohong");
        bilateraCircleLink.add("xiaobai");
        bilateraCircleLink.printBilateraCircleLink();
    }

    @Test
    public void delete(){
        BilateralCircleLink<String> bilateraCircleLink = new BilateralCircleLink<>();
        bilateraCircleLink.add("xiaocheng");
        bilateraCircleLink.add("xiaoxu");
        bilateraCircleLink.add("xiaohong");
        bilateraCircleLink.add("xiaobai");
        bilateraCircleLink.delete("xiaoxu");
        bilateraCircleLink.printBilateraCircleLink();
    }
}
