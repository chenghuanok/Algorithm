package cn.struct.algorithm.hashtable;

/**
 * 哈希函数
 * @Author: chenghuan
 * @Date: 2019/10/5 21:44
 */
public class HashUtil {

    /**
     * 观察法hash函数(截取key中的最后两位)
     * @param
     * @return
     *@author chenghuan
     *@date 2019/10/5 21:45
     */
    public static int observeHash(final String key){
          final String lastTwoStr = key.substring(key.length()-2, key.length());
          final int hashValue = Integer.parseInt(lastTwoStr);
          return hashValue;
    }

    public static void main(String[] args) {
        System.out.println(observeHash("112235"));
    }
}
