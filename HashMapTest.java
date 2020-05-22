package com.block3;

import java.util.Map;
import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        //准备HashMap集合并添加数字字符串元素
        Map m1 = new HashMap();
        m1.put(1,"123");
        m1.put(2,"456");
        m1.put(3,"789");
        m1.put(4,"123");
        m1.put(5,"456");
        //声明计数变量
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        //for循环分别判断数字字符串分别出现了几次
        for(int i = 1; i < 6; i++){
            if(m1.get(1) == m1.get(i)){
                count1++;
            }
            if(m1.get(2) == m1.get(i)){
                count2++;
            }
            if(m1.get(3) == m1.get(i)){
                count3++;
            }
        }
        //打印数字字符串计数结果
        System.out.println("字符串" + m1.get(1) + "出现了" + count1 + "次");
        System.out.println("字符串" + m1.get(2) + "出现了" + count2 + "次");
        System.out.println("字符串" + m1.get(3) + "出现了" + count3 + "次");
    }
}
