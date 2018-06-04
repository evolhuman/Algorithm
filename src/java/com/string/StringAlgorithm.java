package com.string;

import java.io.File;

/**
 * @Program: Algorithm
 * @Description: Algorithm about String
 * @Author: Aislingo
 * @CreateDate: 2018-04-26 15:29
 **/
public class StringAlgorithm {


    public String LeftShiftStringOnce(String s){

        int length = s.length();
        String firstString = s.substring(0,1);
        String tempString = s.substring(1);
        tempString = tempString.concat(firstString);
        return tempString;
    }


//    public String LeftShiftString(String s,int times){
//
//        String temp = s;
//        for (int i = 0; i < times; i++){
//            temp = LeftShiftStringOnce(temp);
//        }
//        return temp;
//    }

    public String LeftShiftString(String s, int times){
        String temp = s;
        String firstString = temp.substring(0,times);
        String tempString = temp.substring(times);
        tempString = tempString.concat(firstString);
        return tempString;
    }


    public static void main(String[] args) {
        StringAlgorithm stringAlgorithm = new StringAlgorithm();
        long startTime = System.currentTimeMillis();
        for (int i = 0;i<100000000;i++){
            stringAlgorithm.LeftShiftString("abcdefg",4);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");
    }

}
