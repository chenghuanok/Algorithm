package cn.struct.algorithm.sort;

import org.junit.jupiter.api.Test;

/**
 * @Author: chenghuan
 * @Date: 2019/11/11 22:34
 */
public class SortTest {

    @Test
    public void bubble(){
        int[] a = {7,2,5,9,1};
        final Sort sort = new Sort(a,a.length);
        sort.bubble();
        sort.print();
    }
}
