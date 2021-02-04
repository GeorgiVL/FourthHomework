package com.company.FourthHomeWork;

public class Fibunachi {
    public static void main(String[] args) {

        // Fibunachi :)
        int a = 0;
        int b = 1;
        int c;
        int printNumbers = 15;
        int sum = 0;
        System.out.println(a + " " + b);

        for(int i = 2; i < printNumbers; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            sum += c;
        }
        System.out.println(" The current sum is: " + sum);

    }
}
