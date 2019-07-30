package cn.struct.algorithm.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenghuan
 * @Description map工具
 * @Date 2019/7/29 21:24
 */
public class MapUtil {

    /**
     * 判断给定的两个字符串是否是有效的字母异位
     * @param oneStr
     * @return
     */
    public static boolean isValidAnaGram(final String oneStr, final String twoStr){
        final Map<Character,Integer> oneSrtMap = new HashMap<>(oneStr.length());
        final Map<Character,Integer> twoSrtMap = new HashMap<>(twoStr.length());
        //将字符串不同的字母放入map并统计出现的次数
        putStrAndCount(oneStr,oneSrtMap);
        putStrAndCount(twoStr,twoSrtMap);
        //判断两个map中键对应的值是否相等
        for(Map.Entry<Character,Integer> entry: oneSrtMap.entrySet()){
            if(!entry.getValue().equals(twoSrtMap.get(entry.getKey()))){
                return false;
            }
        }
        return true;
    }

    /**
     * 给定一个整数数组，找出其中两个数相加等于目标值
     * @param nums
     * @param target
     * @return int[]
     */
    public static int[] findTwoSum(final int[] nums, final int target){
           // 结果数组
           final int[] result={-1,-1};
           //数组值作为键，下标作为值
           final Map<Integer,Integer> mapNums = new HashMap<>(nums.length);
           for (int i =0;i<nums.length;i++){
               mapNums.put(nums[i],i);
           }
           //判断值是否在map中
           for(int i =0;i<nums.length;i++){
               int twoNum = target-nums[i];
               if(mapNums.containsKey(twoNum)&&twoNum!=nums[i]){
                   result[0] = i;
                   result[1] = mapNums.get(twoNum);
                   return result;
               }
           }
           return result;
    }

    /**
     * 遍历字符串并统计
     * @param str
     */
    private static void putStrAndCount(final String str,final Map<Character,Integer> strMap){
        for(int i = 0;i<str.length();i++){
            if(strMap.containsKey(str.charAt(i))){
                strMap.put(str.charAt(i),strMap.get(str.charAt(i))+1);
            }else{
                strMap.put(str.charAt(i),1);
            }
        }
    }
}
