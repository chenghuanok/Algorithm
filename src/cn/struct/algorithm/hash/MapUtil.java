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
