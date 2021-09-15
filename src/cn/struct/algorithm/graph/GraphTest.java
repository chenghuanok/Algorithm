package cn.struct.algorithm.graph;


import org.junit.Test;

/**
 * @Author: chenghuan
 * @Date: 2020/1/15 20:55
 */
public class GraphTest {

    @Test
    public void test1(){
        final Graph graph = new Graph(8);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 7);
        graph.addEdge(6, 7);
        graph.bfs(0, 6);
    }
}
