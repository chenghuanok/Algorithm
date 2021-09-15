package cn.struct.algorithm.hashtable.simple;

import org.junit.Test;

/**
 * 测试
 * @Author: chenghuan
 * @Date: 2019/10/5 22:04
 */
public class SimpleHashTableTest {

    @Test
    public void put(){
      final SimpleHashTable<String,String> simpleHashTable = new SimpleHashTable<>(20);
      simpleHashTable.put("051111","xiaocheng");
      simpleHashTable.put("051114","xiaoxu");
      simpleHashTable.put("051118","xiaobai");
      simpleHashTable.put("051116","xiaolan");
      simpleHashTable.printSimpleHashTable();
    }

    @Test
    public void get(){
        final SimpleHashTable<String,String> simpleHashTable = new SimpleHashTable<>(20);
        simpleHashTable.put("051111","xiaocheng");
        simpleHashTable.put("051118","xiaobai");
        final String value = simpleHashTable.get("051118");
        System.out.println(value);
    }
}
