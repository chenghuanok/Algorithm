package cn.struct.algorithm.greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenghuan
 * @Description 贪心算法测试
 * @Date 2019/8/18 21:07
 */
public class GreedyAlgorithmMain {
     public static void main(String[] args){
      Map<Integer,Integer> sugarAndSizeMap = new HashMap<>();
      Map<Integer,Integer> childAndeSugarMap = new HashMap<>();
      //构造糖果
      sugarAndSizeMap.put(1,10);
      sugarAndSizeMap.put(2,30);
      sugarAndSizeMap.put(3,19);
      sugarAndSizeMap.put(4,40);
      sugarAndSizeMap.put(5,35);

      //构造孩子
      childAndeSugarMap.put(1,9);
      childAndeSugarMap.put(2,29);
      childAndeSugarMap.put(3,40);
      childAndeSugarMap.put(4,39);
      childAndeSugarMap.put(5,32);
      childAndeSugarMap.put(6,50);
      childAndeSugarMap.put(7,18);
      GreedyAlgorithm.realize(sugarAndSizeMap,childAndeSugarMap);
     }
}
