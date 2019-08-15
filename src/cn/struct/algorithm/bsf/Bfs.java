package cn.struct.algorithm.bsf;

import java.util.*;

/**
 * @author chenghuan
 * @Description 广度优先搜索算法
 * @Date 2019/8/15 20:18
 */
public class Bfs {

    /**
     * 寻找目标节点
     * @param startId
     * @param targetId
     * @param graphMap
     * @return Node
     */
    public static Node findTarget(final String startId, final String targetId, final Map<String,String[]> graphMap){
        //保存已经查看过的节点
        final List<String> hasSearchList = new ArrayList<>(graphMap.size());
        //节点进出队列
        final Queue<Node> queue = new LinkedList<>();
        //将起始节点放入队列
        queue.offer(new Node(startId,null));
        while(!queue.isEmpty()){
            //出队
            Node node = queue.poll();
            //存在则不遍历
            if(hasSearchList.contains(node.getId())){
                continue;
            }
            System.out.print("判断节点:" + node.getId() +"\n");
            //判断是否是目标节点
            if(Objects.equals(targetId,node.getId())){
                return node;
            }
            hasSearchList.add(node.getId());
            //判断是否存在子节点
            if(graphMap.get(node.getId())!=null&&graphMap.get(node.getId()).length>0){
                for(String id:graphMap.get(node.getId())){
                    queue.offer(new Node(id,node));
                }
            }
        }
        return null;
    }

    /**
     * 打印出到达节点target所经过的各个节点信息
     * @param target
     */
    public static void printShortestPath(Node target) {
        if (target != null) {
            System.out.print("找到了目标节点:" + target.getId() + "\n");
            List<Node> searchPath = new ArrayList<Node>();
            searchPath.add(target);
            Node node = target.getParent();
            while(node!=null) {
                searchPath.add(node);
                node = node.getParent();
            }
            String path = "";
            for(int i=searchPath.size()-1;i>=0;i--) {
                path += searchPath.get(i).getId();
                if(i!=0) {
                    path += "-->";
                }
            }
            System.out.print("步数最短："+path);
        } else {
            System.out.print("未找到了目标节点");
        }
    }
}
