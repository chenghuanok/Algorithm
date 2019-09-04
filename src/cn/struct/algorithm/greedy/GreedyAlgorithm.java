package cn.struct.algorithm.greedy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author chenghuan
 * @Description 贪心算法
 * @Date 2019/8/18 21:07
 */
public class GreedyAlgorithm {

    /**
     * 孩子对应满足的糖果map
     */
    private static final Map<Integer, Integer> childSatisfySugarMap  = new HashMap<>();

    /**
     *贪心算法实现
     * @param sugarAndSizeMap
     * @param childAndeSugarMap
     */
      public static void realize(Map<Integer,Integer> sugarAndSizeMap,Map<Integer,Integer> childAndeSugarMap){
         //获取糖果大小集合并排序
         final List<Integer> sugarSizeList = sugarAndSizeMap.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
         //获取每个孩子对糖果大小的需求并排序
         final List<Integer> childNeedSugarSizeList = childAndeSugarMap.values().stream().sorted().collect(Collectors.toList());
         findChildNeedSugar(sugarSizeList,childNeedSugarSizeList);
         printChildAndSugar(childSatisfySugarMap,sugarAndSizeMap,childAndeSugarMap);
      }

    /**
     * 匹配每个孩子需要的最低糖果大小
     * @param sugarSizeList
     * @param childNeedSugarSizeList
     */
    public static void findChildNeedSugar(List<Integer> sugarSizeList,List<Integer> childNeedSugarSizeList){

            for (Integer childNeedSugarSize : childNeedSugarSizeList) {
                if(sugarSizeList!=null){
                    sugarSizeList = findMinSugarSize(childNeedSugarSize,sugarSizeList);
                }else{
                    return;
                }
            }
        }

    /**
     * 根据孩子寻找符合的糖果大小
     * @param childAndSugar
     * @param sugarSizeList
     * @return
     */
    public static List<Integer> findMinSugarSize(Integer childAndSugar,List<Integer> sugarSizeList){
        for(int i = sugarSizeList.size()-1;i>=0;i--){
            if(sugarSizeList.get(i)>=childAndSugar){
                childSatisfySugarMap.put(childAndSugar,sugarSizeList.get(i));
                sugarSizeList.remove(i);
                return sugarSizeList;
            }
        }
        return null;
    }

    /**
     * 打印
     * @param childeSatisfySugarMap
     * @param sugarAndSizeMap
     * @param childAndSugarMap
     */
    public static void printChildAndSugar(final Map<Integer, Integer> childeSatisfySugarMap,
                                           final Map<Integer,Integer> sugarAndSizeMap,
                                           final Map<Integer,Integer> childAndSugarMap){
           childeSatisfySugarMap.forEach((k,v)->{
               childAndSugarMap.forEach((childeK,childV)->{
                   if(Objects.equals(k,childV)){
                       System.out.println("第"+childeK+"个孩子");
                   }
               });

               sugarAndSizeMap.forEach((sugarK,sugarV)->{
                   if(Objects.equals(v,sugarV)){
                       System.out.println("分第"+sugarK+"个糖果");
                   }
               });
           });
    }
}
