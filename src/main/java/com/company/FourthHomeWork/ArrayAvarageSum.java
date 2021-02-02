package com.company.FourthHomeWork;

public class ArrayAvarageSum {
    public static void main(String[] args) {

        double arr[] = {12.23,45.65,76.6,34.74,76,22,45,66,7,7,8,22,3,1};
        double avarageSum = 0;

        for(int i = 0; i < arr.length; i ++) {
            avarageSum += arr[i] / arr.length;
        }
        System.out.println("The avarage sum is: " + avarageSum);
    }
}
