package com.programpractice.demo;

import java.util.Scanner;
          // Sum of first n Numbers//
public class first {

    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter the value of n");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=0;i<= n;i++){
            sum=sum+i;
        }
        System.out.println("Addition  " + sum);
    }
}
