package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	int n=6;
	int j,i;
	//pattern 1
        System.out.println("1.)");
	        for( i=1;i<=n;i++){
	               for( j=1;j<=i;j++){
             System.out.print("* ");
                      }
               System.out.println();
              }
        System.out.println("2.)");

	//pattern 2
         for( i=1;i<=n;i++){
            for( j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //PATTERN 3
        System.out.println("3.)");

            for(i=1;i<=n;i++){
                for(j=1;j<=n-i;j++) {
                 System.out.print(" ");
                }
                 for(j=1;j<=i;j++){
                     System.out.print("*");
                 }
                System.out.println();
             }

         }

    }

