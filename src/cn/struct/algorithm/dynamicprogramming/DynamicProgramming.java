package cn.struct.algorithm.dynamicprogramming;

/**
 * @author chenghuan
 * @Description 动态规划算法
 * @Date 2019/8/24 20:49
 */
public class DynamicProgramming {

    /**
     * 私有构造函数
     */
    private DynamicProgramming(){

    }

    //自底向上的动态规划()计算出所有的子问题

    /**
     * 爬楼梯每次爬一阶或两阶
     * @param n 表示有阶
     * @return 总的方案数
     */
    public static int getTotalSchemeByArray(final int n){
          if(n<=2){
              return n;
          }
          int[] memo = new int[n+1];
          memo[1] = 1;
          memo[2] = 2;
          for(int i = 3;i<=n;i++){
              memo[i] = memo[i-1]+memo[i-2];
          }
          return memo[n];
    }

    /**
     * 爬楼梯每次爬一阶或两阶
     * @param n 表示有阶
     * @return 总的方案数
     */
    public static int getTotalScheme(final int n){
        if(n <= 2){
            return n;
        }
        int memo_i_2 = 1;
        int memo_i_1 = 2;
        int memo_i = 0;
        for(int i = 3;i<=n;i++){
            memo_i = memo_i_1+memo_i_2;
            memo_i_2 = memo_i_1;
            memo_i_1 = memo_i;
        }
        return memo_i;
    }
}
