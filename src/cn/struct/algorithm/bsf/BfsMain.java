package cn.struct.algorithm.bsf;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenghuan
 * @Description 广度优先搜索算法
 * @Date 2019/8/15 20:18
 */
public class BfsMain {
    public static void main(String[] args){
       //初始化先建立起各个节点信息，以及对应的直接子节点列表
        Map<String,String[]> map = new HashMap<>();
        map.put("A", new String[] {"C","B"});
        map.put("B", new String[] {"E"});
        map.put("C", new String[] {"D","F"});
        map.put("D", new String[] {"E"});
        map.put("E", new String[] {"H"});
        map.put("F", new String[] {"G"});
        map.put("G", new String[] {"H"});
        map.put("H", new String[] {});
        //获取从A到H的最短路径节点链表
        Node target = Bfs.findTarget("A","H",map);
        if(target!=null){
            System.out.println(target.getId());
        }
        //打印出最短路径的各个节点信息
        Bfs.printShortestPath(target);
    }
}
