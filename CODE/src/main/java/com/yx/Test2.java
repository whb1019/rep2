package com.yx;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        /*

        * 测试输入流
        Scanner scanner = new Scanner(System.in);
        System.out.println("what's your name?");
        //输入下一行的内容
        String firstname = scanner.nextLine();
        System.out.println("how old are you?");
        int age = scanner.nextInt();
        System.out.println("你好"+firstname+"你今年"+age+"了");*/

        /*for (int i=10;i>0;i--){
            System.out.println(i);
        }
        System.out.println("游戏结束！");*/


        int[] a={10,20,30,40,50};
        //a 代表集合
        for(int b:a){
            System.out.println(b);
        }

        System.out.println("=================================");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("xiaoming");
        arrayList.add("xiahong");
        arrayList.add("xiaobai");
        for(String x:arrayList){
            System.out.println(x);
        }
    }





}
