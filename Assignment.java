package com.apnacollege;

//Write a program that prompts the user to input five integers and then calculates and displays their sum.

import java.util.Scanner;

public class Assignment {
    public static void main(String[]args) {

        int a,b,c,d,e;
        System.out.println("Enter Five integers to calculate their sum : ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        e = in.nextInt();

        int sum = a + b + c + d + e ;
        System.out.println("Sum of integer = "+sum);
    }
}
