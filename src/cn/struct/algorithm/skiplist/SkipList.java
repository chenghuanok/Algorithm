package cn.struct.algorithm.skiplist;

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
     * 查找对应元素的节点
     * @param t
     * @return SkipNode<T>
     * @author chenghuan
     * @date 2019/11/3 22:02
     */
    private SkipNode<T> getSkipNode(T t){
         SkipNode<T> temp = top;
         while (true){
            while(temp.next.value.compareTo(t)<=0){
                temp = temp.next;
            }
            if(temp.down == null){
                while (temp!=null){
                   if(temp.value.compareTo(t)==0){
                       return temp;
                   }
                   temp = temp.next;
                }
                return null;
            }else {
                temp = temp.down;
            }
         }
    }

    /**
     * @param t
     * @return boolean
     * @author chenghuan
     * @date 2019/11/3 22:05
     */
    public boolean get(T t){
        final SkipNode<T> skipNode = getSkipNode(t);
        if(skipNode!=null){
            return true;
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
       SkipNode<T> skipNode =  getSkipNode(t);
       if(skipNode.value.compareTo(t)==0){
           return;
       }
       SkipNode<T> newNode = new SkipNode<>(t,skipNode.next,null);
       skipNode.next = newNode;
    }
}
