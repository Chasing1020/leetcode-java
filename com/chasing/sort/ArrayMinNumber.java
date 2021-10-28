package com.chasing.sort;

import org.junit.Test;

import java.util.Arrays;


public class ArrayMinNumber {
    @Test
    public void TestString(){
        System.out.println("32".compareTo("3"));
    }
    public static void main(String[] args) {
        System.out.println(minNumber(new int[]{3, 30, 34,59}));

    }

    public static String minNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        String[] newArray = new String[nums.length];
        int i = 0;
        for (int value : nums) {
            newArray[i++] = String.valueOf(value);
            System.out.println(newArray[i-1]);
        }
        Arrays.sort(newArray,
                (a,b)->((a+b).compareTo(b+a))
                );
        for (String num: newArray){
            sb.append(num);
        }
        return sb.toString();
    }
}
