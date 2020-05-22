package com.block3;

import java.util.*;

public class Landlords {
    public static void main(String[] args) {

        //创建HashMap集合存储扑克牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建List集合存储扑克牌索引
        ArrayList pokerIndex = new ArrayList();
        //定义两个集合存储花色和索引
        String[] Colors = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] Numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        int index = 0;
        //存储大王
        poker.put(index,"BigJoker");
        pokerIndex.add(index);
        index++;
        //存储小王
        poker.put(index,"LittleJoker");
        pokerIndex.add(index);
        index++;
        //存储其余52张牌
        for(String color:Colors){
            for(String number:Numbers){
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
        //使用shuffle模拟洗牌
        Collections.shuffle(pokerIndex);
        //定义四个集合存储玩家牌和底牌的索引
        ArrayList player1 = new ArrayList();
        ArrayList player2 = new ArrayList();
        ArrayList player3 = new ArrayList();
        ArrayList hiddenCards = new ArrayList();
        //判断并进行发牌
        for(int i = 0; i < pokerIndex.size(); i++){
            Integer in = (Integer) pokerIndex.get(i);
            //先判断是否是底牌
            if(i >= 51){
                hiddenCards.add(in);
            }else if(i%3 == 0){
                player1.add(in);
            }else if(i%3 == 1){
                player2.add(in);
            }else if(i%3 == 2){
                player3.add(in);
            }
        }
        //利用HashMap特性以及sort方法排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        //查看玩家1手中的牌
        System.out.print("player1: ");
        for(Object key: player1){
            String Vaule = poker.get(key);
            System.out.print(Vaule + " ");
        }
        System.out.println();
        //查看玩家2手中的牌
        System.out.print("player2: ");
        for(Object key: player2){
            String Vaule = poker.get(key);
            System.out.print(Vaule + " ");
        }
        System.out.println();
        //查看玩家3手中的牌
        System.out.print("player3: ");
        for(Object key: player3){
            String Vaule = poker.get(key);
            System.out.print(Vaule + " ");
        }
        System.out.println();
        //查看底牌
        System.out.print("hiddenCards: ");
        for(Object key: hiddenCards){
            String Vaule = poker.get(key);
            System.out.print(Vaule + " ");
        }
        System.out.println();

    }
}
