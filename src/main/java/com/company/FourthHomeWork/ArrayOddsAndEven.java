package com.company.FourthHomeWork;

import java.util.ArrayList;

public class ArrayOddsAndEven {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(11);
        arr.add(13);
        arr.add(4);
        arr.add(2);

        System.out.println(arr);
        int sumOdd = 0;
        int sumEven = 0;

        for(int i = 0; i < arr.size(); i ++) {
            if(arr.get(i) %2 != 0){
                sumOdd += arr.get(i);
            }
        }
        System.out.println("The sum of the Odds is: " + sumOdd);

        for (int a = 0; a < arr.size(); a ++) {
            if (arr.get(a) %2 == 0) {
                sumEven += arr.get(a);
            }
        }
        System.out.println("The sum of the Odds is: " + sumEven);
    }
}
