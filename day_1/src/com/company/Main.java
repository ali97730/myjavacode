package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the table number you want to see :");
	int tablenumber = scanner.nextInt();
	scanner.nextLine();
        System.out.println("The table number of " + tablenumber +  " is given below");
        scanner.close();
        int i,j;
        for(i = 0; i<10;i++)
        {
            j=i+1;
            System.out.println(tablenumber + "*"  + j + "=" + tablenumber*j );
        }

    }
}
