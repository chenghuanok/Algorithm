package cn.struct.algorithm.hashtable.consistenthash;

import org.junit.jupiter.api.Test;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * 测试
 * @Author: chenghuan
 * @Date: 2019/10/14 21:34
 */
public class ConsistentHashTest {

    @Test
    public void ConsistentHashLoadBalanceNoVirtualNode(){
        String[] nodes = new String[]{"192.168.2.1:8080", "192.168.2.2:8080", "192.168.2.3:8080", "192.168.2.4:8080"};
        ConsistentHashLoadBalanceNoVirtualNode consistentHash = new ConsistentHashLoadBalanceNoVirtualNode(nodes);
        consistentHash.printTreeNode();
        String[] keys = {"太阳", "月亮", "星星"};
        for(int i=0; i<keys.length; i++)
            System.out.println("[" + keys[i] + "]的hash值为" + consistentHash.hash(keys[i],0)
                    + ", 被路由到结点[" + consistentHash.selectNode(keys[i]) + "的hash值"
                    +consistentHash.hash(consistentHash.selectNode(keys[i]),0)+ "]");
    }

    @Test
    public void test(){
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

        // populating tree map
        treemap.put(2, "two");
        treemap.put(1, "one");
        treemap.put(3, "three");
        treemap.put(6, "six");
        treemap.put(5, "five");
        treemap.forEach((k,v)->{
            System.out.println(k+".."+v);
        });
        System.out.println("Ceiling entry for 4: "+ treemap.ceilingEntry(4));
        System.out.println("Ceiling entry for 5: "+ treemap.ceilingEntry(5));
    }
}
