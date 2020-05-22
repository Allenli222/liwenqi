package com.block3;

public class Intersection {

    public Intersection(String s1, String s2) {
        //定义两个字符串，并将其中较小的字符串赋给min
        String max = (s1.length() > s2.length()) ? s1 : s2;
        String min = (max == s1) ? s2 : s1;
        //使用双重for循环进行最大子串的判断
        outer:for (int i = 0; i < min.length(); i++) {
            for (int j = 0 ,x = min.length() - i; x != min.length() + 1; j++,x++) {
                String s3 = s2.substring(j,x);
                if (max.contains(s3)) {
                    System.out.println("最大字串为：" + s3);
                    break outer;
                }
            }
        }
    }

    public static void main(String[] args) {
        //测试特定字符串的最大子串
     Intersection i = new Intersection("asdafghjka","aaasdfg");
    }
}
