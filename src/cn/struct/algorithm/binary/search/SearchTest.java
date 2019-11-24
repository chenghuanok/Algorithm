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
}
