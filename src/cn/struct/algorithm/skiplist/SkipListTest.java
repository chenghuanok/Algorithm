package cn.struct.algorithm.skiplist;

import org.junit.Test;

/**
 * 测试
 * @Author: chenghuan
 * @Date: 2019/11/6 22:30
 */
public class SkipListTest {

    @Test
    public void add(){
       final SkipList<Integer> skipList = new SkipList<>(4,-1);
       skipList.add(2);
       skipList.add(8);
       skipList.add(4);
       skipList.printSkipList();
    }

    @Test
    public void get(){
        final SkipList<Integer> skipList = new SkipList<>(4,-1);
        skipList.add(2);
        boolean flag = skipList.get(2);
        System.out.println(flag);
    }
}
