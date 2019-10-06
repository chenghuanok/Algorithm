package cn.struct.algorithm.hashtable.linear;

import org.junit.jupiter.api.Test;

/**
 * 测试
 * @Author: chenghuan
 * @Date: 2019/10/6 22:56
 */
public class LinearHashTableTest {

    @Test
    public void put(){
      final LinearHashTable<String,String> linearHashTable = new LinearHashTable<>(10);
      linearHashTable.put("2","xiaocheng");
      linearHashTable.put("5","xiaoxu");
      linearHashTable.put("8","xiaobai");
      linearHashTable.printLinearHashTable();
    }

    @Test
    public void get(){
        final LinearHashTable<String,String> linearHashTable = new LinearHashTable<>(10);
        linearHashTable.put("2","xiaocheng");
        linearHashTable.put("5","xiaoxu");
        linearHashTable.put("8","xiaobai");
        final String value = linearHashTable.get("12");
        System.out.println(value);
    }

    @Test
    public void delete(){
        final LinearHashTable<String,String> linearHashTable = new LinearHashTable<>(10);
        linearHashTable.put("2","xiaocheng");
        linearHashTable.put("5","xiaoxu");
        linearHashTable.put("8","xiaobai");
        linearHashTable.delete("5");
        linearHashTable.printLinearHashTable();
    }
}
