package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //BUBBLE SHORT
        int scoreoftheweek[];
        scoreoftheweek = new int[10];
        int n = 0;
        Scanner entry = new Scanner(System.in);
        read:
        System.out.println("enter 1 for entry of records \n " +
                "enter 2 for getting the highest record \n " +
                "enter 3 for exit \n");
        n = entry.nextInt();
        entry.nextLine();
        int i;
        switch (n)
        {
            case 1: for(i=0 ; i<7 ; i++){
                System.out.println("week" + (i+1));
                scoreoftheweek[i] = entry.nextInt();
                entry.nextLine();
            }

            case 2:
                int best = scoreoftheweek[0];
                for( i = 1 ; i<7 ; i++)
                {
                    if(scoreoftheweek[i] > best){

                        best = scoreoftheweek[i];
                    }

                }
                System.out.println("the best record is " + best);
            case 3:
                System.out.println("Exiting");
                break;
            default:

                System.out.println("invalid input");
            break;
        }
        entry.close();
    }
}
