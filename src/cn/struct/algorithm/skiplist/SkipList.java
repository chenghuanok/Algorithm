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
    private SkipNode<T> top ;

    /**
     * 初始层数
     */
    private int level;

    /**
     * 跳跃表中元素个数
     */
    private int size;

    /**
     * 构造函数(初始化)
     */
    public SkipList(int level,T t){
        this.level = level;
        SkipNode<T> temp = top;
        SkipNode<T> tempDownNode = null;
        while(level--!=0){
            temp = new SkipNode<T>(t,null,null);
            temp.down = tempDownNode;
            tempDownNode = temp;
        }
        top = temp;
    }

    /**
     * 跳表节点
     * @author chenghuan
     * @date 2019/11/3 21:52
     */
    class SkipNode<T extends Comparable<T>>{
        
          /**
           * 值
           */
          T value;

          /**
           * 指向下一个元素和下一层元素
           */
          SkipNode<T> next,down;

        /**
         * 有参构造函数
         */
          SkipNode(T value,SkipNode<T> next,SkipNode<T> down){
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
             if(temp.next!=null){
                 while(temp.next.value.compareTo(t)<0){
                     temp = temp.next;
                 }
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
       int randomLevel = getRandomLevel();
       int flag = 1;
       SkipNode<T> temp = top;
       SkipNode<T> tempNode;
       //当在第n行插入后，在第n - 1行插入时需要将第n行backTempNode的DownNext域指向第n - 1的节点
       SkipNode<T> beforeLevelNode = null;
       int tempLevel = level;
       while(tempLevel--!=randomLevel){
           temp = temp.down;
       }

       tempLevel++;
       tempNode = temp;
       while(tempLevel--!=0){
           if(tempNode.next!=null){
               while(tempNode.next!=null&&tempNode.next.value.compareTo(t)<0){
                       tempNode = tempNode.next;
               }
           }
           final SkipNode<T> skipNode = new SkipNode<>(t,tempNode.next,null);
           //如果是顶层
           if(flag != 1){
               beforeLevelNode.down = skipNode;
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
        int randomLevel = 1;
        while(new Random().nextInt() % 2 == 0){
            randomLevel ++;
        }
        return  randomLevel > level ? level : randomLevel;
    }

    /**
     * 打印
     * @param
     * @return
     * @author chenghuan
     * @date 2019/11/6 22:26
     */
    public void printSkipList(){
        SkipNode<T> temp = top;
        while(temp.down!=null){
            temp = temp.down;
        }
        while (temp.next!=null){
            System.out.print(temp.next.value+",");
            temp = temp.next;
        }
    }
}
