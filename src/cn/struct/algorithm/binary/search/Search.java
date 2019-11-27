package cn.struct.algorithm.binary.search;

/**
 * 二分查找
 * @Author: chenghuan
 * @Date: 2019/11/24 20:24
 */
public class Search {

    /**
     * 查找值等于给定值(不存在重复元素)
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

    /**
     * 查找第一个值等于给定值的位置
     * @param a value
     * @return int
     * @author chenghuan
     * @date 2019/11/27 21:54
    */
    public int findFirstEqualValue(int[] a, int value){
         int low = 0;
         int high = a.length-1;
         while(low<=high){
             int middle = (low+high)/2;
             if(a[middle]>value){
                 high = middle - 1;
             }else if(a[middle]<value){
                 low = middle+1;
             }else{
                 if(middle ==0 ||a[middle-1] != value){
                     return middle;
                 }
                 high = middle -1;
             }
         }
         return -1;
    }

    /**
     * 查找最后一个值等于给定值得位置
     * @param a value
     * @return int
     * @author chenghuan
     * @date 2019/11/27 22:12
    */
    public int findEndEqualValue(int[] a, int value){
        int low = 0;
        int high = a.length-1;
        while(low<=high){
            int middle = (low+high)/2;
            if(a[middle]>value){
                high = middle - 1;
            }else if(a[middle]<value){
                low = middle+1;
            }else{
                if(middle ==a.length-1 ||a[middle+1] != value){
                    return middle;
                }
                low = middle +1;
            }
        }
        return -1;
    }

    /**
     * 查找第一个大于等于给定值的位置
     * @param  a value
     * @return  int
     * @author chenghuan
     * @date 2019/11/27 22:17
    */
    public int findFirstThanValue(int[] a, int value){
        int low = 0;
        int high = a.length-1;
        while (low<=high){
            int middle = (low+high)/2;
            if(a[middle]>=value){
                if(middle == 0||a[middle-1]<value){
                    return middle;
                }else{
                    high = middle -1;
                }
            }else {
                low = middle+1;
            }
        }
        return  -1;
    }
}
