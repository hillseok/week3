package com.example.week3.Service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Week3Service {

    public String generateArray(){
        int[] array = new int[1000];
        Random random = new Random();
        long begin = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            int j = i - 1;
            int previousInt = j == -1 ? 0 : array[j];
            // 当前元素的值=上一个元素的值+随机的0或1+2
            array[i] = previousInt + random.nextInt(2) + 2;
        }
        long end = System.nanoTime();
        String returnValue = "";
        for (int i = 0; i < 1000; i++){
            returnValue += array[i];
            returnValue += " ";
        }
        returnValue += "耗时";
        returnValue += end - begin;
        returnValue += "纳秒";
        return returnValue;
    }
}
