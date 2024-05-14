package com.programpractice.demo;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n");
        Scanner r=new Scanner(System.in);
        n= r.nextInt();

        for (int i=1;i<=n;i++){
            if(i%2==0){
            System.out.println("Even "+ i);

        }else{
                System.out.println("Odd "+i);
            }
            }

    }
}
