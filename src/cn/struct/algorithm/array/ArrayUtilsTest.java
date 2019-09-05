package cn.struct.algorithm.array;

import org.junit.jupiter.api.Test;

/**
 * 数组工具类
 * @Author: chenghuan
 * @Date: 2019/9/5 20:43
 */
public class ArrayUtilsTest {
    /**
     * 数组大小
     */
    private int size = 10;

    /**
     * 数组初始化的元素个数
     */
    private int initSize = 5;


    /**
     * 插入的元素的值
     */
    private int insertValue = 8;

    /**
     * 插入元素的位置
     */
    private int insertPosition = 3;

    /**
     * 要删除的元素
     */
    private int[] deleteValue = {1,4,2};

    /**
     * 向数组中插入元素(把8插入到第3个位置)
     */
    @Test
    public void insertValue(){
        //初始化
        int[] array =initArray();
        System.out.print("移动前的数据：");
        print(array);
        long beginTime = System.nanoTime();
        //将数组第三个位置以后的元素都后移一位
        for (int i = insertPosition-1; i <= initSize-1; i++) {
            int temp = array[i+1];
            array[i+1] = array[insertPosition-1];
            array[insertPosition-1] = temp;
        }
        //将8插入到第三个位置
        array[insertPosition-1] = insertValue;
        long end = System.nanoTime();
        System.out.print("\n"+"移动后的数据：");
        print(array);
        System.out.print("\n"+"方法执行时间："+ (end - beginTime)+"ns");
    }

    /**
     * 向数组中插入元素(把8插入到第3个位置)
     */
    @Test
    public void insertValueTwo(){
        //初始化
        int[] array = initArray();
        System.out.print("移动前的数据：");
        print(array);
        long beginTime = System.nanoTime();
        array[initSize] = array[insertPosition-1];
        array[insertPosition-1] = insertValue;
        long end = System.nanoTime();
        System.out.print("\n"+"移动后的数据：");
        print(array);
        System.out.print("\n"+"方法执行时间："+ (end - beginTime)+"ns");
    }

    /**
     * 删除元素(一个个删除)
     */
    @Test
    public void deleteValue(){
        //初始化
        int[] array = initArray();
        System.out.print("删除前的数据：");
        print(array);
        //删除元素
        for(int i = 0;i< deleteValue.length;i++){
            for(int j = 0;j<initSize;j++){
                if(deleteValue[i]==array[j]){
                    //将j后面的所有数据向前移动一位
                    for(int k = j+1;k<=initSize;k++){
                        array[k-1] = array[k];
                    }
                    break;
                }
            }
        }
        System.out.print("\n"+"删除后的数据：");
        print(array);
    }

    /**
     * 删除元素(先标记然后统一删除)
     */
    @Test
    public void deleteValueTwo(){
        //初始化
        int[] array = initArray();
        System.out.print("删除前的数据：");
        print(array);
        //删除元素
        for(int i = 0;i< deleteValue.length;i++){
            for(int j = 0;j<initSize;j++){
                if(deleteValue[i]==array[j]){
                    //将要删除的数据标记为0
                    array[j] = 0;
                    break;
                }
            }
        }
        //统一删除
        for (int i = 0; i < initSize; i++) {
            if(array[i]==0){
                //将下一位不为零的元素补上

            }
        }
        System.out.print("\n"+"删除后的数据：");
        print(array);
    }

    /**
    * 初始化数组
    * @return 数组
    * @author chenghuan
    * @date 2019/9/5 20:53
    */
    private int[] initArray(){
        int[] array = new int[size];
        for(int i = 0;i< initSize;i++){
            array[i] = i+1;
        }
        return array;
    }

    /**
     * 打印指定的数组
     * @param t
     */
    private  void print(int[] t){
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]+" ");
        }
    }
}
