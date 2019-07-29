package cn.struct.algorithm.hash;

/**
 * @author chenghuan
 * @Description 哈希Main
 * @Date 2019/7/21 20:46
 */
public class HashMain {
    public static void main(String[] args){
//        final DHashMap<Integer,String> hashKeyValue = new DHashMap<>();
//        hashKeyValue.put(12,"chenghuan");
//        final String value = hashKeyValue.get(12);
//        System.out.println(value);
//        hashKeyValue.put(22,"xuwenzhu");
//        final String value2 = hashKeyValue.get(22);
//        System.out.println(value2);
//        hashKeyValue.put(13,"xiaolan");
//        final String value3 = hashKeyValue.get(13);
//        System.out.println(value3);
//        hashKeyValue.put(12,"xiaobai");
//        final String value4 = hashKeyValue.get(12);
//        System.out.println(value4);
          final boolean flag = MapUtil.isValidAnaGram("cat","mac");
          if(flag){
              System.out.println("有效的字母异位");
          }else{
              System.out.println("无效的字母异位");
          }
    }
}
