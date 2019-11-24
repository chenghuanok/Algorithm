package cn.struct.algorithm.binary.search;

/**
 * 二分查找
 * @Author: chenghuan
 * @Date: 2019/11/24 20:24
 */
public class Search {

    /**
     * @param a, value
     * @return boolean
     * @author chenghuan
     * @date 2019/11/24 20:39
    */
    public boolean binarySearch(int[] a,int value){
        int low = 0;
        int high = a.length-1;
        while (low<=high){
            int middle = (low+high)/2;
            if(a[middle] == value){
                return true;
            }else if(a[middle]>value){
                high = middle-1;
            }else if(a[middle]<value){
                low = middle+1;
            }
        }
        return false;
    }
}
