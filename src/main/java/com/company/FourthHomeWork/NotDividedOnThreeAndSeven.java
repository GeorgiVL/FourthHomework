package com.company.FourthHomeWork;

import javax.swing.plaf.synth.SynthMenuBarUI;
import java.util.Scanner;

public class NotDividedOnThreeAndSeven {

    public static void main(String[] args) {
        NotDividedOnThreeAndSeven();
    }

    public static void NotDividedOnThreeAndSeven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number: ");
        int num = scanner.nextInt();
        int a = 0;

        for(int i = 0; i < num; i++){
            if(i % 3 != 0 && i % 7 != 0) {
                System.out.println(i);
            }
        }
    }
}
