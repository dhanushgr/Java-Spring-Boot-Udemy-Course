package org.dhanush.Junit;

public class MyMath {
    public int CalculateSum(int[] numbers){
        int sum = 0;
        for (int num:numbers){
            sum = sum + num;
        }
    return sum;
    }
}
