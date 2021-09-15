package cn.struct.algorithm.tree.search;

import org.junit.Test;
import java.util.stream.IntStream;

/**
 * 二叉查找树测试
 * @Author: chenghuan
 * @Date: 2019/10/26 22:47
 */
public class BSTreeTest {

    @Test
    public void insert(){
        final BSTree<Integer> bsTree = new BSTree<>();
        IntStream.range(1,6).forEach(i -> {
            bsTree.insert(i);
        });
        //打印
        bsTree.middle(bsTree.mRoot);
    }

    @Test
    public void search(){
        final BSTree<Integer> bsTree = new BSTree<>();
        IntStream.range(1,6).forEach(i -> {
            bsTree.insert(i);
        });
        final BSTree.BSTNode node = bsTree.search(6);
        if(node!=null){
            System.out.println("查找的值存在！！！");
        }else{
            System.out.println("查找的值不存在！！！");
        }
    }

    @Test
    public void delete(){
        final BSTree<Integer> bsTree = new BSTree<>();
        IntStream.range(1,6).forEach(i -> {
            bsTree.insert(i);
        });
        bsTree.delete(1);
        //打印
        bsTree.middle(bsTree.mRoot);
    }
}
