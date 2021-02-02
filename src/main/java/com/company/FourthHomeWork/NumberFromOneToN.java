package com.company.FourthHomeWork;

import java.util.Scanner;

public class NumberFromOneToN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your parameter: ");
        int number = scanner.nextInt();
        int i = 0;

        while (i <= number) {
            System.out.println(i);
            i++;
        }
    }
}
