package cn.chenghuan.stack;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 程欢
 * @Description 栈工具
 * @Date 2019/6/14 21:23
 */
public class ArrayUtils {

    /**
     * 判断字符串括号是否匹配(自己实现的栈)
     * @param s
     * @return boolean
     */
     public static boolean isValid(final String s){
        final ArrayStack<Character> arrayStack = new ArrayStack<>(10);
        final Map<Character,Character> characterMap = new HashMap<>();
        //字符串转字符数组
        final char[] chars = s.toCharArray();
        characterMap.put(')','(');
        characterMap.put('}','{');
        characterMap.put(']','[');
        for (int i=0;i<chars.length;i++){
            if(!characterMap.containsKey(chars[i])){
                 //如果是左括号，则入栈
                arrayStack.push(chars[i]);
            }else{
               if(arrayStack.isEmpty()||characterMap.get(chars[i])!=arrayStack.pop()){
                   return false;
               }
            }
        }
        //字符串遍历完毕后，如果栈为空返回true，反之返回false
        return true;
     }
}
