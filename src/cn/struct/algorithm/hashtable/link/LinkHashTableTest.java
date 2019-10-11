package cn.struct.algorithm.hashtable.link;

import org.junit.jupiter.api.Test;

/**
 * 测试
 * @Author: chenghuan
 * @Date: 2019/10/7 21:36
 */
public class LinkHashTableTest {

    @Test
    public void put(){
       final LinkHashTable<String,String> linkHashTable = new LinkHashTable<>(3);
       linkHashTable.put("1","a");
       linkHashTable.put("2","b");
       linkHashTable.put("3","c");
       linkHashTable.put("4","d");
       linkHashTable.put("5","e");
       //linkHashTable.put("1","e");
       linkHashTable.printLinkHashTable();
        System.out.println("散列表中元素个数"+linkHashTable.getSize());
       linkHashTable.printOldLinkHashTable();
        System.out.println("旧散列表中元素个数"+linkHashTable.getOldSize());

    }

    @Test
    public void get(){
        final LinkHashTable<String,String> linkHashTable = new LinkHashTable<>(3);
        linkHashTable.put("1","a");
        linkHashTable.put("2","b");
        linkHashTable.put("3","c");
        linkHashTable.put("4","d");
        linkHashTable.put("5","e");
        final String value = linkHashTable.get("5");
        System.out.println(value);
    }

}
