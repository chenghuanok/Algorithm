package cn.struct.algorithm.hash;

/**
 * @author chenghuan
 * @Description 哈希Main
 * @Date 2019/7/21 20:46
 */
public class HashMain {

    public static void main(String[] args){
        final DHashMap<Integer,String> hashKeyValue = new DHashMap<>();
        hashKeyValue.put(12,"chenghuan");
        final String value = hashKeyValue.get(12);
        System.out.println(value);
        hashKeyValue.put(12,"xuwenzhu");
        final String value2 = hashKeyValue.get(12);
        System.out.println(value2);
    }
}
