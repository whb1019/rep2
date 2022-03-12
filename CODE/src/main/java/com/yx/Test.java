package com.yx;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        //System.out.println( getValue());
        System.out.println(getValue());
        //System.out.println("hahaha");
    }

    public static int getValue() {
        /*String  a  = "10";
        String b   = "M";
         String newRate="";
        if("K".equals(b)){
            DecimalFormat df  = new DecimalFormat("###########.####");
            newRate = df.format(Float.parseFloat(a)/1024);
        }else if("G".equals(b)){
            newRate = ""+ Long.parseLong(a)*1024 ;
        }else if("M".equals(b)){
            newRate=a;
        }*/


        int a = 10;
        int b = 2;


        return a/b;

    }
}
