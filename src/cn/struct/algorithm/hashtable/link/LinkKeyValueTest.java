package cn.struct.algorithm.hashtable.link;

import org.junit.jupiter.api.Test;

/**
 * 测试
 * @Author: chenghuan
 * @Date: 2019/10/7 21:37
 */
public class LinkKeyValueTest {

    @Test
    public void addFirst(){
      final LinkKeyValue linkKeyValue = new LinkKeyValue();
      linkKeyValue.addFirst("123","a");
      linkKeyValue.addFirst("456","b");
      linkKeyValue.addFirst("789","c");
      linkKeyValue.printLinkedList(null);
    }

    @Test
    public void isExist(){
        final LinkKeyValue linkKeyValue = new LinkKeyValue();
        linkKeyValue.addFirst("123","a");
        linkKeyValue.addFirst("456","b");
        linkKeyValue.addFirst("789","c");
        final boolean flag = linkKeyValue.isExist("222");
        System.out.println(flag);
    }

    @Test
    public void delete(){
        final LinkKeyValue linkKeyValue = new LinkKeyValue();
        linkKeyValue.addFirst("123","a");
        linkKeyValue.addFirst("456","b");
        linkKeyValue.addFirst("789","c");
        linkKeyValue.delete("789");
        linkKeyValue.printLinkedList(null);
    }

    @Test
    public void get(){
        final LinkKeyValue linkKeyValue = new LinkKeyValue();
        linkKeyValue.addFirst("123","a");
        linkKeyValue.addFirst("456","b");
        linkKeyValue.addFirst("789","c");
        final String value = (String) linkKeyValue.get("222");
        System.out.println(value);
    }
}
