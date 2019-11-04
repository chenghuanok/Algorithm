package cn.struct.algorithm.skiplist;

import java.util.Random;

/**
 * 跳表
 * @Author: chenghuan
 * @Date: 2019/11/3 21:50
 */
public class SkipList<T extends Comparable<T>> {

    /**
     * 最顶层第一个元素
     */
    private SkipNode<T> top;

    /**
     * 初始层数
     */
    private int level;

    /**
     * 跳跃表中元素个数
     */
    private int size;

    /**
     * 最大层数
     */
    private static final int MAX_LEVEL = 1 << 6;

    /**
     * 跳表节点
     * @author chenghuan
     * @date 2019/11/3 21:52
     */
    class SkipNode<E extends Comparable<E>>{
        
          /**
           * 值
           */
          E value;

          /**
           * 指向下一个元素和下一层元素
           */
          SkipNode<E> next,down;

        /**
         * 有参构造函数
         */
          SkipNode(E value,SkipNode<E> next,SkipNode<E> down){
              this.value = value;
              this.next = next;
              this.down = down;
          }
    }

    /**
     * 查找给定元素的最底层节点的前一个节点
     * @param t
     * @return SkipNode<T>
     * @author chenghuan
     * @date 2019/11/3 22:02
     */
    private SkipNode<T> findSkipNode(T t){
         SkipNode<T> temp = top;
         while (true){
            while(temp.next.value.compareTo(t)<0){
                temp = temp.next;
            }
            if(temp.down == null){
                   return temp;
            }
            temp = temp.down;
         }
    }

    /**
     * @param t
     * @return boolean
     * @author chenghuan
     * @date 2019/11/3 22:05
     */
    public boolean get(T t){
        final SkipNode<T> skipNode = findSkipNode(t);
        SkipNode<T> temp = skipNode;
        while(temp.next!=null){
            if(temp.next.value.compareTo(t)==0){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    /**
     * 添加元素
     * @param t
     * @author chenghuan
     * @date 2019/11/3 22:46
     */
    public void add(T t){
       int lev = getRandomLevel();
       int flag = 1;
       SkipNode<T> temp = top;
       SkipNode<T> tempNode;
       //当在第n行插入后，在第n - 1行插入时需要将第n行backTempNode的DownNext域指向第n - 1的节点
       SkipNode<T> beforeLevelNode = null;
       int tempLevel = level;
       while(tempLevel--!=lev){
           temp = temp.down;
       }
       tempLevel++;
       tempNode = temp;
       while(tempLevel--!=0){
           while(tempNode.next.value.compareTo(t)<0){
               tempNode = tempNode.next;
           }
           final SkipNode<T> skipNode = new SkipNode<>(t,tempNode.next,null);
           //如果是顶层
           if(flag != 1){
               beforeLevelNode.next = skipNode;
           }
           beforeLevelNode = skipNode;
           tempNode.next = skipNode;
           tempNode = tempNode.down;
           flag = 0;
       }
    }

    /**
     * 随机产生数lev，lev层下的都需要将值插入
     * @return int
     * @author chenghuan
     * @date 2019/11/4 22:27
     */
    private int getRandomLevel(){
        int lev = 1;
        while(new Random().nextInt() % 2 == 0){
            lev ++;
        }
        return  lev > MAX_LEVEL ? MAX_LEVEL : lev;
    }
}
