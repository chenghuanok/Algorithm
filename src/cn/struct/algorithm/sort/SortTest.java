package cn.struct.algorithm.sort;

import org.junit.Test;

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

    @Test
    public void insert(){
        int[] a = {1,4,7,3,5};
        final Sort sort = new Sort(a,a.length);
        sort.insert();
        sort.print();
    }

    @Test
    public void select(){
        //int[] a = {1,4,7,3,5};
        int[] a = {8,5,7};
        final Sort sort = new Sort(a,a.length);
        sort.select();
        sort.print();
    }

    @Test
    public void mergeSort(){
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        final Sort sort = new Sort(a,a.length);
        sort.mergeSort(0, a.length-1);
        System.out.println("排好序的数组：");
        sort.print();
    }

    @Test
    public void quick(){
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        final Sort sort = new Sort(a,a.length);
        sort.quick(0,a.length-1);
        sort.print();
    }
}
