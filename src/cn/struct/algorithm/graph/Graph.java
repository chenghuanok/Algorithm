package cn.struct.algorithm.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: chenghuan
 * @Date: 2020/1/15 20:54
 */
public class Graph {
    /**
     * 顶点数
     */
    private int v;

    /**
     * 邻接表
     */
    private LinkedList<Integer>[] adj;

    /**
     * 构造函数
     * @param v
     */
    @SuppressWarnings("unchecked")
    public Graph(int v){
        this.v = v;
        this.adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    /**
     * 有向图s-t
     * @param s
     * @param t
     */
    public void addEdge(int s,int t){
        adj[s].add(t);
    }


    /**
     * 从s到t的路径
     * @param t
     * @param s
     */
    public void bfs(int s,int t){
        if(s==t){
            return;
        }
        final boolean[] visited = new boolean[v];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        int[] prev = new int[v];
        for (int i = 0; i < v; i++) {
            prev[i] = -1;
        }
        while(queue.size()!=0){
            int w = queue.poll();
            for (int i = 0; i <adj[w].size(); i++) {
                int q = adj[w].get(i);
                if(!visited[q]){
                    prev[q] = w;
                    if(t==q){
                        print(prev,s,t);
                        return;
                    }
                    visited[q] = true;
                    queue.add(q);
                }
            }
        }
    }

    /**
     * 打印路径
     * @param prev,s,t
     * @author chenghuan
     * @date 2020/1/15 20:55
    */
    private void print(int[] prev,int s,int t){
        if(prev[t]!=-1&&t!=s){
            print(prev,s,prev[t]);
        }
        System.out.print(t+"-");
    }
}
