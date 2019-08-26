package cn.struct.algorithm.dynamicprogramming;

/**
 * @author chenghuan
 * @Description 动态规划测试
 * @Date 2019/8/24 20:47
 */
public class DynamicProgrammingMain {

    public static void main(String[] args){
       //final int totalScheme =  DynamicProgramming.getTotalSchemeByArray(6);
       // System.out.println("总的爬楼梯方案有"+totalScheme+"中");
       int[][] square = {
                {7,0,0,0},
                {7,8,0,0},
                {7,9,1,0},
                {7,2,3,0},
        };
        final int maxSum = DynamicProgramming.pathMaxSum(1,1);
        System.out.println(maxSum);
    }
}
