package com.practice;

import java.util.Random;

//需求：双色球模拟
public class test1 {
    public static void main(String[] args) {

            //随机一组六个号码（1-33）红球（不能重复），一个号码（1-16）蓝球，采用数组装起来作为中奖号码

        int[] lucknumber = creatLuckNumber();


    }
    //确立三种方法
    //1。随机一组中奖号码返回
    public static int[] creatLuckNumber(){
        int[] numbers= new int[7];
        Random r = new Random();
        //遍历数组，为每个位置生成对应的号码
        for (int i=0;i<numbers.length-1;i++){
            while (true){
                int data = r.nextInt(33)+1;
                //定义一个变量，判断这个数字之前是否出现过，出现过要重新随机一个，直到不重复为止，才可以存到数组中
                //定义一个flag变量，默认没有重复的号码
                boolean flag = true;
                for (int j = 0; j<i; j++){
                    if (numbers[j] == data){
                        flag =false;
                        break;
                    }
                }
                if (flag){
                    numbers[i]=data;
                    break;
                }

            }
            numbers[numbers.length-1]= r.nextInt(16)+1;
            return numbers;
        }
    }
    //2。用户输入一组双色球号码返回

    //3。输入两组号码，判断用户中奖情况


}
