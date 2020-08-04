package com.company;

public class Main {

    public static void main(String[] args) {
	//pattern1
        //points to remember 1.) fro space in front i-1 3.) for that use j<rows-i+1//
        System.out.println("1.)");
        int i,j;
        int n=6;
        for(i =1;i<=n;i++){

                for(j=1;j<=n-i;j++){
                    System.out.print("  ");
                }
                for(j=1;j<=i;j++){
                    System.out.print("*   ");
                }
            System.out.println();
        }

        // pattern 2
        int num=1;
        System.out.println("2.)");
        for(i =1;i<=n;i++){

            for(j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print(num+"  ");
                num=num+2;
            }
            System.out.println();
        }
        //pattern3
        System.out.println("3.)");
         int rows = 2*n-1;
         for(i=1;i<=rows;i++){

             if(i<=n) {
                 for (j = 1; j <= i; j++) {
                     System.out.print("* ");
                 }
             }
             else{
                 for (j=1;j<=rows-i+1;j++)
                 {
                     System.out.print("* ");
                 }
             }
             System.out.println();

         }

         //pattern4
        System.out.println("4.)");
        System.out.println("*");

        for(i=2;i<=n-1;i++){
            System.out.print("* ");
            for(j=1;j<=i-2;j++){
                System.out.print("  ");
            }
            System.out.print(" *");
            System.out.println();

        }
        for(i=1;i<=n;i++){
            System.out.print("* ");
        }
    }
}
