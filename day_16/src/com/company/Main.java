package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int m,n,a=0,ans=0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of the number");
        n = s.nextInt();
        System.out.println("enter the number you want to make summation");
        m = s.nextInt();

        for(int i=0; i<n;i++){
            a=m%10;
             m=m/10;
            ans =ans+a;
        }
        System.out.println(ans);


    }
}
