package cn.struct.algorithm.dynamicprogramming;

/**
 * @author chenghuan
 * @Description 动态规划算法
 * @Date 2019/8/24 20:49
 */
public class DynamicProgramming {

    /**
     * 三角形
     */
    private static final int[][] square = {
            {7,0,0,0},
            {7,8,0,0},
            {7,9,1,0},
            {7,2,3,0},
    };
/*
    {7,0,0,0},
    {3,8,0,0},
    {8,1,0,0},
    {2,7,4,4}*/

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

    /**
     *
     * 从三角形顶点出发到底部找最大路径和
     * @param i
     * @param j
     * @return
     */
    public static int pathMaxSum(int i,int j){
         if(i == square.length-1){
             return square[i][j];
         }
         return square[i][j]+Math.max(pathMaxSum(i+1,j),pathMaxSum(i+1,j+1));
    }
}
