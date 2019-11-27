package cn.struct.algorithm.binary.search;

import org.junit.jupiter.api.Test;

/**
 * @Author: chenghuan
 * @Date: 2019/11/24 20:39
 */
public class SearchTest {

    @Test
    public void search(){
      final Search search = new Search();
      int[] a ={1,4,6,8,9,10};
      final boolean existFlag = search.binarySearch(a,7);
      System.out.println(existFlag);
    }

    @Test
    public void findFirstEqualValue(){
        final Search search = new Search();
        int[] a ={1,3,4,5,6,8,8,8,9,10};
        final int position = search.findFirstEqualValue(a,8);
        System.out.println(position);
    }

    @Test
    public void findEndEqualValue(){
        final Search search = new Search();
        int[] a ={1,3,4,5,6,8,8,8,9,10};
        final int position = search.findEndEqualValue(a,8);
        System.out.println(position);
    }

    @Test
    public void findFirstThanValue(){
        final Search search = new Search();
        int[] a ={3,4,6,7,10};
        final int position = search.findFirstThanValue(a,9);
        System.out.println(position);
    }
}
