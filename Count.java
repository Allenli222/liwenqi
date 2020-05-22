package com.block3;

public class Count {
    public static void main(String[] args) {
        //声明记录个数的变量
        int countUpper = 0;
        int countLower = 0;
        int countInt = 0;
        int countOther = 0;
        //创建字符串对象
        String str = new String("ABCD123!@#$%ab");
        //for循环记录出现字符的个数
        for (int i = 0; i < str.length(); i++) {
            //判断大写字母出现个数并记录
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                countUpper++;
                //判断数字出现个数并记录
            }else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                countInt++;
                //判断小写字母出现个数并记录
            }else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                countLower++;
                //判断其他字符出现个数并记录
            }else{
                countOther++;
            }
        }
        //打印所有字符的个数
        System.out.println("大写字母个数：" + countUpper);
        System.out.println("小写字母个数：" + countLower);
        System.out.println("数字字符个数：" + countInt);
        System.out.println("其他字符个数：" + countOther);
    }

}
